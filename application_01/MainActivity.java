package com.android.garima.application_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private TextView login;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.editText);
        password=findViewById(R.id.editPass);
        login= findViewById(R.id.textView);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(),password.getText().toString());
            }
        });
        }

        private void validate(String username ,String pass)
        {
            if((username.equals("Admin"))&&(pass.equals("12234")))
            {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);


            }
            else
            {
                counter--;
                if(counter==0)
                {
                    login.setEnabled(false);
                }

            }
        }
}


