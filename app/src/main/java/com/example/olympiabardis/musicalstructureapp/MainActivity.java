package com.example.olympiabardis.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.Toast;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ImageButton floatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        floatButton = (ImageButton) findViewById(R.id.addbutton);
        floatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Option to add new station appears when button is clicked", Toast.LENGTH_LONG).show();
            }
        });

        //Find the View that shows the Mozart Radio
        final TextView Mozart = (TextView) findViewById(R.id.Mozart);

        //Set click listener on that view
        Mozart.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Mozart View is clicked on.
            @Override
            public void onClick(View v) {
              Intent mozartIntent = new Intent(MainActivity.this, MozartRadio.class);
                startActivity(mozartIntent);
            }
        });

        //Find the View that shows Beethoven Radio
        final TextView Beethoven = (TextView) findViewById(R.id.Beethoven);

        //Set click listener on that view
        Beethoven.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Beethoven View is clicked on.
            @Override
            public void onClick(View v) {
                Intent beethovenIntent = new Intent(MainActivity.this, BeethovenRadio.class);
                startActivity(beethovenIntent);
            }

        });

        //Find the View that shows Chopin Radio
        final TextView Chopin = (TextView) findViewById(R.id.Chopin);

        //Set click listener on that view
        Chopin.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Chopin View is clicked on.
            @Override
            public void onClick(View v) {
                Intent chopinIntent = new Intent(MainActivity.this, ChopinRadio.class);
                startActivity(chopinIntent);
            }
        });

    }
}
