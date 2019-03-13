package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numberOne= 0;
    int numberTwo= 0;
    EditText firstInput;
    EditText secondInput;
    TextView resultView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInput = findViewById(R.id.editText);
        secondInput = findViewById(R.id.editText2);
        resultView = findViewById(R.id.textView);



    }

    protected void addNumbers(View view){

        int numberOne = Integer.parseInt(firstInput.getText().toString());
        int numberTwo= Integer.parseInt(secondInput.getText().toString());

        int sum=numberOne + numberTwo;
        resultView.setText(Integer.toString(sum));
    }
}
