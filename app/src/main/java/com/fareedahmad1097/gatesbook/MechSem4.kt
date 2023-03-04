package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MechSem4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_sem4)

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
        val mtClick = findViewById<ImageView>(R.id.mt)
        val tdClick = findViewById<ImageView>(R.id.td)
        val kmClick = findViewById<ImageView>(R.id.km)
        val he1Click = findViewById<ImageView>(R.id.he1)
        val softClick = findViewById<ImageView>(R.id.soft)
        val tdLabClick = findViewById<ImageView>(R.id.tdlab)
        val dtiClick = findViewById<ImageView>(R.id.dti)
        val mtLabClick = findViewById<ImageView>(R.id.mtlab)
        val camdClick = findViewById<ImageView>(R.id.camd)

        nmptClick.setOnClickListener {
            val intent = Intent(this, units::class.java)

            val sub = "nmpt"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        mtClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "mt"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        tdClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "atd"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        kmClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "km"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        he1Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "6he1"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        softClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "soft_skills"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        tdLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "atdlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        mtLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "mtlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        camdClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "camd"
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