package com.example.flighttotaipei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FightDetails extends AppCompatActivity {

    TextView tvAnswer, tvAnswer2;
    String tripp, costt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight_details);

        tvAnswer = findViewById(R.id.textView001);
        tvAnswer2 = findViewById(R.id.textView002);

        Intent intentReceived = getIntent();
        String value0 = intentReceived.getStringExtra("ticket");
        tvAnswer.setText(value0 + tripp);

        Intent intentReceived1 = getIntent();
        String value1 = intentReceived1.getStringExtra("cost");
        tvAnswer2.setText(value1 +  costt);
    }
}
