package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.fragments.fragments.CallFragment
import com.example.fragments.fragments.ChatFragment

class MainActivity : AppCompatActivity() {

    private lateinit var buttonMarketplace: Button
    private lateinit var buttonCall: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("life_cycle", "Activity onCreate")

        initActivity()
        getFragmentChat()
        getFragmentCall()

    }

    override fun onStart() {
        super.onStart()
        Log.i("life_cycle", "Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("life_cycle", "Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("life_cycle", "Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("life_cycle", "Activity onStop")
    }

    override fun onDestroy() {
        Log.i("life_cycle", "Activity onDestroy")
        super.onDestroy()
    }

    private fun initActivity() {
        buttonMarketplace = findViewById(R.id.button_marketplace)
        buttonCall = findViewById(R.id.button_call)
    }

    private fun initFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, fragment)
            .commit()
    }

    private fun getFragmentChat() = buttonMarketplace.setOnClickListener {
        val chatFragment = ChatFragment()
        val bundle = bundleOf("category" to "mercado")
        chatFragment.arguments = bundle
        initFragment(chatFragment)
    }
    private fun getFragmentCall() = buttonCall.setOnClickListener { initFragment(CallFragment()) }
}