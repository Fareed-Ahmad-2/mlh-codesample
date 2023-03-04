package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class EceSem6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ece_sem6)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val oneClick = findViewById<ImageView>(R.id.ame)
        val twoClick = findViewById<ImageView>(R.id.vlsi)
        val threeClick = findViewById<ImageView>(R.id.cn)
        val pec2Click = findViewById<ImageView>(R.id.pec2)
        val oec2Click = findViewById<ImageView>(R.id.oec2)
        val sevenClick = findViewById<ImageView>(R.id.amelab)
        val eightClick = findViewById<ImageView>(R.id.vlsilab)
        val nineClick = findViewById<ImageView>(R.id.cnlab)
        val tenClick = findViewById<ImageView>(R.id.rfrf)
        val elevenClick = findViewById<ImageView>(R.id.iprp)

        oneClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "ame"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        twoClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "vlsi"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        threeClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "cn"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        pec2Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "4pec2"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        oec2Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "4oec2"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        sevenClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "amelab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        eightClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "vlsilab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        nineClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "comnlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        tenClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "rfrf"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        elevenClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "iprp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

    }
}