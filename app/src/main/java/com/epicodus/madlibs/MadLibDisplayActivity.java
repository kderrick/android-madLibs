package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MadLibDisplayActivity extends AppCompatActivity {

    public static final String TAG = MadLibDisplayActivity.class.getSimpleName();
    private TextView mDisplayMadLibsTextView;
    private Button mHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib_display);

        mDisplayMadLibsTextView = (TextView) findViewById(R.id.displayMadLibsTextView);

        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String adjective = intent.getStringExtra("adjective");
        String verb = intent.getStringExtra("verb");
        String madLib = ("Here is our story. One time a "  + noun + " with " +  adjective + " fur" + "something something something" +  verb);
        mDisplayMadLibsTextView.setText(madLib);

        mHomeButton = (Button) findViewById(R.id.homeButton);
        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MadLibDisplayActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });


    };
}
