package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random myRandom = new Random();

        Button mybutton = (Button) findViewById(R.id.random_button);
        final TextView generateNumber = (TextView) findViewById(R.id.result);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateNumber.setText(String.valueOf(myRandom.nextInt(10)));
            }
        });
    }
}
