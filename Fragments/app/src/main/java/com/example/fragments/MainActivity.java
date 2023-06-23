package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.fragment.ContactFragment;
import com.example.fragments.fragment.ConversationFragment;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversation, buttonContact;
    private ConversationFragment conversationFragment;
    private ContactFragment contactFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setElevation(0);

        buttonConversation = findViewById(R.id.buttonConversation);
        buttonContact = findViewById(R.id.buttonContact);

        conversationFragment = new ConversationFragment();
        contactFragment = new ContactFragment();
        this.initializeFragment(conversationFragment);

        buttonConversation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initializeFragment(conversationFragment);
            }
        });

        buttonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initializeFragment(contactFragment);
            }
        });
    }

    private void initializeFragment(Fragment fragment) {
        // Configurar objeto para fragment
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // Encerrar transações
    }
}