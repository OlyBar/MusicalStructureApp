package com.example.olympiabardis.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MozartRadio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mozart_radio);

        //Find the View that shows the Download
        final TextView Download = (TextView) findViewById(R.id.download);

        //Set click listener on that view
        Download.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Mozart View is clicked on.
            @Override
            public void onClick(View v) {
                Intent downloadIntent = new Intent(MozartRadio.this, Download.class);
                startActivity(downloadIntent);
            }
        });

    }
}
