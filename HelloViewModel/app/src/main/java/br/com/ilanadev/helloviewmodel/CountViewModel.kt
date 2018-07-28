package br.com.ilanadev.helloviewmodel

import android.arch.lifecycle.ViewModel
import android.util.Log
import java.util.*

class CountViewModel: ViewModel() {

    var count = 0

    private lateinit var timer: Timer

    public fun startTimer(){
        timer = Timer()
        timer.scheduleAtFixedRate(object: TimerTask(){
            override fun run() {
                count++
                Log.d("up", "count $count")
            }
        }, 1000, 1000)

        }
    }
