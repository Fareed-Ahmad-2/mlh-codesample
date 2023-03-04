package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class DsSem5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ds_sem5)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val dmtClick = findViewById<ImageView>(R.id.dmt)
        val aiClick = findViewById<ImageView>(R.id.ai)
        val fdaClick = findViewById<ImageView>(R.id.fda)
        val pec1Click = findViewById<ImageView>(R.id.pec1)
        val oec1Click = findViewById<ImageView>(R.id.oec1)
        val dmtLabClick = findViewById<ImageView>(R.id.dmtlab)
        val aiLabClick = findViewById<ImageView>(R.id.ailab)
        val dsmmClick = findViewById<ImageView>(R.id.dsmm)

        dmtClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "dmt"
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

        fdaClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "fda"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        pec1Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "7pec1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        oec1Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "7oec1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dmtLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "dmtlab"
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

        dsmmClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "dsmm"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

    }
}