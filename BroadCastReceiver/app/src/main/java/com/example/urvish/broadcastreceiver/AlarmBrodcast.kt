package com.example.urvish.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class AlarmBrodcast : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("MyRec","Alarm Fired!!!")
        Toast.makeText(context,"Alarm fired",Toast.LENGTH_LONG).show()
    }
}
