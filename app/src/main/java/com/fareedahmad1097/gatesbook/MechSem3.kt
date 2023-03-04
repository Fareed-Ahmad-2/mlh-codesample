package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MechSem3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_sem3)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)


        val cvtClick = findViewById<ImageView>(R.id.cvt)
        val mmClick = findViewById<ImageView>(R.id.mm)
        val tdClick = findViewById<ImageView>(R.id.td)
        val mpClick = findViewById<ImageView>(R.id.mp)
        val fmhmClick = findViewById<ImageView>(R.id.fmhm)
        val mpLabClick = findViewById<ImageView>(R.id.mplab)
        val mmLabClick = findViewById<ImageView>(R.id.mmlab)
        val fmhmLabClick = findViewById<ImageView>(R.id.fmhmlab)
        val esClick = findViewById<ImageView>(R.id.es)
        val adpClick = findViewById<ImageView>(R.id.adp)

        cvtClick.setOnClickListener {
            val intent = Intent(this, units::class.java)

            val sub = "cvt"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        mmClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "mm"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        tdClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "td"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        mpClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "mp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        fmhmClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "fmhm"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        mpLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "mplab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        mmLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "mmlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        fmhmLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "fmhmlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        esClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "es"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        adpClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "adp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}