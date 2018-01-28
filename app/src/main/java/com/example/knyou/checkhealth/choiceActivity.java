package com.example.knyou.checkhealth;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

import static com.example.knyou.checkhealth.R.id.WikidescriptionID;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class choiceActivity extends AppCompatActivity {

    TextView Wikidescription;

    String userChoice;

    String OurUrl;


    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_choice);

        Wikidescription=(TextView)findViewById(R.id.WikidescriptionID);

        Button butto = (Button)findViewById(R.id.button);

        userChoice = "Drake";

        OurUrl = "https://en.wikipedia.org/wiki/";

        OurUrl = OurUrl + userChoice;


        butto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new display().execute();
            }
        });

    }

    public class display extends AsyncTask<Void,Void,Void>
    {
    String words;

        @Override
        protected Void doInBackground(Void... voids) {

            try
            {
                Document doc = Jsoup.connect(OurUrl).get();

                words = doc.text();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }


            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            //words = "HELLO!!!";

            String output = "";
            int count = 0;

            for (int index = 0; index < words.length(); index++)
            {
                char aChar = words.charAt(index);

                if (aChar == '.')
                {
                    count++;
                }
                if (count == 1)
                {
                    break;
                }
                output =  output + aChar;
            }


            Wikidescription.setText(output);
        }
    }
}