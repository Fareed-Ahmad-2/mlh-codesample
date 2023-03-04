package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class DsSem6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ds_sem6)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val oneClick = findViewById<ImageView>(R.id.ml)
        val twoClick = findViewById<ImageView>(R.id.cc)
        val threeClick = findViewById<ImageView>(R.id.dv)
        val pec2Click = findViewById<ImageView>(R.id.pec2)
        val oec2Click = findViewById<ImageView>(R.id.oec2)
        val softClick = findViewById<ImageView>(R.id.soft)
        val sevenClick = findViewById<ImageView>(R.id.mllab)
        val eightClick = findViewById<ImageView>(R.id.dvlab)
        val nineClick = findViewById<ImageView>(R.id.cclab)
        val tenClick = findViewById<ImageView>(R.id.iprp)

        oneClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "ml"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        twoClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "cc"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        threeClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "dv"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        pec2Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "pec2"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        oec2Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "oec2"
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
            val sub = "mllab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        eightClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "dvlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        nineClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "cclab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        tenClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "iprp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

    }
}