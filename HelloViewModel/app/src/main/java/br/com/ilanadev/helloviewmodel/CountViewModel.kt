package br.com.ilanadev.helloviewmodel

import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import java.util.*

class CountViewModel: ViewModel(), LifecycleObserver {

    var count = 0

    private lateinit var timer: Timer

    var liveData: MutableLiveData<Int> = MutableLiveData()

    public fun startTimer(){
        timer = Timer()
        timer.scheduleAtFixedRate(object: TimerTask(){
            override fun run() {
                count++

                liveData.postValue(count)
                Log.d("up", "count $count")
            }
        }, 1000, 1000)

        }

    fun getCount(): LiveData<Int>{
        return liveData
    }
    }
