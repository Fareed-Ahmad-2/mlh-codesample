package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class AiSem4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_sem4)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)


        val dssmClick = findViewById<ImageView>(R.id.dssm)
        val dmsClick = findViewById<ImageView>(R.id.dms)
        val osClick = findViewById<ImageView>(R.id.os)
        val aiClick = findViewById<ImageView>(R.id.ai)
        val he1Click = findViewById<ImageView>(R.id.he1)
        val dmsLabClick = findViewById<ImageView>(R.id.dmslab)
        val osLabClick = findViewById<ImageView>(R.id.oslab)
        val aiLabClick = findViewById<ImageView>(R.id.ailab)
        val rClick = findViewById<ImageView>(R.id.r)
        val dtiClick = findViewById<ImageView>(R.id.dti)

        dssmClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem4"
            val sub = "dssm"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dmsClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem4"
            val sub = "dbms"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        osClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem4"
            val sub = "os"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        aiClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem4"
            val sub = "ai"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        he1Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem4"
            val sub = "3he1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dmsLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "cai"
            val sem = "sem4"
            val sub = "dbmslab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        osLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "cai"
            val sem = "sem4"
            val sub = "oslab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        aiLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "cai"
            val sem = "sem4"
            val sub = "ailab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        rClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "cai"
            val sem = "sem4"
            val sub = "r"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dtiClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "cai"
            val sem = "sem4"
            val sub = "dti"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

    }
}