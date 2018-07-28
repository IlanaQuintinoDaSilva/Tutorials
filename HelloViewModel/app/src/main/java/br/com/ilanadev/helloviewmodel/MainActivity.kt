package br.com.ilanadev.helloviewmodel

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var model: CountViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model = ViewModelProviders.of(this).get(CountViewModel::class.java)

        setCount(model.count)

        model.startTimer()

        btCount.setOnClickListener { onClickCount() }
    }

    private fun onClickCount() {
        // Incrementar
        val s = tCount.text.toString()
        var i = 0
        i = if ("" == s) {
            0
        } else {
            Integer.parseInt(s)
        }
        setCount(++i)
    }

    private fun setCount(i: Int) {
        model.count = i
        tCount.text = (i).toString()
        Log.d("up", "count $i")
    }
}
