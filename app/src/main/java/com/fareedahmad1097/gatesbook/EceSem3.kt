package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class EceSem3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ece_sem3)

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
        val ssClick = findViewById<ImageView>(R.id.ss)
        val eeClick = findViewById<ImageView>(R.id.ee)
        val acClick = findViewById<ImageView>(R.id.ac)
        val he1Click = findViewById<ImageView>(R.id.he1)
        val sLabClick = findViewById<ImageView>(R.id.sl)
        val eeLabClick = findViewById<ImageView>(R.id.eelab)
        val acLabClick = findViewById<ImageView>(R.id.aclab)
        val uhvClick = findViewById<ImageView>(R.id.uhv)
        val adpClick = findViewById<ImageView>(R.id.adp)

        cvtClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem3"
            val sub = "cvt"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ssClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem3"
            val sub = "ss"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        eeClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem3"
            val sub = "ee"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        acClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem3"
            val sub = "ac"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        he1Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem3"
            val sub = "4he1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        sLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "ece"
            val sem = "sem3"
            val sub = "slab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        eeLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "ece"
            val sem = "sem3"
            val sub = "eelab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        acLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "ece"
            val sem = "sem3"
            val sub = "aclab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        uhvClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem3"
            val sub = "uhv"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        adpClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "ece"
            val sem = "sem3"
            val sub = "adp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}