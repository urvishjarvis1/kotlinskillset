package com.example.urvish.servicedemo

import android.app.IntentService
import android.content.Intent


class DownloadService : IntentService("DownloadService") {

    override fun onHandleIntent(intent: Intent?) {
        var urlPath=intent?.getStringExtra("URL")?.toUpperCase()
        var sendIntent=Intent(MainActivity.ACTION_DOWNLOAD)
        sendIntent.putExtra("URL",urlPath)
        Thread.sleep(10000)
        sendBroadcast(sendIntent)
    }
}
