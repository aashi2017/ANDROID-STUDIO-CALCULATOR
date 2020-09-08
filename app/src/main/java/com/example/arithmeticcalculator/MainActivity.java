package com.example.arithmeticcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.io.StringWriter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnplus,btnminus,btnmul,btndiv,btndot,btnequal,clear;
    private EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btnplus=findViewById(R.id.btnPlus);
        btnminus=findViewById(R.id.btnMinus);
        btnmul=findViewById(R.id.btnMult);
        btndiv=findViewById(R.id.btnDiv);
        btndot=findViewById(R.id.btnDecimal);
        btnequal=findViewById(R.id.btnEqual);
        clear=findViewById(R.id.clear);
        result=findViewById(R.id.displayPanel);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnplus.setOnClickListener(this);
        btnminus.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btndot.setOnClickListener(this);
        btnequal.setOnClickListener(this);
        clear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn1:
                result.setText(result.getText()+"1");
                break;

            case R.id.btn2:
                result.setText(result.getText()+"2");
                break;

            case R.id.btn3:
                result.setText(result.getText()+"3");
                break;

            case R.id.btn4:
                result.setText(result.getText()+"4");
                break;

            case R.id.btn5:
                result.setText(result.getText()+"5");
                break;

            case R.id.btn6:
                result.setText(result.getText()+"6");
                break;

            case R.id.btn7:
                result.setText(result.getText()+"7");
                break;

            case R.id.btn8:
                result.setText(result.getText()+"8");
                break;

            case R.id.btn9:
                result.setText(result.getText()+"9");
                break;

            case R.id.btn0:
                result.setText(result.getText()+"0");
                break;

            case R.id.btnPlus:
                result.setText(result.getText()+"+");
                break;

            case R.id.btnMinus:
                result.setText(result.getText()+"-");
                break;

            case R.id.btnMult:
                result.setText(result.getText()+"*");
                break;

            case R.id.btnDiv:
                result.setText(result.getText()+"/");
                break;

            case R.id.btnDecimal:
                result.setText(result.getText()+".");
                break;

            case R.id.btnEqual:
                String txt=result.getText().toString();
                Expression expression=new ExpressionBuilder(txt).build();
                try
                {
                    double res=expression.evaluate();
                    result.setText(Double.toString(res));
                }
                catch (ArithmeticException e)
                {
                    result.setText("ERROR");
                }
                break;

            case R.id.clear:
                result.setText("");
                break;
        }
    }
}
