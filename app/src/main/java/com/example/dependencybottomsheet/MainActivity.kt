package com.example.dependencybottomsheet

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intent: Intent? = null
        try {
            intent = Intent(
                this,
                Class.forName("com.example.tray.Check")
            )
            intent.putExtra("KEY","https://test-apis.boxpay.tech/v0/checkout/sessions/6cf8526f-1694-4bff-93dc-b7e1c08c15d9")
            startActivity(intent)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
    }
}