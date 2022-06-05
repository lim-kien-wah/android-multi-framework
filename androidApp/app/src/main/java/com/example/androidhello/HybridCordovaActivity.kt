package com.example.androidhello


import android.os.Bundle

import org.apache.cordova.CordovaActivity

class HybridCordovaActivity : CordovaActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // enable Cordova apps to be started in the background
        val extras = intent.extras
        if (extras != null && extras.getBoolean("cdvStartInBackground", false)) {
                moveTaskToBack(true)
        }

        // Set by <content src="index.html" /> in config.xml
        loadUrl(launchUrl)
    }
}
