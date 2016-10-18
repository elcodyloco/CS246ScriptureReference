package com.example.codyyarwood.cs246scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        // Default values unchanged.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Make a button object
        Button myButton = (Button) findViewById(R.id.btn_submit);

        // Listening for the button to be pressed
        myButton.setOnClickListener(new View.OnClickListener() {

            // New OnClick triggers submit feature
            public void onClick(View myView) {
                Intent myIntent = new Intent(MainActivity.this, DisplayActivity.class);
                startActivity(myIntent);
            }
        });
    }

    public void submit(View view){

        Intent myIntent = new Intent(this, DisplayActivity.class);

        EditText book = (EditText)findViewById(R.id.prompt_book);
        EditText chap = (EditText)findViewById(R.id.prompt_chap);
        EditText vers = (EditText)findViewById(R.id.prompt_vers);

        myIntent.putExtra("book", book.getText().toString());
        myIntent.putExtra("chap", chap.getText().toString());
        myIntent.putExtra("vers", vers.getText().toString());

        startActivity(myIntent);
    }
}