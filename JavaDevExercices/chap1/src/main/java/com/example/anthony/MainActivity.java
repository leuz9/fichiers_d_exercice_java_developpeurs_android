package com.example.anthony;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Indique le fichier XML à charger
        setContentView(R.layout.activity_main);
    }
}
