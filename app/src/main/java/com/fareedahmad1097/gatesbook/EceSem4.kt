package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class EceSem4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ece_sem4)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)


        val ptspClick = findViewById<ImageView>(R.id.ptsp)
        val dldClick = findViewById<ImageView>(R.id.dld)
        val emtlClick = findViewById<ImageView>(R.id.emtl)
        val csClick = findViewById<ImageView>(R.id.cs)
        val ldiaClick = findViewById<ImageView>(R.id.ldia)
        val dldLabClick = findViewById<ImageView>(R.id.dldlab)
        val csLabClick = findViewById<ImageView>(R.id.cslab)
        val ldiaLabClick = findViewById<ImageView>(R.id.ldialab)
        val dtiClick = findViewById<ImageView>(R.id.dti)
        val softClick = findViewById<ImageView>(R.id.soft)

        ptspClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem4"
            val sub = "ptsp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        softClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem4"
            val sub = "soft_skills"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dldClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem4"
            val sub = "dld"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        emtlClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem4"
            val sub = "emtl"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        csClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem4"
            val sub = "cs"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ldiaClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem4"
            val sub = "ldia"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dldLabClick.setOnClickListener{
            val intent = Intent(this, lab::class.java)
            val branch = "ece"
            val sem = "sem4"
            val sub = "dldlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        csLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "ece"
            val sem = "sem4"
            val sub = "cslab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ldiaLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "ece"
            val sem = "sem4"
            val sub = "ldialab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dtiClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem4"
            val sub = "dti"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}