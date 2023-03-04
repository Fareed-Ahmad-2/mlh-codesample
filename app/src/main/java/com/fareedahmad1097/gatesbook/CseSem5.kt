package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class CseSem5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cse_sem5)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)

        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)
        val cnClick = findViewById<ImageView>(R.id.cn)
        val aiClick = findViewById<ImageView>(R.id.ai)
        val flatClick = findViewById<ImageView>(R.id.flat)
        val pec1Click = findViewById<ImageView>(R.id.pec1)
        val oec1Click = findViewById<ImageView>(R.id.oec1)
        val cnLabClick = findViewById<ImageView>(R.id.cnlab)
        val aiLabClick = findViewById<ImageView>(R.id.ailab)
        val webClick = findViewById<ImageView>(R.id.web)

        cnClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "cn"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        aiClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "ai"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        flatClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "flat"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        pec1Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "1pec1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        oec1Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "1oec1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        cnLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "cnlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        aiLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "ailab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        webClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "awad"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}