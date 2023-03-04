package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class AiSem6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_sem6)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val nlpClick = findViewById<ImageView>(R.id.nlp)
        val aaiClick = findViewById<ImageView>(R.id.aai)
        val ccClick = findViewById<ImageView>(R.id.cc)
        val pec2Click = findViewById<ImageView>(R.id.pec2)
        val oec2Click = findViewById<ImageView>(R.id.oec2)
        val softClick = findViewById<ImageView>(R.id.soft)
        val nlpLabClick = findViewById<ImageView>(R.id.nlplab)
        val aaiLabClick = findViewById<ImageView>(R.id.aailab)
        val ccLabClick = findViewById<ImageView>(R.id.cclab)
        val iprpClick = findViewById<ImageView>(R.id.iprp)

        nlpClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "nlp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        aaiClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "aai"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ccClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "cc"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        pec2Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "3pec2"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        oec2Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "3oec2"
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

        nlpLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "nlplab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        aaiLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "aailab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        ccLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "cclab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        iprpClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "iprp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

    }
}