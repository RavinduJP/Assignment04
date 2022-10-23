package com.example.assignment_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView firstNumber,secondNumber,answer,editAnswer;
    EditText editFirstNum,editSecondNum;
    Button add,subtraction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        firstNumber = (TextView) findViewById(R.id.firstNumber);
//        secondNumber = (TextView) findViewById(R.id.secondNumber);
//        answer = (TextView) findViewById(R.id.answer);

        //define variables with id.
        editAnswer = (TextView) findViewById(R.id.editAnswer);
        editFirstNum = (EditText) findViewById(R.id.editFirstNum);
        editSecondNum = (EditText) findViewById(R.id.editSecondNum);

        add = (Button) findViewById(R.id.add);
        subtraction = (Button) findViewById(R.id.subtraction);

        //create the adding and subtract methods
        onAdd();
        onSubtract();
    }
//Method for add two numbers.
    private void onAdd() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editFirstNum.getText().toString());
                double num2 = Double.parseDouble(editSecondNum.getText().toString());
                double result = num1 + num2;
                editAnswer.setText(Double.toString(result));
            }
        });
    }
//Method for subtract two numbers.
    private void onSubtract() {
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editFirstNum.getText().toString());
                double num2 = Double.parseDouble(editSecondNum.getText().toString());
                double result = num1 - num2;
                editAnswer.setText(Double.toString(result));
            }
        });
    }
}