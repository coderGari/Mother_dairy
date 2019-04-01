package com.android.garima.application_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private EditText day_no;
    private Button submit;
    private TextView paise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        day_no=findViewById(R.id.day);
        submit=findViewById(R.id.submit);
        paise=findViewById(R.id.paise);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no_day=Integer.parseInt(day_no.getText().toString());
                cal_paise(no_day);
            }
        });
    }

    private void cal_paise(int days)
    {
        float kg=1;
        float rs=60;
        double total_kg=1.5*days;

        double total_rs=(rs/kg)*total_kg;
        String RS=String.valueOf(total_rs);
        paise.setText(RS);
    }
}
