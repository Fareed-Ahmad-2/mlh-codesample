package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class EeeSem5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eee_sem5)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val oneClick = findViewById<ImageView>(R.id.psa)
        val twoClick = findViewById<ImageView>(R.id.css)
        val threeClick = findViewById<ImageView>(R.id.ms)
        val pec1Click = findViewById<ImageView>(R.id.pec1)
        val oec1Click = findViewById<ImageView>(R.id.oec1)
        val softClick = findViewById<ImageView>(R.id.soft)
        val sevenClick = findViewById<ImageView>(R.id.csslab)
        val eightClick = findViewById<ImageView>(R.id.mslab)

        oneClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "psa"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        twoClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "css"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        threeClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "ms"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        pec1Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "4pec1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        oec1Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "4oec1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        softClick.setOnClickListener{
            val intent = Intent(this, units::class.java)
            val sub = "soft_skills"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        sevenClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "csslab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        eightClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "mslab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }


    }
}