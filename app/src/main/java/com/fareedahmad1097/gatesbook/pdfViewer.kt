package com.fareedahmad1097.gatesbook

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle

class pdfViewer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.MODE_NIGHT_NO
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_viewer)
        val actionBar = getSupportActionBar()
        actionBar?.hide()
        window.statusBarColor = ContextCompat.getColor(this, R.color.midnight)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.midnight)

        val pdfview = findViewById<PDFView>(R.id.pdfView)
        val intent2 = intent
        val pdfName = intent2.getStringExtra("pdfName")

        val file = baseContext.getFileStreamPath(pdfName)

        pdfview.setLayerType(View.LAYER_TYPE_HARDWARE,null)
        pdfview.setDrawingCacheEnabled(true)
        pdfview.enableRenderDuringScale(false)
        pdfview.useBestQuality(true)
        pdfview.fromFile(file)
            .scrollHandle(DefaultScrollHandle(this))
            .enableAntialiasing(true)
            .load()

    }
}