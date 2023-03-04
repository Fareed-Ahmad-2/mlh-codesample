package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class AiSem5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_sem5)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)

        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val seClick = findViewById<ImageView>(R.id.se)
        val mlClick = findViewById<ImageView>(R.id.ml)
        val dlClick = findViewById<ImageView>(R.id.dl)
        val pec1Click = findViewById<ImageView>(R.id.pec1)
        val oec1Click = findViewById<ImageView>(R.id.oec1)
        val dlLabClick = findViewById<ImageView>(R.id.dllab)
        val mlLabClick = findViewById<ImageView>(R.id.mllab)
        val webClick = findViewById<ImageView>(R.id.web)

        seClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "seai"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        mlClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "ml"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dlClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "dl"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        pec1Click.setOnClickListener{
            val intent = Intent(this, units::class.java)
            val sub = "3pec1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        oec1Click.setOnClickListener{
            val intent = Intent(this, units::class.java)
            val sub = "3oec1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dlLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "dllab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        mlLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "mllab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        webClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "wad"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

    }
}