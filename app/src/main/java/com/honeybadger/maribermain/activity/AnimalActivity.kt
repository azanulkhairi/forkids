package com.honeybadger.maribermain.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.honeybadger.maribermain.R
import com.honeybadger.maribermain.adapter.SwapAdapter
import com.honeybadger.maribermain.model.Model
import kotlinx.android.synthetic.main.activity_animal.*

class AnimalActivity : AppCompatActivity() {

    var swapAdapter:SwapAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)


        var models = ArrayList<Model>()
        models.add(
            Model(
                R.drawable.dog, "dog" )
        )
        models.add(
            Model(
                R.drawable.turtle, "turtle" )
        )
        models.add(
            Model(
                R.drawable.zebra, "zebra")
        )
        models.add(
            Model(
                R.drawable.camel, "camel"
            )
        )
        models.add(
            Model(
                R.drawable.kangaroo, "kangaroo"
            )
        )
        models.add(
            Model(
                R.drawable.sealion,"sea lion"
            )
        )
        models.add(
            Model(
                R.drawable.duck, "duck"
            )
        )
        models.add(
            Model(
                R.drawable.horse, "horse"
            )
        )
        models.add(
            Model(
                R.drawable.cow, "cow"
            )
        )
        models.add(
            Model(
                R.drawable.pinguin, "pinguin"
            )
        )
        models.add(
            Model(
                R.drawable.lion, "lion"
            )
        )
        models.add(
            Model(
                R.drawable.giraffe, "giraffe"
            )
        )
        models.add(
            Model(
                R.drawable.goat, "goat"
            )
        )
        models.add(
            Model(
                R.drawable.dolphin, "dolphin"
            )
        )
        models.add(
            Model(
                R.drawable.rabbit, "rabbit"
            )
        )
        models.add(
            Model(
                R.drawable.monkey, "monkey"
            )
        )
        models.add(
            Model(
                R.drawable.frog, "frog"
            )
        )
        models.add(
            Model(
                R.drawable.bat, "bat"
            )
        )
        models.add(
            Model(
                R.drawable.dofflamingo, "doflamingoo"
            )
        )
        models.add(
            Model(
                R.drawable.crocodile, "crocodile"
            )
        )
        models.add(
            Model(
                R.drawable.tiger, "tiger"
            )
        )
        models.add(
            Model(
                R.drawable.snake, "snake"
            )
        )
        models.add(
            Model(
                R.drawable.elephant, "elephant"
            )
        )

        swapAdapter = SwapAdapter(models,this)

        swapViewPager.setAdapter(swapAdapter)
        swapViewPager.setPadding(130, 0, 130, 0)



        swapViewPager.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            @SuppressLint("RestrictedApi")
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

                /*  if (position < swapAdapter!!.getCount() - 1 && position < colors!!.size - 1) {
                      swapViewPager.setBackgroundColor(
                          Color.WHITE
  //                        argbEvaluator!!.evaluate(
  //                            positionOffset,
  //                            colors!![position],
  //                            colors!![position + 1]
  //                        ) as Int
                      )
                  }*/
            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }


}
