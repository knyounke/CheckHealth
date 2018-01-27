package com.example.knyou.checkhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
    
    public class Enter extends AppCompatActivity {
        ImageButton enter;
        
        protected void onCreate(Bundle savedInstancesState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_enter);
            enter=(ImageButton)findViewByID(R.id.imageButton);
            enter.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    try {
                        connectService();
                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        private void findViewByID(int imageButton) {
        }
    }
}
