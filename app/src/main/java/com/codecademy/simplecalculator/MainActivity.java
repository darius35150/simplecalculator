/***********************************************************
 * Date Crated:   6/2/2020                                 *
 * Created by:    Darius Holley                            *
 * Project by:    Project worked through Codecademy Create *
 *                apps with Android Studio                 *
 ***********************************************************/


package com.codecademy.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondNumber = findViewById(R.id.number2);
        final RadioGroup operators = findViewById(R.id.operators);
        final RadioButton add = findViewById(R.id.add);
        final RadioButton subtract = findViewById(R.id.subtract);
        final Button equals = findViewById(R.id.equals);
        final TextView result = findViewById(R.id.result);

        equals.setOnClickListener(

                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {
                        final int firstNumberValue = Integer.parseInt(firstNumber.getText().toString());
                        final int secondNumberValue = Integer.parseInt(secondNumber.getText().toString());
                        final int operatorButtonId = operators.getCheckedRadioButtonId();
                        Integer answer;

                        if (operatorButtonId == add.getId()) {
                            answer = firstNumberValue + secondNumberValue;
                        } else {
                            answer = firstNumberValue - secondNumberValue;
                        }

                        result.setText(answer.toString());
                    }
                });
    }
}