package com.example.mini_gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val emailList = listOf(
            Email("N", "Newsletter", "Discover Exciting Web Design Trends", "Stay ahead with the latest in web design...", "1:00 PM"),
            Email("R", "Rachel Green", "Maximize Your Email Marketing", "Tips to improve your email campaigns...", "11:45 AM"),
            Email("F", "FutureLearn", "Join Our Free Graphic Design Workshop", "Dive into design with industry experts...", "10:15 AM"),
            Email("A", "Admin", "Important Account Notification", "Action required for your account security...", "9:50 AM"),
            Email("B", "Ben from Tech Solutions", "Upgrade Your Tech Skills Today", "New courses available for skill enhancement...", "8:30 AM")
        )


        val adapter = EmailAdapter(emailList)
        recyclerView.adapter = adapter
    }
}
