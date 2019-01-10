package com.example.urvish.broadcastreceiver

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.SystemClock
import android.util.Log
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    private val TAG="MyRec"
    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG,intent.toString())
        when(intent.action){
            Intent.ACTION_BOOT_COMPLETED->{
                val alarmManager=context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
                val intent=Intent(context,AlarmBrodcast::class.java)
                val pendingIntent=PendingIntent.getBroadcast(context,1,intent,PendingIntent.FLAG_UPDATE_CURRENT)
                alarmManager.set(AlarmManager.ELAPSED_REALTIME,SystemClock.elapsedRealtime(),pendingIntent)
                Toast.makeText(context,"Alarm set",Toast.LENGTH_LONG).show()
            }
        }

        StringBuilder().apply {
            this.append(intent.action)
            this.append(intent.toUri(Intent.URI_INTENT_SCHEME))
            this.toString().also {
                    log-> Log.d("TAG",log)
                Toast.makeText(context,log,Toast.LENGTH_LONG).show()
            }
        }
    }
}
