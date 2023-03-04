package com.fareedahmad1097.gatesbook

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val db = Firebase.firestore

        fun buttonHandler (documentPath: String){
            val docRef = db.collection("menu").document(documentPath)
            docRef.get()
                .addOnSuccessListener { document ->
                    if (document != null) {
                        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(document.get(documentPath).toString()))
                        startActivity(browserIntent)
                    } else {
                        Toast.makeText(baseContext, "an error occurred!", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
                .addOnFailureListener { exception ->
                    Toast.makeText(baseContext, "No internet !!!", Toast.LENGTH_SHORT)
                        .show()
                }
        }

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val creditView = findViewById<CardView>(R.id.cardCredits)
        val shareView = findViewById<CardView>(R.id.share)
        val bugView = findViewById<CardView>(R.id.report)
        val contributeClick = findViewById<CardView>(R.id.contributeCard)
        val faqBtn = findViewById<Button>(R.id.faq)
        val featureBtn = findViewById<Button>(R.id.feature)
        val feedbackBtn = findViewById<Button>(R.id.feedback)

        creditView.setOnClickListener {
            val btn = "credits"
            buttonHandler(btn)
        }

        shareView.setOnClickListener {
            val intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hey Check out this Great app")
            intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.fareedahmad1097.gatesbook")
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share To:"))
        }

        bugView.setOnClickListener {
            val btn = "report"
            buttonHandler(btn)
        }

        contributeClick.setOnClickListener {
            val btn = "contribute"
            buttonHandler(btn)
        }

        faqBtn.setOnClickListener {
            val btn = "faq"
            buttonHandler(btn)
        }

        featureBtn.setOnClickListener {
            val btn = "feature"
            buttonHandler(btn)
        }

        feedbackBtn.setOnClickListener {
            val btn = "feedback"
            buttonHandler(btn)
        }

    }
}