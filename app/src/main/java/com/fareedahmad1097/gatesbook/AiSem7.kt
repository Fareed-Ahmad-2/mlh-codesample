package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class AiSem7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_sem7)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val pec3Click = findViewById<ImageView>(R.id.pec3)
        val pec4Click = findViewById<ImageView>(R.id.pec4)
        val pec5Click = findViewById<ImageView>(R.id.pec5)
        val he2Click = findViewById<ImageView>(R.id.he2)
        val oec3Click = findViewById<ImageView>(R.id.oec3)
        val oec4Click = findViewById<ImageView>(R.id.oec4)
        val soc5Click = findViewById<ImageView>(R.id.soc5)


        pec3Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "3pec3"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        pec4Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "3pec4"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        pec5Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "3pec5"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        he2Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "3he2"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        oec3Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "3oec3"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        oec4Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "3oec4"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        soc5Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "3soc5"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

    }
}