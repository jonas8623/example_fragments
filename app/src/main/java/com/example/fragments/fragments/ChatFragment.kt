package com.example.fragments.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragments.R

class ChatFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("life_cycle", "Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("life_cycle", "Fragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("life_cycle", "Fragment onCreateView")
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("life_cycle", "Fragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("life_cycle", "Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("life_cycle", "Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("life_cycle", "Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("life_cycle", "Fragment onStop")
    }

    override fun onDestroyView() {
        Log.i("life_cycle", "Fragment onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("life_cycle", "Fragment onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("life_cycle", "Fragment onDetach")
        super.onDetach()
    }

}