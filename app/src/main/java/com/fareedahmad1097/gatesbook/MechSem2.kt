package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MechSem2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_sem2)

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
        val devcClick = findViewById<ImageView>(R.id.devc)
        val materialClick = findViewById<ImageView>(R.id.material)
        val edClick = findViewById<ImageView>(R.id.drawing)
        val egClick = findViewById<ImageView>(R.id.eg)
        val uhvClick = findViewById<ImageView>(R.id.uhv)
        val apLabClick = findViewById<ImageView>(R.id.aplab)
        val engLabClick = findViewById<ImageView>(R.id.englab)
        val materialLabClick = findViewById<ImageView>(R.id.materiallab)


        engClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "eng"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        uhvClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "uhv"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        apClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "ap"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        devcClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "devc"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        materialClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "material"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        edClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "ed"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        egClick.setOnClickListener{
            val intent = Intent(this, lab::class.java)
            val sub = "eg"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        apLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "aplab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        engLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "englab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        materialLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "materiallab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}