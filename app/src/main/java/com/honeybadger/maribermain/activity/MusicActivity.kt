package com.honeybadger.maribermain.activity

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.honeybadger.maribermain.R
import com.honeybadger.maribermain.adapter.SwapAdapter
import com.honeybadger.maribermain.model.Model
import kotlinx.android.synthetic.main.activity_animal.*

class MusicActivity : AppCompatActivity() {

    var swapAdapter: SwapAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)


        var models = ArrayList<Model>()
        models.add(
            Model(
                R.drawable.biola, "biola" )
        )
        models.add(
            Model(
                R.drawable.drum, "drum" )
        )
        models.add(
            Model(
                R.drawable.gamelan, "gamelan")
        )
        models.add(
            Model(
                R.drawable.guitar, "guitar"
            )
        )
        models.add(
            Model(
                R.drawable.harmonica, "harmonica"
            )
        )
        models.add(
            Model(
                R.drawable.lute,"lute"
            )
        )
        models.add(
            Model(
                R.drawable.piano, "piano"
            )
        )
        models.add(
            Model(
                R.drawable.trumpet, "trumpet"
            )
        )
        models.add(
            Model(
                R.drawable.ukulele, "ukulele"
            )
        )


        swapAdapter = SwapAdapter(models,this)

        swapViewPager.setAdapter(swapAdapter)
        swapViewPager.setPadding(130, 0, 130, 0)



        swapViewPager.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            @SuppressLint("RestrictedApi")
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {


            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }
}
