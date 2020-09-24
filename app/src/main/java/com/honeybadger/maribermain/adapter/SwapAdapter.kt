package com.honeybadger.maribermain.adapter

import android.content.Context
import android.content.res.Resources
import android.media.MediaPlayer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.honeybadger.maribermain.R
import com.honeybadger.maribermain.model.Model
import kotlin.math.log

class SwapAdapter(private val models: List<Model>, private val context: Context?) : PagerAdapter() {
    private var layoutInflater: LayoutInflater? = null

    private var mediaPlayer : MediaPlayer? = null

    override fun getCount(): Int {
        return models.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater!!.inflate(R.layout.swap_item, container, false)

        val imageView: ImageView

        imageView = view.findViewById(R.id.image)
        val textView : TextView = view.findViewById(R.id.textview)

        imageView.setImageResource(models[position].image)
        textView.text = models[position].title
        var code = models[position].title

       view.setOnClickListener {
           Log.d("test", code)

            var resid : Int? = null
            when (code) {
                "lion" -> resid  =  R.raw.lion;
                "bat" ->  resid  =  R.raw.bat;
                "camel" ->  resid  =  R.raw.camel;
                "cat" ->  resid  =  R.raw.cat;
                "cow" ->  resid  =  R.raw.cow;
                "dog" ->  resid  =  R.raw.dog;
                "duck" ->  resid  =  R.raw.duck;
                "elephant" ->  resid  =  R.raw.elephant;
                "frog" ->  resid  =  R.raw.frog;
                "goat" ->  resid  =  R.raw.goat;
                "horse" ->  resid  =  R.raw.horse;
                "lion" ->  resid  =  R.raw.lion;
                "monkey" ->  resid  =  R.raw.monkey;
                "pinguin" ->  resid  =  R.raw.penguin;
                "sea lion" ->  resid  =  R.raw.sealions;
                "snake" ->  resid  =  R.raw.snake;
                "tiger" ->  resid  =  R.raw.tiger;
                "turtle" ->  resid  =  R.raw.turtle;
                "zebra" ->  resid  =  R.raw.zebra;
                "apple" ->  resid  =  R.raw.apple;
                "avocado" ->  resid  =  R.raw.avocado;
                "banana" ->  resid  =  R.raw.banana;
                "durian" ->  resid  =  R.raw.durian;
                "grapes" ->  resid  =  R.raw.grape;
                "melon" ->  resid  =  R.raw.melon;
                "orange" ->  resid  =  R.raw.orange;
                "papaya" ->  resid  =  R.raw.papaya;
                "pineapple" ->  resid  =  R.raw.pineapple;
                "strawberry" ->  resid  =  R.raw.strawberry;
                "guitar" ->  resid  =  R.raw.guitar;
                "biola" ->  resid  =  R.raw.biola;
                "drum" ->  resid  =  R.raw.drum;
                "piano" ->  resid  =  R.raw.piano;
                "trumpet" ->  resid  =  R.raw.trumpet;
                "harmonica" ->  resid  =  R.raw.harmonica;
                "gamelan" ->  resid  =  R.raw.gamelan;
                "ukulele" ->  resid  =  R.raw.ukulele;
                "lute" ->  resid  =  R.raw.lute;
                else  -> resid  =  R.raw.silent;
            }


            mediaPlayer = MediaPlayer.create(
                this.context,
                resid
            )
           mediaPlayer?.start()
       }

        container.addView(view, 0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}
