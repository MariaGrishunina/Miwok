package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of words
        String[] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        /*or
          String words [] = new String [] {"one","two","three","four","five","six","seven",
          "eight","nine","ten"}; */

        /* or
        // Create Array of English Numbers
        String words [] = new String [] {
                getResources().getString(R.string.eng_1), getResources().getString(R.string.eng_2),
                getResources().getString(R.string.eng_3), getResources().getString(R.string.eng_4),
                getResources().getString(R.string.eng_5), getResources().getString(R.string.eng_6),
                getResources().getString(R.string.eng_7), getResources().getString(R.string.eng_8),
                getResources().getString(R.string.eng_9), getResources().getString(R.string.eng_10)
        };
         */

        Log.v("NumberActivity", "Word at index 0: " + words[0]);
        Log.v("NumberActivity", "Word at index 1: " + words[1]);
    }
}
