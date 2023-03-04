package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MechSem1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_sem1)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)


        val cpdsClick = findViewById<ImageView>(R.id.cpds)
        val chemClick = findViewById<ImageView>(R.id.chemistry)
        val lacClick = findViewById<ImageView>(R.id.Algebra)
        val beeeClick = findViewById<ImageView>(R.id.beee)
        val workshopClick = findViewById<ImageView>(R.id.workshop)
        val itClick = findViewById<ImageView>(R.id.it)
        val cpdsLabClick = findViewById<ImageView>(R.id.cpdsLab)
        val chemLabClick = findViewById<ImageView>(R.id.chemLab)
        val beeeLabClick = findViewById<ImageView>(R.id.beeeLab)


        cpdsClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "cpds"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        chemClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "chem"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        lacClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "lac"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        beeeClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "beee"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }


        workshopClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "workshop"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        itClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "it"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        cpdsLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "cpdslab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        chemLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "chemlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        beeeLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "beeelab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }
    }
}