package com.example.maxim.a5lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView First;
    Button Second;
    View.OnClickListener obrabotka = new View.OnClickListener() {
        public void onClick(View v) {
            First.setText(" Пока Дядя Рубель !");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          First = (TextView) findViewById(R.id.TextView);
          Second = (Button) findViewById(R.id.button2);
           Second.setOnClickListener(obrabotka);
    }
}

