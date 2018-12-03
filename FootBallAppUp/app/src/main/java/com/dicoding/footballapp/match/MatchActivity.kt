package com.dicoding.footballapp.match

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dicoding.footballapp.R
import org.jetbrains.anko.*

class MatchActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        linearLayout {
            lparams(width = matchParent, height = wrapContent)

            frameLayout {
                id = R.id.fragmentHolder
            }.lparams{
                width = matchParent
                height = wrapContent
            }
        }
    }
}