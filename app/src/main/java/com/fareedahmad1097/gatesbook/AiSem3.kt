package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class AiSem3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_sem3)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)


        val dmgtClick = findViewById<ImageView>(R.id.dmgt)
        val demClick = findViewById<ImageView>(R.id.dem)
        val dsaClick = findViewById<ImageView>(R.id.dsa)
        val javaClick = findViewById<ImageView>(R.id.java)
        val coClick = findViewById<ImageView>(R.id.co)
        val webClick = findViewById<ImageView>(R.id.web)
        val demLabClick = findViewById<ImageView>(R.id.demlab)
        val dsaLabClick = findViewById<ImageView>(R.id.dsalab)
        val javaLabClick = findViewById<ImageView>(R.id.javalab)
        val uhvClick = findViewById<ImageView>(R.id.uhv)

        dmgtClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem3"
            val sub = "dmgt"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        demClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem3"
            val sub = "demp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dsaClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem3"
            val sub = "adsa"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        javaClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem3"
            val sub = "java"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        coClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem3"
            val sub = "co"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        webClick.setOnClickListener{
            val intent = Intent(this, lab::class.java)
            val branch = "cai"
            val sem = "sem3"
            val sub = "web"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        demLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "cai"
            val sem = "sem3"
            val sub = "demlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dsaLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "cai"
            val sem = "sem3"
            val sub = "dsalab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        javaLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "cai"
            val sem = "sem3"
            val sub = "javalab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        uhvClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem3"
            val sub = "uhv"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}