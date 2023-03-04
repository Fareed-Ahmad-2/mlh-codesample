package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class EeeSem1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eee_sem1)

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
        val fecClick = findViewById<ImageView>(R.id.fec)
        val edClick = findViewById<ImageView>(R.id.drawing)
        val egClick = findViewById<ImageView>(R.id.eg)
        val apLabClick = findViewById<ImageView>(R.id.aplab)
        val engLabClick = findViewById<ImageView>(R.id.englab)
        val fecLabClick = findViewById<ImageView>(R.id.feclab)



        engClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "eng"
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

        lacClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "lac"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        fecClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "fec"
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

        fecLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "feclab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}