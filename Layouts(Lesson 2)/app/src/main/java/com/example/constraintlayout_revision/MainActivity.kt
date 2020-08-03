package com.example.constraintlayout_revision

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setlistners()
    }

    private fun setlistners() {
        val clickableViews:List<View> =
            listOf(
            box_text_five,
            box_text_four,
            box_text_three,
            box_text_two,
            box_text_one,
            main_layout)

        for(i in clickableViews){
            i.setOnClickListener { changeBackGround(it) }
        }
    }


    private fun changeBackGround(view: View) {
        when(view.id){
            R.id.box_text_one->view.setBackgroundColor(Color.GREEN)
            R.id.box_text_two->view.setBackgroundColor(Color.RED)
            R.id.box_text_three->view.setBackgroundColor(Color.CYAN)
            R.id.box_text_four->view.setBackgroundColor(Color.BLUE)
            R.id.box_text_five->view.setBackgroundColor(Color.MAGENTA)
            else->view.setBackgroundColor(Color.GRAY)


        }

    }
}