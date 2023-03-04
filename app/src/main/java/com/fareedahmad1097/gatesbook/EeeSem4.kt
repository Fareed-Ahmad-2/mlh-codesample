package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class EeeSem4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eee_sem4)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)


        val nmptClick = findViewById<ImageView>(R.id.nmpt)
        val aecClick = findViewById<ImageView>(R.id.aec)
        val peClick = findViewById<ImageView>(R.id.pe)
        val acmClick = findViewById<ImageView>(R.id.acm)
        val eftClick = findViewById<ImageView>(R.id.eft)
        val aecLabClick = findViewById<ImageView>(R.id.aeclab)
        val peLabClick = findViewById<ImageView>(R.id.pelab)
        val acmLabClick = findViewById<ImageView>(R.id.acmlab)
        val csaClick = findViewById<ImageView>(R.id.csa)
        val dtiClick = findViewById<ImageView>(R.id.dti)


        nmptClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "nmpt"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        aecClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "aec"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        peClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "pe"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        acmClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "acm"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        eftClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "eft"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        aecLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "aeclab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        peLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "pelab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        acmLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "acmlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        csaClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "csa"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        dtiClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "dti"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}