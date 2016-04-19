package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mSubmitButton;
    private EditText mNounEditText;
    private EditText mAdjectiveEditText;
    private EditText mVerbEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNounEditText = (EditText) findViewById(R.id.nounEditText);
        mAdjectiveEditText = (EditText) findViewById(R.id.adjectiveEditText2);
        mVerbEditText = (EditText) findViewById(R.id.verbEditText3);
        mSubmitButton = (Button) findViewById(R.id.submitButton);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noun = mNounEditText.getText().toString();
                String adjective = mAdjectiveEditText.getText().toString();
                String verb = mVerbEditText.getText().toString();
                Log.d(TAG, noun);
                Log.d(TAG, adjective);
                Log.d(TAG, verb);

                Intent intent = new Intent(MainActivity.this, MadLibDisplayActivity.class);
                intent.putExtra("noun", noun);
                intent.putExtra("adjective", adjective);
                intent.putExtra("verb", verb);
                startActivity(intent);
            }
        });
    }
}
