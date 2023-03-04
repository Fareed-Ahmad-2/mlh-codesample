package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class CseSem2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cse_sem2)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)

        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)


        val psClick = findViewById<ImageView>(R.id.probability)
        val apClick = findViewById<ImageView>(R.id.physics)
        val engClick = findViewById<ImageView>(R.id.english)
        val ppdsClick = findViewById<ImageView>(R.id.python)
        val edClick = findViewById<ImageView>(R.id.drawing)
        val engLabClick = findViewById<ImageView>(R.id.englab)
        val apLabClick = findViewById<ImageView>(R.id.aplab)
        val egClick = findViewById<ImageView>(R.id.eg)
        val ppdsLabClick = findViewById<ImageView>(R.id.ppdslab)

        psClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cse"
            val sem = "sem2"
            val sub = "ps"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        apClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cse"
            val sem = "sem2"
            val sub = "ap"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        engClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cse"
            val sem = "sem2"
            val sub = "eng"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ppdsClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cse"
            val sem = "sem2"
            val sub = "ppds"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        edClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cse"
            val sem = "sem2"
            val sub = "ed"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        engLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "cse"
            val sem = "sem2"
            val sub = "englab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        apLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "cse"
            val sem = "sem2"
            val sub = "aplab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        egClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "cse"
            val sem = "sem2"
            val sub = "eg"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ppdsLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "cse"
            val sem = "sem2"
            val sub = "ppdslab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}