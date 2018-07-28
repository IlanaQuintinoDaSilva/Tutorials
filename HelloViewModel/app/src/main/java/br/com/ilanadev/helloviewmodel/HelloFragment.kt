package br.com.ilanadev.helloviewmodel

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_hello.*

class HelloFragment : Fragment() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hello,
                container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setCount(count)
    }

    fun incrementar() {
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
        this.count = i
        tCount.text = (i).toString()
        Log.d("up", "count $i")
    }

}
