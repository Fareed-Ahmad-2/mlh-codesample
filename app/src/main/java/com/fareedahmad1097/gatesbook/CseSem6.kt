package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class CseSem6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cse_sem6)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val cdClick = findViewById<ImageView>(R.id.cd)
        val mlClick = findViewById<ImageView>(R.id.ml)
        val iotClick = findViewById<ImageView>(R.id.iot)
        val pec2Click = findViewById<ImageView>(R.id.pec2)
        val oec2Click = findViewById<ImageView>(R.id.oec2)
        val softClick = findViewById<ImageView>(R.id.soft)
        val cdLabClick = findViewById<ImageView>(R.id.cdlab)
        val mlLabClick = findViewById<ImageView>(R.id.mllab)
        val iotLabClick = findViewById<ImageView>(R.id.iotlab)
        val iprpClick = findViewById<ImageView>(R.id.iprp)

        cdClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "cd"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        mlClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "ml"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        iotClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "iot"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        pec2Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "1pec2"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        oec2Click.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val sub = "1oec2"
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

        cdLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "cdlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        mlLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "mllab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        iotLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val sub = "iotlab"
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