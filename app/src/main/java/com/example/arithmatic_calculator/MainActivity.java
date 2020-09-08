package com.example.arithmatic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.arithmeticcalculator.R;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonDecimal;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMult;
    private Button buttonDiv;
    private Button buttonEqual;
    private EditText displayPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        buttonDecimal = findViewById(R.id.btnDecimal);
        buttonEqual = findViewById(R.id.btnEqual);
        buttonPlus = findViewById(R.id.btnPlus);
        buttonMinus = findViewById(R.id.btnMinus);
        buttonMult = findViewById(R.id.btnMult);
        buttonDiv = findViewById(R.id.btnDiv);
        displayPanel = findViewById(R.id.displayPanel);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonDecimal.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn0:
                displayPanel.setText(displayPanel.getText() + "0");
                break;
            case R.id.btn1:
                displayPanel.setText(displayPanel.getText() + "1");
                break;
                case R.id.btn2:
                displayPanel.setText(displayPanel.getText() + "2");
                break;
            case R.id.btn3:
                displayPanel.setText(displayPanel.getText() + "3");
                break;
                case R.id.btn4:
                displayPanel.setText(displayPanel.getText() + "4");
                break;
            case R.id.btn5:
                displayPanel.setText(displayPanel.getText() + "5");
                break;
                case R.id.btn6:
                displayPanel.setText(displayPanel.getText() + "6");
                break;
            case R.id.btn7:
                displayPanel.setText(displayPanel.getText() + "7");
                break;
                case R.id.btn8:
                displayPanel.setText(displayPanel.getText() + "8");
                break;
            case R.id.btn9:
                displayPanel.setText(displayPanel.getText() + "9");
                break;
            case R.id.btnDecimal:
                displayPanel.setText(displayPanel.getText() + ".");
                break;
            case R.id.btnPlus:
                displayPanel.setText(displayPanel.getText() + "+");
                break;
            case R.id.btnMinus:
                displayPanel.setText(displayPanel.getText() + "-");
                break;
            case R.id.btnDiv:
                displayPanel.setText(displayPanel.getText() + "/");
                break;
                case R.id.btnMult:
                displayPanel.setText(displayPanel.getText() + "*");
                break;
            case R.id.btnEqual:
                if(TextUtils.isEmpty(displayPanel.getText())){
                    Toast.makeText(getApplicationContext(),"Enter expression", Toast.LENGTH_SHORT).show();
                }
                else{
                    Expression expression = new ExpressionBuilder(displayPanel.getText().toString()).build();
                    double result = expression.evaluate();
                    String answer = Double.toString(result);
                    displayPanel.setText(answer);
                }
                break;
        }

    }


}
