package com.example.coffeehouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class UserDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details)

        val letsGo : TextView = findViewById(R.id.tv_letsGo)
        val userName : EditText = findViewById(R.id.et_name)
        val userMobileNumber : EditText = findViewById(R.id.et_mobileNumber)

        letsGo.setOnClickListener{
            if(userName.text.isEmpty() || userMobileNumber.text.isEmpty()){
                Toast.makeText(this, "Please enter your details", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}