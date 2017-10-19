package com.example.f1.a06_fragments;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityMain extends AppCompatActivity implements Interaction {

    private FragmentManager fragmentManager;
    private Fragment1 fragment1;
    private Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adding fragment to the containers:
        fragmentManager = getSupportFragmentManager();  // get Fragment Manager
        fragment1 = new Fragment1();                    // get an instance of Fragment1
        fragmentManager.beginTransaction()
                .replace(R.id.container_1, fragment1)
                .commit();                              // put Fragment1 into container1
        fragment2 = new Fragment2();                    // get an instance of Fragment1
        fragmentManager.beginTransaction()
                .replace(R.id.container_2, fragment2)
                .commit();                              // put Fragment1 into container1
    }

    @Override
    public void send(String text) {
        fragment2.setNewText(text);
    }

}
