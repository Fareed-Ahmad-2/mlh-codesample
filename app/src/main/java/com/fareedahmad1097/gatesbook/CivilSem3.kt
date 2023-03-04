package com.fareedahmad1097.gatesbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class CivilSem3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_civil_sem3)

        val branch = intent.getStringExtra("branch")
        val sem = intent.getStringExtra("sem")
        val title = "$branch-$sem"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        var texttitle = findViewById<TextView>(R.id.title)
        texttitle.setText(title)

        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)


        val psClick = findViewById<ImageView>(R.id.ps)
        val mefaClick = findViewById<ImageView>(R.id.mefa)
        val surveyClick = findViewById<ImageView>(R.id.survey)
        val fmhmClick = findViewById<ImageView>(R.id.fmhm)
        val asmClick = findViewById<ImageView>(R.id.sm)
        val beClick = findViewById<ImageView>(R.id.be)
        val bceLabClick = findViewById<ImageView>(R.id.bcelab)
        val obClick = findViewById<ImageView>(R.id.ob)
        val fmhmLabClick = findViewById<ImageView>(R.id.fmhmlab)
        val surveyLabClick = findViewById<ImageView>(R.id.surveylab)
        val adpClick = findViewById<ImageView>(R.id.adp)
        val uhvClick = findViewById<ImageView>(R.id.uhv)



        psClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "ps"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        mefaClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "mefa"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        surveyClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "survey"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        fmhmClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "fmhm"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        asmClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "asm"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        beClick.setOnClickListener{
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "be"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        bceLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "bcelab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        obClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "ob"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        fmhmLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "fmhmlab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        surveyLabClick.setOnClickListener {
            val intent = Intent(this, lab::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "surveylab"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        adpClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "adp"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

        uhvClick.setOnClickListener {
            val intent = Intent(this, units::class.java)
            val branch = "civ"
            val sem = "sem3"
            val sub = "uhv"
            intent.putExtra("branch", branch)
            intent.putExtra("sem", sem)
            intent.putExtra("sub", sub)
            startActivity(intent)
        }

    }
}