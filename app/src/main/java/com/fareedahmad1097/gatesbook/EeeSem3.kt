package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class EeeSem3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eee_sem3)

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
        val ecaClick = findViewById<ImageView>(R.id.eca)
        val dctClick = findViewById<ImageView>(R.id.dct)
        val dldClick = findViewById<ImageView>(R.id.dld)
        val he1Click = findViewById<ImageView>(R.id.he1)
        val ecaLabClick = findViewById<ImageView>(R.id.ecalab)
        val dctLabClick = findViewById<ImageView>(R.id.dctlab)
        val dldLabClick = findViewById<ImageView>(R.id.dldlab)
        val uhvClick = findViewById<ImageView>(R.id.uhv)
        val adpClick = findViewById<ImageView>(R.id.adp)


        cvtClick.setOnClickListener {
            val intent = Intent(this, units::class.java)

            val sub = "cvt"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ecaClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "eca"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dctClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "dct"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dldClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "dld"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        he1Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "2he1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ecaLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "ecalab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dctLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "dctlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dldLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "dldlab"
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

        adpClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "adp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}