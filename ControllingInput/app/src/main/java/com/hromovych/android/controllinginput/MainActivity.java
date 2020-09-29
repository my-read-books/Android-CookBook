package com.hromovych.android.controllinginput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.MultiTapKeyListener;
import android.text.method.QwertyKeyListener;
import android.text.method.TextKeyListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Allows digits with positive/negative signs and decimal points
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        DigitsKeyListener digkl1 = DigitsKeyListener.getInstance(true, true);
        editText1.setKeyListener(digkl1);
// Allows positive integers only (no decimal values allowed)
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        DigitsKeyListener digkl2 = DigitsKeyListener.getInstance();
        editText2.setKeyListener(digkl2);
// Allows dates only
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        DateKeyListener dtkl = new DateKeyListener();
        editText3.setKeyListener(dtkl);
// Allows multitap with 12-key keypad layout
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        MultiTapKeyListener multitapkl =
                new MultiTapKeyListener(TextKeyListener.Capitalize.WORDS, true);
        editText4.setKeyListener(multitapkl);
// Allows qwerty layout for typing
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        QwertyKeyListener qkl =
                new QwertyKeyListener(TextKeyListener.Capitalize.SENTENCES, true);
        editText5.setKeyListener(qkl);
    }
}