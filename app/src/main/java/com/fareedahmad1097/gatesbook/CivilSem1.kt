package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class CivilSem1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_civil_sem1)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)

        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)


        val engClick = findViewById<ImageView>(R.id.english)
        val apClick = findViewById<ImageView>(R.id.physics)
        val lacClick = findViewById<ImageView>(R.id.Algebra)
        val beeeClick = findViewById<ImageView>(R.id.beee)
        val edClick = findViewById<ImageView>(R.id.drawing)
        val egClick = findViewById<ImageView>(R.id.eg)
        val apLabClick = findViewById<ImageView>(R.id.aplab)
        val beeeLabClick = findViewById<ImageView>(R.id.beeeLab)
        val engLabClick = findViewById<ImageView>(R.id.englab)

        engClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem1"
            val sub = "eng"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        apClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem1"
            val sub = "ap"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        lacClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem1"
            val sub = "lac"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        beeeClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem1"
            val sub = "beee"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        edClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem1"
            val sub = "ed"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        egClick.setOnClickListener{
            val intent = Intent(this, lab::class.java)
            val branch = "civ"
            val sem = "sem1"
            val sub = "eg"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        apLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "civ"
            val sem = "sem1"
            val sub = "aplab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        beeeLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "civ"
            val sem = "sem1"
            val sub = "beeelab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        engLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "civ"
            val sem = "sem1"
            val sub = "englab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}