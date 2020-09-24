package com.honeybadger.maribermain.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.honeybadger.maribermain.R
import com.honeybadger.maribermain.adapter.SwapAdapter
import com.honeybadger.maribermain.model.Model
import kotlinx.android.synthetic.main.activity_animal.*

class FruitActivity : AppCompatActivity() {

    var swapAdapter:SwapAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)


        var models = ArrayList<Model>()
        models.add(
            Model(
                R.drawable.apple, "apple" )
        )
        models.add(
            Model(
                R.drawable.avocado, "avocado" )
        )
        models.add(
            Model(
                R.drawable.banana, "banana")
        )
        models.add(
            Model(
                R.drawable.durian, "durian"
            )
        )
        models.add(
            Model(
                R.drawable.grapes, "grapes"
            )
        )
        models.add(
            Model(
                R.drawable.melon,"melon"
            )
        )
        models.add(
            Model(
                R.drawable.orange, "orange"
            )
        )
        models.add(
            Model(
                R.drawable.pineapple, "pineapple"
            )
        )
        models.add(
            Model(
                R.drawable.strawberry, "strawberry"
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
