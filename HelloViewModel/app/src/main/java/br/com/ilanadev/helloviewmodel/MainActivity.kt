package br.com.ilanadev.helloviewmodel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCount.setOnClickListener { onClickCount() }
    }

    private fun onClickCount() {
        val frag
                = supportFragmentManager.findFragmentById(R.id.HelloFragment) as HelloFragment
        frag.incrementar()
    }


}
