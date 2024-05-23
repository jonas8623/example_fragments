package com.example.fragments.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragments.R

class ChatFragment : Fragment() {

    private lateinit var textMarketplace: TextView
    private lateinit var editTextName: EditText
    private lateinit var sendButton: Button
    private lateinit var textViewResultName: TextView
    private var category: String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("life_cycle", "Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("life_cycle", "Fragment onCreate")
        category = arguments?.getString("category")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("life_cycle", "Fragment onCreateView")
        val view = inflater.inflate(R.layout.fragment_chat, container, false)

        // Inicialização dos componentes
        initFragment(view)
        sendName()
        return view
    }

    private fun initFragment(view: View) {
        textMarketplace = view.findViewById(R.id.textView)
        editTextName = view.findViewById(R.id.editTextName)
        sendButton = view.findViewById(R.id.sendButton)
        textViewResultName = view.findViewById(R.id.textViewResultName)
        textMarketplace.text = category
    }

    private fun sendName() = sendButton.setOnClickListener {
        textViewResultName.text = editTextName.text.toString()
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