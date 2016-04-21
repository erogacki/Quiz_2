package com.example.erogacki.quiz_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText totalAs=(EditText) findViewById(R.id.totalAs);

        final EditText totalBs=(EditText) findViewById(R.id.totalBs);

        final EditText totalCs=(EditText) findViewById(R.id.totalCs);

        final EditText totalDs=(EditText) findViewById(R.id.totalDs);

        final EditText totalFs=(EditText) findViewById(R.id.totalFs);

        final EditText totalStudents=(EditText) findViewById(R.id.totalStudents);

        final double a_Grade = Double.parseDouble(totalAs.getText().toString());

        final double b_Grade = Double.parseDouble(totalBs.getText().toString());

        final double c_Grade = Double.parseDouble(totalCs.getText().toString());

        final double d_Grade = Double.parseDouble(totalDs.getText().toString());

        final double f_Grade = Double.parseDouble(totalFs.getText().toString());

        final double total = Double.parseDouble(totalStudents.getText().toString());


        Button calculate = (Button) findViewById(R.id.calcbtn);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double percentas = calculation(a_Grade, total);
                TextView As = percentas;
                double percentbs = calculation(b_Grade, total);
                TextView Bs = percentbs;
                double percentcs = calculation(c_Grade, total);
                TextView Cs = percentcs;
                double percentds = calculation(d_Grade, total);
                TextView Ds = percentds;
                double percentfs = calculation(f_Grade, total);
                TextView Fs = percentfs;

            }
        });

    }

    public Double calculation( Double grade, Double total) {


        double percentage = (grade/total) * 100;

        return percentage;
    }




}
