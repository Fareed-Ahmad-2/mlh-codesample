package com.fareedahmad1097.gatesbook

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.os.Bundle
import android.service.controls.ControlsProviderService
import android.service.controls.ControlsProviderService.TAG
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.ktx.messaging

class MainActivity : AppCompatActivity() {

    companion object {
        var mInterstitialAd: InterstitialAd? = null
    }


//    test ad below
    val AD_UNIT_ID = "ca-app-pub-3940256099942544/1033173712"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        Firebase.messaging.subscribeToTopic("weather")
            .addOnCompleteListener { task ->
                var msg = "Subscribed"
                if (!task.isSuccessful) {
                    msg = "Subscribe failed"
                }
                Log.d(TAG, msg)
                Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
            }


        val actionBar = getSupportActionBar()
        actionBar?.hide()
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val menuButton = findViewById<ImageView>(R.id.menu)
        val cseClick = findViewById<ImageView>(R.id.CSE)
        val eeeClick = findViewById<ImageView>(R.id.EEE)
        val aiClick = findViewById<ImageView>(R.id.AI)
        val eceClick = findViewById<ImageView>(R.id.ECE)
        val civilClick = findViewById<ImageView>(R.id.CIVIL)
        val mechClick = findViewById<ImageView>(R.id.MECH)
        val dsClick = findViewById<ImageView>(R.id.DS)
        val cyberClick = findViewById<ImageView>(R.id.cyber)
        val wifiIcon = findViewById<ImageView>(R.id.noInternet)
        val tryBtn = findViewById<Button>(R.id.tryAgain)
        val BtnText = findViewById<TextView>(R.id.noInternetText)

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
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR")
                    return true
                } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_WIFI")
                    return true
                } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET")
                    return true
                }
            }
            return false
        }


        fun disableButtons(){
            cseClick.visibility = View.GONE
            eeeClick.visibility = View.GONE
            aiClick.visibility = View.GONE
            eceClick.visibility = View.GONE
            civilClick.visibility = View.GONE
            mechClick.visibility = View.GONE
            dsClick.visibility = View.GONE
            cyberClick.visibility = View.GONE
        }

        fun enableButtons(){
            cseClick.visibility = View.VISIBLE
            eeeClick.visibility = View.VISIBLE
            aiClick.visibility = View.VISIBLE
            eceClick.visibility = View.VISIBLE
            civilClick.visibility = View.VISIBLE
            mechClick.visibility = View.VISIBLE
            dsClick.visibility = View.VISIBLE
            cyberClick.visibility = View.VISIBLE
        }

        fun disableWarning(){
            tryBtn.visibility = View.GONE
            BtnText.visibility = View.GONE
            wifiIcon.visibility = View.GONE
        }

        fun enableWarning(){
            tryBtn.visibility = View.VISIBLE
            BtnText.visibility = View.VISIBLE
            wifiIcon.visibility = View.VISIBLE
        }

        fun activityLoader(){
            val online = isOnline(baseContext)
            if(online){
                disableWarning()
                enableButtons()
                //      initialize ads sdk
                MobileAds.initialize(this) {}
                val adRequest = AdRequest.Builder().build()
                InterstitialAd.load(this,AD_UNIT_ID, adRequest, object : InterstitialAdLoadCallback() {
                    override fun onAdFailedToLoad(adError: LoadAdError) {
                        Log.d(ControlsProviderService.TAG, adError.toString())
                        mInterstitialAd = null
                    }

                    override fun onAdLoaded(interstitialAd: InterstitialAd) {
                        Log.d(TAG, "add loaded")
                        mInterstitialAd = interstitialAd
                    }
                })
            }
            else{
                Toast.makeText(baseContext, "Please check your internet connection", Toast.LENGTH_SHORT)
                    .show()
                disableButtons()
                enableWarning()
            }
        }

        activityLoader()


        menuButton.setOnClickListener {
            val intent = Intent(this, menu::class.java)
            startActivity(intent)
        }

        tryBtn.setOnClickListener {
            activityLoader()
        }

        cseClick.setOnClickListener {
            openSemester("cse")
        }
        eeeClick.setOnClickListener {
            openSemester("eee")
        }
        aiClick.setOnClickListener {
            openSemester("ai")
        }
        eceClick.setOnClickListener {
            openSemester("ece")
        }
        civilClick.setOnClickListener {
            openSemester("civil")
        }
        mechClick.setOnClickListener {
            openSemester("mech")
        }
        dsClick.setOnClickListener {
            openSemester("csd")
        }
        cyberClick.setOnClickListener {
            openSemester("cyber")
        }

    }

    fun openSemester(branch : String) {
        val intent = Intent(this, semester::class.java)
        intent.putExtra("data", branch)
        startActivity(intent)
    }
    }