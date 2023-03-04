package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class DsSem3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ds_sem3)

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
        val ppdsClick = findViewById<ImageView>(R.id.python)
        val coClick = findViewById<ImageView>(R.id.co)
        val handoopClick = findViewById<ImageView>(R.id.handoop)
        val demLabClick = findViewById<ImageView>(R.id.demlab)
        val dsaLabClick = findViewById<ImageView>(R.id.dsalab)
        val ppdsLabClick = findViewById<ImageView>(R.id.ppdslab)
        val esClick = findViewById<ImageView>(R.id.es)

        dmgtClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "dmgt"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        demClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "demp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dsaClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "adsa"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ppdsClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "app"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        coClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "co"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        handoopClick.setOnClickListener{
            val intent = Intent(this, units::class.java)
            val sub = "handoop"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        demLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "demlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dsaLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "dsalab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ppdsLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "applab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        esClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "uhv"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}