package com.example.knyou.checkhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
    
    public class Enter extends AppCompatActivity {
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);

           setContentView(R.layout.activity_enter);

           final ImageButton button = findViewById(R.id.imageButton);
           button.setOnClickListener(new View.OnClickListener() {

               @Override
               public void onClick(View view) {

               }

           });
       }

    }
}
