package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class CivilSem4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_civil_sem4)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)

        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)


        val mmotClick = findViewById<ImageView>(R.id.mmot)
        val eegClick = findViewById<ImageView>(R.id.eeg)
        val ctClick = findViewById<ImageView>(R.id.ct)
        val saClick = findViewById<ImageView>(R.id.sa)
        val egyClick = findViewById<ImageView>(R.id.egy)
        val cmLabClick = findViewById<ImageView>(R.id.cmlab)
        val eegLabClick = findViewById<ImageView>(R.id.eeglab)
        val egyLabClick = findViewById<ImageView>(R.id.egylab)
        val dtiClick = findViewById<ImageView>(R.id.dti)



        mmotClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem4"
            val sub = "mmot"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        eegClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem4"
            val sub = "eeg"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ctClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem4"
            val sub = "ct"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        saClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem4"
            val sub = "sa"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        egyClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem4"
            val sub = "egy"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        cmLabClick.setOnClickListener{
            val intent = Intent(this, lab::class.java)
            val branch = "civ"
            val sem = "sem4"
            val sub = "cmlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        eegLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "civ"
            val sem = "sem4"
            val sub = "eeglab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        egyLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "civ"
            val sem = "sem4"
            val sub = "egylab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dtiClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem4"
            val sub = "dti"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}