package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class EceSem2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ece_sem2)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)


        val cpdsClick = findViewById<ImageView>(R.id.cpds)
        val chemClick = findViewById<ImageView>(R.id.chemistry)
        val devcClick = findViewById<ImageView>(R.id.devc)
        val edcClick = findViewById<ImageView>(R.id.edc)
        val esClick = findViewById<ImageView>(R.id.es)
        val workshopClick = findViewById<ImageView>(R.id.workshop)
        val itClick = findViewById<ImageView>(R.id.it)
        val cpdsLabClick = findViewById<ImageView>(R.id.cpdsLab)
        val chemLabClick = findViewById<ImageView>(R.id.chemLab)
        val edcLabClick = findViewById<ImageView>(R.id.edclab)

        cpdsClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem2"
            val sub = "cpds"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        chemClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem2"
            val sub = "chem"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        devcClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem2"
            val sub = "devc"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        edcClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem2"
            val sub = "edc"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        esClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem2"
            val sub = "es"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        workshopClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "ece"
            val sem = "sem2"
            val sub = "workshop"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        itClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "ece"
            val sem = "sem2"
            val sub = "it"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        cpdsLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "ece"
            val sem = "sem2"
            val sub = "cpdslab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        chemLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "ece"
            val sem = "sem2"
            val sub = "chemlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        edcLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "ece"
            val sem = "sem2"
            val sub = "edclab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}