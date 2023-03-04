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
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.downloader.OnDownloadListener
import com.downloader.PRDownloader
import com.downloader.PRDownloaderConfig
import com.fareedahmad1097.gatesbook.MainActivity.Companion.mInterstitialAd
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class units : AppCompatActivity() {

//    test ad below
    val AD_UNIT_ID = "ca-app-pub-3940256099942544/1033173712"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_units)

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
        val title = "$branch-$sem-$sub"

        val actionBar = getSupportActionBar()
        actionBar?.hide()
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)
//        actionBar?.title = title.uppercase()

        var texttitle = findViewById<TextView>(R.id.unitText)
        texttitle.setText(title)


        val unit1Click = findViewById<ImageButton>(R.id.unit1)
        val unit2Click = findViewById<ImageButton>(R.id.unit2)
        val unit3Click = findViewById<ImageButton>(R.id.unit3)
        val unit4Click = findViewById<ImageButton>(R.id.unit4)
        val unit5Click = findViewById<ImageButton>(R.id.unit5)
        val unit6Click = findViewById<ImageButton>(R.id.unit6)
        val bar = findViewById<ProgressBar>(R.id.progressBar)
        bar.visibility = View.GONE
        unit6Click.visibility = View.INVISIBLE

        val subWith6Units = setOf("beee")
        if(sub in subWith6Units){
            unit6Click.visibility = View.VISIBLE
        }


        // Initialize PRDownloader with read and connection timeout
        val config = PRDownloaderConfig.newBuilder()
            .setReadTimeout(30000)
            .setConnectTimeout(30000)
            .build()
        PRDownloader.initialize(applicationContext, config)

        fun disableButtons(){
            unit1Click.isEnabled = false
            unit2Click.isEnabled = false
            unit3Click.isEnabled = false
            unit4Click.isEnabled = false
            unit5Click.isEnabled = false
            unit6Click.isEnabled = false
        }

        fun enableButtons(){
            unit1Click.isEnabled = true
            unit2Click.isEnabled = true
            unit3Click.isEnabled = true
            unit4Click.isEnabled = true
            unit5Click.isEnabled = true
            unit6Click.isEnabled = true
        }

//        check internet connection
        fun isOnline(context: Context): Boolean {
            val connectivityManager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val capabilities =
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
                } else {
                    return (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo?.isConnectedOrConnecting == true
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

//      open pdf viewer
        fun openPdf(pdfName : String) {
            val intent = Intent(this, pdfViewer::class.java)
            intent.putExtra("pdfName", pdfName)
            startActivity(intent)
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
        fun downloadFromFirebase(pdfName : String , fileName: String){
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
                                    enableButtons()
                                    loadAdPdf(fileName)
                                }

                                override fun onError(error: com.downloader.Error?) {
                                    Toast.makeText(baseContext, "Failed to download", Toast.LENGTH_SHORT)
                                        .show()
                                    bar.visibility = View.GONE
                                    barText.visibility = View.GONE
                                    enableButtons()
                                }

                            })

                    } else {
                        Toast.makeText(baseContext, "an error occurred!", Toast.LENGTH_SHORT)
                            .show()
                    }
                }.addOnFailureListener {
                    // Handle any errors
                    println("failed to download pdf")
                    Toast.makeText(this, "failed to download!", Toast.LENGTH_SHORT).show()
                    bar.visibility = View.GONE
                    barText.visibility = View.GONE
                    enableButtons()
                }
        }

        fun pdfLoader(pdfName: String, fileName: String){
            val fileExist = baseContext.getFileStreamPath(fileName).exists()
            val online = isOnline(baseContext)
            if(online){
                if (fileExist){
                    println("checking if local pdf is updated")
                    val size = baseContext.getFileStreamPath(fileName).length()
                    val docRef = db.document(pdfName)
                    docRef.get().addOnSuccessListener { document ->
                        val firebasePdfSize = document.get("size")
                        Log.d("TAG", "the pdf size in firestore is $firebasePdfSize")
                        Log.d("TAG", "the local pdf size is $size")
                        if (size == firebasePdfSize){
                            println("pdf is up to date")
                            enableButtons()
                            loadAdPdf(fileName)
                        }else{
                            // update pdf
                            Toast.makeText(this, "updating pdf!", Toast.LENGTH_SHORT).show()
                            downloadFromFirebase(pdfName, fileName)
                        }

                    }.addOnFailureListener {
                        // Uh-oh, an error occurred!
                        println("failed to get firebase pdf size")
                        enableButtons()
                        loadAdPdf(fileName)
                    }

                }else{
                    println("pdf does not exists")
                    Toast.makeText(this, "downloading...", Toast.LENGTH_SHORT).show()
                    downloadFromFirebase(pdfName, fileName)
                }

            }else{
                enableButtons()
                Toast.makeText(this, "NO INTERNET!", Toast.LENGTH_LONG).show()
            }
        }

        unit1Click.setOnClickListener {
            disableButtons()
            val subPath = "1.pdf"
            val pdfName = basePath + "1"
            val fileName = baseName + subPath
            pdfLoader(pdfName, fileName)
        }

        unit2Click.setOnClickListener {
            disableButtons()
            val subPath = "2.pdf"
            val pdfName = basePath + "2"
            val fileName = baseName + subPath
            pdfLoader(pdfName, fileName)
        }

        unit3Click.setOnClickListener {
            disableButtons()
            val subPath = "3.pdf"
            val pdfName = basePath + "3"
            val fileName = baseName + subPath
            pdfLoader(pdfName, fileName)
        }

        unit4Click.setOnClickListener {
            disableButtons()
            val subPath = "4.pdf"
            val pdfName = basePath + "4"
            val fileName = baseName + subPath
            pdfLoader(pdfName, fileName)
        }

        unit5Click.setOnClickListener {
            disableButtons()
            val subPath = "5.pdf"
            val pdfName = basePath + "5"
            val fileName = baseName + subPath
            pdfLoader(pdfName, fileName)
        }

        unit6Click.setOnClickListener {
            disableButtons()
            val subPath = "6.pdf"
            val pdfName = basePath + "6"
            val fileName = baseName + subPath
            pdfLoader(pdfName, fileName)
        }

    }

}