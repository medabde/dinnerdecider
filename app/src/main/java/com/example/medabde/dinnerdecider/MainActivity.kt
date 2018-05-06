package com.example.medabde.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("chinese","hmburger","pizza","mc donalds")
    val random = Random()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val randomFood = random.nextInt(foodList.count())
            food.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFood.text.toString()
            if(!newFood.isEmpty())
                foodList.add(newFood)


            addFood.text.clear()

        }


    }

}