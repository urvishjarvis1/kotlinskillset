package com.example.urvish.broadcastreceiver

import android.content.ComponentName
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var myReceiver: MyReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myReceiver= MyReceiver()
         val receiver= ComponentName(this,MyReceiver::class.java)
        this.packageManager.setComponentEnabledSetting(receiver,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)
    }

    override fun onResume() {
        super.onResume()
        val filter= listOf<String>(Intent.ACTION_POWER_CONNECTED,Intent.ACTION_POWER_DISCONNECTED,Intent.ACTION_BOOT_COMPLETED)
        var intentFilter=IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        filter.forEach{
            intentFilter.addAction(it)
        }
        registerReceiver(myReceiver,intentFilter)

    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(myReceiver)
    }
}
