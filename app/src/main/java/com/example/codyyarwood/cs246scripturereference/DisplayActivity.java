package com.example.codyyarwood.cs246scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        // Default values unchanged
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        // Receive information from previous activity
        Intent myIntent = getIntent();

        // Make a bundle to receive them all.
        Bundle received = myIntent.getExtras();

        // Assign our values
        String book = received.getString("book");
        String chap = received.getString("chap");
        String vers = received.getString("vers");

        //
        // Now all we do is display it using the id final_text and we're good to go
        //

        // Create a text view and put the strings together into a statement
        TextView statement = (TextView)findViewById(R.id.final_text);
        statement.setText("Your input is" + book + ' ' + chap + ':' + vers + '.');
    }
}