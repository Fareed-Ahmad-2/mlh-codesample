package com.fareedahmad1097.gatesbook

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.os.Bundle
import android.service.controls.ControlsProviderService
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.downloader.OnDownloadListener
import com.downloader.PRDownloader
import com.fareedahmad1097.gatesbook.MainActivity.Companion.mInterstitialAd
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class lab : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab)

//        test ad
        val AD_UNIT_ID = "ca-app-pub-3940256099942544/1033173712"


        fun loadAd(){
            val adRequest = AdRequest.Builder().build()
            InterstitialAd.load(this,AD_UNIT_ID, adRequest, object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    Log.d(ControlsProviderService.TAG, adError.toString())
                    mInterstitialAd = null
                }

                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    Log.d(ControlsProviderService.TAG, "add loaded")
                    mInterstitialAd = interstitialAd
                    mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
                        override fun onAdDismissedFullScreenContent() {
                            loadAd()
                            super.onAdDismissedFullScreenContent()
                        }
                    }
                }
            })
        }

        val intent2 = intent
        val intent3 = intent
        val intent4 = intent

        val branch = intent2.getStringExtra("branch")
        val sem = intent3.getStringExtra("sem")
        val sub = intent4.getStringExtra("sub")

        val basePath = "$sub/$sub"
        val baseName = "$sub"
        val title = "$branch-$sem"

        val actionBar = supportActionBar
        actionBar?.hide()
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val textTitle = findViewById<TextView>(R.id.labText)
        val imageview = findViewById<ImageView>(R.id.image)
        textTitle.text = title

        fun openPdf(pdfName: String) {
            val intent = Intent(this, pdfViewer::class.java)
            intent.putExtra("pdfName", pdfName)
            startActivity(intent)
            finish()
        }

        fun loadAdPdf(fileName: String){
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
                mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
                    override fun onAdDismissedFullScreenContent() {
                        loadAd()
                        super.onAdDismissedFullScreenContent()
                        openPdf(fileName)
                    }
                }
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.")
                loadAd()
                openPdf(fileName)
            }
        }


        val db = Firebase.firestore
        fun downloadFromFirebase(pdfName: String, fileName: String) {
            val bar: ProgressBar = findViewById(R.id.progressBar)
            val barText = findViewById<TextView>(R.id.barText)
            val docRef = db.document(pdfName)
            docRef.get().addOnSuccessListener { document ->
                if (document != null) {
                    val pdfUrl = document.get("link")
                    PRDownloader.download(
                        pdfUrl as String?,
                        baseContext.filesDir.absolutePath,
                        fileName
                    )
                        .build()
                        .setOnProgressListener { progress ->
                            bar.visibility = View.VISIBLE
                            barText.visibility = View.VISIBLE
                            bar.max = progress?.totalBytes?.toInt()!!
                            bar.progress = progress.currentBytes.toInt()
                            barText.text = (progress.totalBytes / 1000000).toString() + " MB"
                        }
                        .start(object : OnDownloadListener {
                            override fun onDownloadComplete() {
                                bar.visibility = View.GONE
                                barText.visibility = View.GONE
                                loadAdPdf(fileName)
                            }

                            override fun onError(error: com.downloader.Error?) {
                                Toast.makeText(baseContext, "Failed to download", Toast.LENGTH_SHORT)
                                    .show()
                                bar.visibility = View.GONE
                                barText.visibility = View.GONE
                            }

                        })
                }else {
                    Toast.makeText(baseContext, "an error occurred!", Toast.LENGTH_SHORT)
                        .show()
                }
            }.addOnFailureListener {
                // Handle any errors
                println("failed to connect with firebase")
                Toast.makeText(this, "failed to download!", Toast.LENGTH_SHORT).show()
                bar.visibility = View.GONE
                barText.visibility = View.GONE
            }

        }

        fun isOnline(context: Context): Boolean {
            val connectivityManager =
                context.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
            val capabilities =
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
                } else {
                    return (context.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo?.isConnectedOrConnecting == true
                }
            if (capabilities != null) {
                if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
//                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR")
                    return true
                } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
//                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_WIFI")
                    return true
                } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
//                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET")
                    return true
                }
            }
            return false
        }


        fun pdfLoader(pdfName: String, fileName: String){
            val fileExist = baseContext.getFileStreamPath(fileName).exists()
            val online = isOnline(baseContext)
            if(online){
                if (fileExist){
                    println("checking if local pdf is updated")
                    val bar: ProgressBar = findViewById(R.id.progressBar)
                    bar.visibility = View.GONE
                    val image = this.resources.getIdentifier(sub, "drawable", this.packageName)
                    imageview.setImageResource(image)
                    val size = baseContext.getFileStreamPath(fileName).length()
                    val docRef = db.document(pdfName)
                    docRef.get().addOnSuccessListener { document ->
                        val firebasePdfSize = document.get("size")
                        if (size == firebasePdfSize) {
                            println("pdf is up to date")
                            loadAdPdf(fileName)
                        } else {
                            // update pdf
                            Toast.makeText(this, "updating pdf!", Toast.LENGTH_SHORT).show()
                            downloadFromFirebase(pdfName, fileName)
                        }

                    }.addOnFailureListener {
                        // Uh-oh, an error occurred!
                        println("failed to get firebase pdf size")
                        loadAdPdf(fileName)
                    }
                }else{
                    println("pdf does not exists")
                    val image = this.resources.getIdentifier(sub, "drawable", this.packageName)
                    imageview.setImageResource(image)
                    Toast.makeText(this, "downloading...", Toast.LENGTH_SHORT).show()
                    downloadFromFirebase(pdfName, fileName)
                }
            }else{
                val image = this.resources.getIdentifier(sub, "drawable", this.packageName)
                imageview.setImageResource(image)
                val bar: ProgressBar = findViewById(R.id.progressBar)
                bar.visibility = View.GONE
                Toast.makeText(this, "NO INTERNET!", Toast.LENGTH_LONG).show()
            }
        }


        val subPath = ".pdf"
        val pdfName = basePath
        val fileName = baseName + subPath
        pdfLoader(pdfName, fileName)
    }
}