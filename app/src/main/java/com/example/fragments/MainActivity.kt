package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragments.fragments.CallFragment
import com.example.fragments.fragments.ChatFragment

class MainActivity : AppCompatActivity() {

    private lateinit var buttonChat: Button
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
        buttonChat = findViewById(R.id.button_chat)
        buttonCall = findViewById(R.id.button_call)
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, fragment)
            .commit()
    }

    private fun getFragmentChat() = buttonChat.setOnClickListener { setFragment(ChatFragment()) }
    private fun getFragmentCall() = buttonCall.setOnClickListener { setFragment(CallFragment()) }
}