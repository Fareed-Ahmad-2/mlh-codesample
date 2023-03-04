package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MechSem5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_sem5)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val oneClick = findViewById<ImageView>(R.id.cam)
        val twoClick = findViewById<ImageView>(R.id.dmm)
        val threeClick = findViewById<ImageView>(R.id.mym)
        val fourClick = findViewById<ImageView>(R.id.pec1)
        val fiveClick = findViewById<ImageView>(R.id.oec1)
        val sixClick = findViewById<ImageView>(R.id.mymlab)
        val sevenClick = findViewById<ImageView>(R.id.camlab)
        val eightClick = findViewById<ImageView>(R.id.iot)

        oneClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "cam"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        twoClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "dmm"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        threeClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "mym"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        fourClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "6pec1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        fiveClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "6oec1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        sixClick.setOnClickListener{
            val intent = Intent(this, lab::class.java)
            val sub = "mymlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        sevenClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "camlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        eightClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "iot"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

    }
}