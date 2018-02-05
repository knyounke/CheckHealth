package com.example.knyou.checkhealth;


         import android.content.Intent;
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

                 final ImageButton button = (ImageButton) findViewById(R.id.imageButton);
                 button.setOnClickListener(new View.OnClickListener() {
                     public void onClick(View v) {
                         Intent myIntent = new Intent(HomeScreen.this, MenuActivity.class);
                         HomeScreen.this.startActivity(myIntent);
                     }
                 });
          }
 }
