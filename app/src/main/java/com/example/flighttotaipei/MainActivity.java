package com.example.flighttotaipei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn3;
    Button btn1,btn2;
    CheckBox checkBox1, checkBox2;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn3 = findViewById(R.id.button3);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        tv1 = findViewById(R.id.textView5);

        TextView costt;

        if (tv1 == 1) {
            costt
        }



        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tripp = "";

                if (checkBox1.isChecked() == true) {
                    tripp = "One Way Trip";
                }
                if (checkBox2.isChecked() == true) {
                    tripp = "Round Trip" ;
                }

            }
        });

        if (tv1 == 1) {

        }

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), FightDetails.class);
                intent.putExtra("ticket","You have selected ");
                intent.putExtra("cost", "Your air ticket costs $");
                startActivity(intent);
            }
        });
    }
}
