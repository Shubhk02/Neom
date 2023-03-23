package com.example.neom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import org.w3c.dom.Text

class HomeActivity : AppCompatActivity() {
    private lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findViewById<Button>(R.id.signout).setOnClickListener {
            auth.signOut()
            val intent=Intent(this ,MainActivity::class.java)
            startActivity(intent)
        }
        auth= FirebaseAuth.getInstance()

        val email=intent.getStringExtra("email")
        val displayName=intent.getStringExtra("name")
        findViewById<TextView>(R.id.text).text=email+ "\n" + displayName


    }
}