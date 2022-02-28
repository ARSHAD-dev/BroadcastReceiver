package com.example.broadcastreceiver

import android.app.Notification
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    private val action:String="https://www.google.com"
    override fun onReceive(context: Context, intent: Intent) {
    val intentName = intent.action
    if (intentName == action) {
        val s = intent.extras?.getString("data")
        context.toast("Broadcast received!! {$s}")
    }

}

private fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}


}