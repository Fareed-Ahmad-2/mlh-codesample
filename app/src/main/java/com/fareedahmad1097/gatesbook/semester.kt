package com.fareedahmad1097.gatesbook

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class semester : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semester)

        val intent1 = intent
        val branch = intent1.getStringExtra("data")

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)
//        actionBar?.title = branch?.uppercase()
//        actionBar?.setBackgroundDrawable(ColorDrawable(getResources().getColor(R.color.midnight)))

        val Sem1Click = findViewById<ImageView>(R.id.sem1)
        val Sem2Click = findViewById<ImageView>(R.id.sem2)
        val Sem3Click = findViewById<ImageView>(R.id.sem3)
        val Sem4Click = findViewById<ImageView>(R.id.sem4)
        val Sem5Click = findViewById<ImageView>(R.id.sem5)
        val Sem6Click = findViewById<ImageView>(R.id.sem6)
        val Sem7Click = findViewById<ImageView>(R.id.sem7)
        val Sem8Click = findViewById<ImageView>(R.id.sem8)

        var title = findViewById<TextView>(R.id.semText)

        if (branch == "cse") {
            title.setText("computer science")
        }
        if (branch == "eee") {
            title.setText("electrical & electronics")
        }
        if (branch == "ai") {
            title.setText("artificial intelligence")
        }
        if (branch == "ece") {
            title.setText("electronic & comunication")
        }
        if (branch == "civil") {
            title.setText("civil")
        }
        if (branch == "mech") {
            title.setText("mechanical")
        }
        if (branch == "csd") {
            title.setText("data science")
        }
        if (branch == "cyber") {
            title.setText("cyber security")
            Sem3Click.visibility = View.GONE
            Sem4Click.visibility = View.GONE
            Sem5Click.visibility = View.GONE
            Sem6Click.visibility = View.GONE
            Sem7Click.visibility = View.GONE
            Sem8Click.visibility = View.GONE

        }

        Sem1Click.setOnClickListener {
            if (branch == "cse") {
                val intent = Intent(this, CseSem1::class.java)
                val sem = "sem1"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "eee") {
                val intent = Intent(this, EeeSem1::class.java)
                val sem = "sem1"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ai") {
                val intent = Intent(this, AiSem1::class.java)
                val sem = "sem1"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ece") {
                val intent = Intent(this, EceSem1::class.java)
                val sem = "sem1"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "civil") {
                val intent = Intent(this, CivilSem1::class.java)
                val sem = "sem1"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "mech") {
                val intent = Intent(this, MechSem1::class.java)
                val sem = "sem1"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "csd") {
                val intent = Intent(this, DsSem1::class.java)
                val sem = "sem1"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "cyber") {
                val intent = Intent(this, CyberSem1::class.java)
                val sem = "sem1"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
        }

        Sem2Click.setOnClickListener {
            if (branch == "cse") {
                val intent = Intent(this, CseSem2::class.java)
                val sem = "sem2"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "eee") {
                val intent = Intent(this, EeeSem2::class.java)
                val sem = "sem2"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ai") {
                val intent = Intent(this, AiSem2::class.java)
                val sem = "sem2"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ece") {
                val intent = Intent(this, EceSem2::class.java)
                val sem = "sem2"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "civil") {
                val intent = Intent(this, CivilSem2::class.java)
                val sem = "sem2"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "mech") {
                val intent = Intent(this, MechSem2::class.java)
                val sem = "sem2"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "csd") {
                val intent = Intent(this, DsSem2::class.java)
                val sem = "sem2"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "cyber") {
                val intent = Intent(this, CyberSem2::class.java)
                val sem = "sem2"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
        }

        Sem3Click.setOnClickListener {
            if (branch == "cse") {
                val intent = Intent(this, CseSem3::class.java)
                val sem = "sem3"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "eee") {
                val intent = Intent(this, EeeSem3::class.java)
                val sem = "sem3"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ai") {
                val intent = Intent(this, AiSem3::class.java)
                val sem = "sem3"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ece") {
                val intent = Intent(this, EceSem3::class.java)
                val sem = "sem3"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "civil") {
                val intent = Intent(this, CivilSem3::class.java)
                val sem = "sem3"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "mech") {
                val intent = Intent(this, MechSem3::class.java)
                val sem = "sem3"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "csd") {
                val intent = Intent(this, DsSem3::class.java)
                val sem = "sem3"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
//            if (branch == "cyber") {
//                Toast.makeText(baseContext, "cyber sem 3 is not available", Toast.LENGTH_LONG)
//                    .show()
//            }
        }

        Sem4Click.setOnClickListener {
            if (branch == "cse") {
                val intent = Intent(this, CseSem4::class.java)
                val sem = "sem4"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "eee") {
                val intent = Intent(this, EeeSem4::class.java)
                val sem = "sem4"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ai") {
                val intent = Intent(this, AiSem4::class.java)
                val sem = "sem4"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ece") {
                val intent = Intent(this, EceSem4::class.java)
                val sem = "sem4"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "civil") {
                val intent = Intent(this, CivilSem4::class.java)
                val sem = "sem4"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "mech") {
                val intent = Intent(this, MechSem4::class.java)
                val sem = "sem4"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "csd") {
                val intent = Intent(this, DsSem4::class.java)
                val sem = "sem4"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
//            if (branch == "cyber") {
//                val intent = Intent(this, CyberSem4::class.java)
//                val sem = "sem4"
//                intent.putExtra("branch", branch)
//                intent.putExtra("sem", sem)
//                startActivity(intent)
//            }
        }

        Sem5Click.setOnClickListener {
            if (branch == "cse") {
                val intent = Intent(this, CseSem5::class.java)
                val sem = "sem5"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "eee") {
                val intent = Intent(this, EeeSem5::class.java)
                val sem = "sem5"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ai") {
                val intent = Intent(this, AiSem5::class.java)
                val sem = "sem5"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ece") {
                val intent = Intent(this, EceSem5::class.java)
                val sem = "sem5"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "civil") {
                val intent = Intent(this, CivilSem5::class.java)
                val sem = "sem5"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "mech") {
                val intent = Intent(this, MechSem5::class.java)
                val sem = "sem5"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "csd") {
                val intent = Intent(this, DsSem5::class.java)
                val sem = "sem5"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
//            if (branch == "cyber") {
//                val intent = Intent(this, CyberSem5::class.java)
//                val sem = "sem5"
//                intent.putExtra("branch", branch)
//                intent.putExtra("sem", sem)
//                startActivity(intent)
//            }
        }

        Sem6Click.setOnClickListener {
            if (branch == "cse") {
                val intent = Intent(this, CseSem6::class.java)
                val sem = "sem6"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "eee") {
                val intent = Intent(this, EeeSem6::class.java)
                val sem = "sem6"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ai") {
                val intent = Intent(this, AiSem6::class.java)
                val sem = "sem6"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ece") {
                val intent = Intent(this, EceSem6::class.java)
                val sem = "sem6"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "civil") {
                val intent = Intent(this, CivilSem6::class.java)
                val sem = "sem6"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "mech") {
                val intent = Intent(this, MechSem6::class.java)
                val sem = "sem6"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "csd") {
                val intent = Intent(this, DsSem6::class.java)
                val sem = "sem6"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
//            if (branch == "cyber") {
//                val intent = Intent(this, CyberSem6::class.java)
//                val sem = "sem6"
//                intent.putExtra("branch", branch)
//                intent.putExtra("sem", sem)
//                startActivity(intent)
//            }
        }

        Sem7Click.setOnClickListener {
            if (branch == "cse") {
                val intent = Intent(this, CseSem7::class.java)
                val sem = "sem7"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "eee") {
                val intent = Intent(this, EeeSem7::class.java)
                val sem = "sem7"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ai") {
                val intent = Intent(this, AiSem7::class.java)
                val sem = "sem7"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ece") {
                val intent = Intent(this, EceSem7::class.java)
                val sem = "sem7"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "civil") {
                val intent = Intent(this, CivilSem7::class.java)
                val sem = "sem7"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "mech") {
                val intent = Intent(this, MechSem7::class.java)
                val sem = "sem7"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "csd") {
                val intent = Intent(this, DsSem7::class.java)
                val sem = "sem7"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
//            if (branch == "cyber") {
//                val intent = Intent(this, CyberSem7::class.java)
//                val sem = "sem7"
//                intent.putExtra("branch", branch)
//                intent.putExtra("sem", sem)
//                startActivity(intent)
//            }
        }

        Sem8Click.setOnClickListener {
            if (branch == "cse") {
                val intent = Intent(this, CseSem8::class.java)
                val sem = "sem8"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "eee") {
                val intent = Intent(this, EeeSem8::class.java)
                val sem = "sem8"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ai") {
                val intent = Intent(this, AiSem8::class.java)
                val sem = "sem8"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "ece") {
                val intent = Intent(this, EceSem8::class.java)
                val sem = "sem8"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "civil") {
                val intent = Intent(this, CivilSem8::class.java)
                val sem = "sem8"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "mech") {
                val intent = Intent(this, MechSem8::class.java)
                val sem = "sem8"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
            if (branch == "csd") {
                val intent = Intent(this, DsSem8::class.java)
                val sem = "sem8"
                intent.putExtra("branch", branch)
                intent.putExtra("sem", sem)
                startActivity(intent)
            }
//            if (branch == "cyber") {
//                val intent = Intent(this, CyberSem8::class.java)
//                val sem = "sem8"
//                intent.putExtra("branch", branch)
//                intent.putExtra("sem", sem)
//                startActivity(intent)
//            }
        }
    }
}