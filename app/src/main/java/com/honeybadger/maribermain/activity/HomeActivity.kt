package com.honeybadger.maribermain.activity

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CompoundButton
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.honeybadger.maribermain.R


class HomeActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener{

    private var mediaPlayer : MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        mediaPlayer = MediaPlayer.create(
            this,
            R.raw.backsound
        )
        mediaPlayer?.isLooping = true
        mediaPlayer?.start()

        val animalButton = findViewById<Button>(R.id.animalButton)
        val fruitButton = findViewById<Button>(R.id.fruitButton)
        val toggleSound = findViewById<ToggleButton>(R.id.toggleSound)
        val musicButton = findViewById<Button>(R.id.musicButton)
        val quitButton = findViewById<Button>(R.id.quitButton)


        quitButton.setOnClickListener {
            this.finishAffinity()
        }


        animalButton.setOnClickListener {
            val intent = Intent(this, AnimalActivity::class.java)
            startActivity(intent)
        }
        fruitButton.setOnClickListener {
            val intent = Intent(this, FruitActivity::class.java)
            startActivity(intent)
        }

        musicButton.setOnClickListener {
            val intent = Intent(this, MusicActivity::class.java)
            startActivity(intent)
        }

        toggleSound.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The toggle is enabled/checked
                Toast.makeText(applicationContext,"Music on",Toast.LENGTH_SHORT).show()
                mediaPlayer?.stop()
            } else {
                // The toggle is disabled
                Toast.makeText(applicationContext,"Music off",Toast.LENGTH_SHORT).show()
                mediaPlayer = MediaPlayer.create(
                    this,
                    R.raw.backsound
                )
                mediaPlayer?.isLooping = true
                mediaPlayer?.start()
            }
        }

        //Inisialisasi Banner Ads
        val adView: AdView = findViewById(R.id.spanduk)
        adView.loadAd(AdRequest.Builder().build())


        //Membuat Event Pada Siklus Hidup Iklan
        adView.adListener = object : AdListener() {
            override fun onAdClosed() {
                //Kode disini akan di eksekusi saat Iklan Ditutup
                Toast.makeText(applicationContext, "Iklan Dititup", Toast.LENGTH_SHORT).show()
                super.onAdClosed()
            }

            override fun onAdFailedToLoad(i: Int) {
                //Kode disini akan di eksekusi saat Iklan Gagal Dimuat
                Toast.makeText(applicationContext, "Iklan Gagal Dimuat", Toast.LENGTH_SHORT)
                    .show()
                super.onAdFailedToLoad(i)
            }

            override fun onAdLeftApplication() {
                //Kode disini akan di eksekusi saat Pengguna Meniggalkan Aplikasi/Membuka Aplikasi Lain
                Toast.makeText(applicationContext, "Iklan Ditinggalkan", Toast.LENGTH_SHORT)
                    .show()
                super.onAdLeftApplication()
            }

            override fun onAdOpened() {
                //Kode disini akan di eksekusi saat Pengguna Mengklik Iklan
                Toast.makeText(applicationContext, "Iklan Diklik", Toast.LENGTH_SHORT).show()
                super.onAdOpened()
            }

            override fun onAdLoaded() {
                //Kode disini akan di eksekusi saat Iklan Selesai Dimuat
                Toast.makeText(applicationContext, "Iklan Selesai Dimuat", Toast.LENGTH_SHORT)
                    .show()
                super.onAdLoaded()
            }
        }


    }

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        Log.e("message" , "Toggle Button Drawable State is Filled? $p1")
    }



}
