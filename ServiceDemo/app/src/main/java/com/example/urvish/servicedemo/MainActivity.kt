package com.example.urvish.servicedemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object {
        public val ACTION_DOWNLOAD = "com.urvish.example.servicedemo.DOWNLOAD"
        public val ACTION_UNABLE = "com.urvish.example.servicedemo.UNABLE"

    }
    private var broadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            when (intent?.action) {
                ACTION_DOWNLOAD -> {
                    Toast.makeText(this@MainActivity, "Download done!", Toast.LENGTH_LONG).show()
                    val url = intent.getStringExtra("URL")
                    Toast.makeText(this@MainActivity, url, Toast.LENGTH_LONG).show()
                }
                ACTION_UNABLE -> {
                    Toast.makeText(this@MainActivity, "File can't be downloaded", Toast.LENGTH_LONG).show()
                }

            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intent=Intent(this,DownloadService::class.java)
        intent.putExtra("URL","http://www.google.com")
        startService(intent)
    }

    override fun onResume() {
        super.onResume()
        registerReceiver(broadcastReceiver, IntentFilter(ACTION_DOWNLOAD))
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(broadcastReceiver)
    }
}
