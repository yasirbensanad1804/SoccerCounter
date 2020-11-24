package com.example.soccercounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button upa, upb, reset;
    TextView tvA, tvB;
    Integer nilaiA, nilaiB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvA = (TextView) findViewById(R.id.tv_a);
        tvB = (TextView) findViewById(R.id.tv_b);

        upa = (Button) findViewById(R.id.upa);
        upb = (Button) findViewById(R.id.upb);

        reset = (Button) findViewById(R.id.btn_reset);

        nilaiA = 0;
        nilaiB = 0;

        upa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upa();
            }
        });
        upb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upb();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
    }

    public void upa(){
        nilaiA += 1;
        tvA.setText(nilaiA.toString());
    }

    public void upb(){
        nilaiB += 1;
        tvB.setText(nilaiB.toString());
    }

    public void reset(){
        nilaiA = 0;
        nilaiB = 0;
        tvA.setText(nilaiA.toString());
        tvB.setText(nilaiB.toString());
    }

}
