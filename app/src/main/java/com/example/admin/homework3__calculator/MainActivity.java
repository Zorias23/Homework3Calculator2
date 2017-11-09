package com.example.admin.homework3__calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityLogger";
    private TextView displayMath;
    private Button button;
    private String number1 = "";
    private String number2 = "";
    private String operator = "";
    private String unary = "";
    boolean number1assembled;
    boolean number2assembled;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
    }

    private void bindViews() {
        displayMath = findViewById(R.id.displayMath);
        button = findViewById(R.id.button7);
    }

    public void displayCharacter(View view) {

        Button b = (Button) view;
        int buttonId = b.getId();

        if (b.getId() == R.id.button7) {

        }
        switch (buttonId) {
            case R.id.button7:
                if (number1assembled == false)
                {
                    number1 += "7";
                    displayMath.setText(number1);
                }
                if (number1assembled == true && operator.length()>0)
                {
                    number2 += "7";
                    displayMath.setText(number1 + operator + number2);
                }

                break;
            case R.id.buttonCancel:
                displayMath.setText("0");
                number1 = "";
                number2 = "";
                operator = "";
                number1assembled = false;
                number2assembled = false;
                break;
            case R.id.button8:
                if (number1assembled == false)
                {
                    number1 += "8";
                    displayMath.setText(number1);
                }
                if (number1assembled == true && operator.length()>0)
                {
                    number2 += "8";
                    displayMath.setText(number1 + operator + number2);
                }
                break;
            case R.id.button9:
                if (number1assembled == false)
                {
                    number1+= "9";
                    displayMath.setText(number1);
                }
                if (number1assembled == true && operator.length()>0)
                {
                    number2 += "9";
                    displayMath.setText(number1 + operator + number2);
                }
                break;
            case R.id.button4:
                if (number1assembled == false)
                {
                    number1 += "4";
                    displayMath.setText(number1);
                }
                if (number1assembled == true && operator.length()>0)
                {
                    number2 += "4";
                    displayMath.setText(number1 + operator + number2);
                }
                break;
            case R.id.button5:
                if (number1assembled == false)
                {
                    number1 += "5";
                    displayMath.setText(number1);
                }
                if (number1assembled == true && operator.length()>0)
                {
                    number2 += "5";
                    displayMath.setText(number1 + operator + number2);
                }
                break;
            case R.id.button6:
                if (number1assembled == false)
                {
                    number1 += "6";
                    displayMath.setText(number1);
                }
                if (number1assembled == true && operator.length()>0)
                {
                    number2 += "6";
                    displayMath.setText(number1 + operator + number2);
                }
                break;
            case R.id.button1:
                if (number1assembled == false)
                {
                    number1 += "1";
                    displayMath.setText(number1);
                }
                if (number1assembled == true && operator.length()>0)
                {
                    number2 += "1";
                    displayMath.setText(number1 + operator + number2);
                }
                break;
            case R.id.button2:
                if (number1assembled == false)
                {
                    number1 += "2";
                    displayMath.setText(number1);
                }
                if (number1assembled == true && operator.length()>0)
                {
                    number2 += "2";
                    displayMath.setText(number1 + operator + number2);
                }
                break;
            case R.id.button3:
                if (number1assembled == false)
                {
                    number1 += "3";
                    displayMath.setText(number1);
                }
                if (number1assembled == true && operator.length()>0)
                {
                    number2 += "3";
                    displayMath.setText(number1 + operator + number2);
                }
                break;
            case R.id.button0:
                if (number1assembled == false)
                {
                    if (number1.length() == 0 || (!number1.equals(".") && Double.valueOf(number1)== 0))
                    {
                        break;
                    }
                    else
                    {
                        number1 += "0";
                        displayMath.setText(number1);
                    }

                }
                if (number1assembled == true && operator.length()>0)
                {
                    if (number1.length() == 0 || (!number1.equals(".") && Double.valueOf(number1)== 0))
                    {
                        break;
                    }
                    else
                    {
                        number2 += "0";
                        displayMath.setText(number1 + operator + number2);
                    }

                }
                break;
            case R.id.buttonDivide:
                if (number1 == "")
                {
                    break;
                }
                if (number1.length() > 0 && number2.length() > 0)
                {
                    break;
                }
                if (number1.length() >0 && number2 == "")
                {
                    number1assembled = true;
                    operator = "/";
                    displayMath.setText(number1 + "/");
                }

                break;
            case R.id.buttonMultiply:
                if (number1 == "")
                {
                    break;
                }
                if (number1.length() > 0 && number2.length() > 0)
                {
                    break;
                }
                if (number1.length() >0 && number2 == "")
                {
                    number1assembled = true;
                    operator = "X";
                    displayMath.setText(number1 + "X");
                }

                break;
            case R.id.buttonMinus:
                if (number1 == "")
                {
                    break;
                }
                if (number1.length() > 0 && number2.length() > 0)
                {
                    break;
                }
                if (number1.length() >0 && number2 == "")
                {
                    number1assembled = true;
                    operator = "-";
                    displayMath.setText(number1 + "-");
                }

                break;
            case R.id.buttonAdd:
                if (number1 == "")
                {
                    break;
                }
                if (number1.length() > 0 && number2.length() > 0)
                {
                    break;
                }
                if (number1.length() >0 && number2 == "")
                {
                    number1assembled = true;
                    operator = "+";
                    displayMath.setText(number1 + "+");
                }

                break;
            case R.id.buttonDecimal:
                if (number1assembled == false)
                {
                    if (number1.contains("."))
                    {
                        break;
                    }
                    number1 += ".";
                    displayMath.setText(number1);
                }
                if (number1assembled == true && operator.length()>0)
                {
                    if (number2.contains("."))
                    {
                        break;
                    }
                    number2 += ".";
                    displayMath.setText(number1 + operator + number2);
                }
                break;
            case R.id.buttonNegation:
                if (number1assembled == false)
                {

                    if (number1.contains("-"))
                    {
                        number1 = number1.replace("-", "");
                        displayMath.setText(number1);
                        break;
                    }
                    else
                    {
                        number1 = "-" + number1;
                        displayMath.setText(number1);
                    }

                }
                if (number1assembled == true && operator.length()>0)
                {
                    if (number2.contains("-"))
                    {
                        number2 = number2.replace("-", "");
                        displayMath.setText(number1 + operator + number2);
                        break;
                    }
                    else
                    {
                        number2 = "-" + number2;
                        displayMath.setText(number1 + operator + number2);
                    }



                }
                break;
            case R.id.buttonEquals:
                if (number1.length() >0 && number2.length()>0 && operator.length()>0)
                {
                    performMath(number1, number2, operator);
                }

                if (unary.length()> 0 && number1.length()> 0)
                {
                    number1 = performUnary(number1, unary);
                    unary = "";
                    displayMath.setText(number1);
                }

                break;

            case R.id.buttonSqrt:

                unary = "sqrt";

                break;
            case R.id.buttonSin:
                unary = "sin";

                break;
            case R.id.buttonCos:
                unary = "cos";

                break;
            case R.id.buttonTan:
                unary = "tan";

                break;
            case R.id.buttonLn:
                unary = "ln";

                break;
            case R.id.buttonLog:
                unary = "log";

                break;
            case R.id.button1overx:
                unary = "1overx";

                break;
            case R.id.buttonEtox:
                unary = "etox";

                break;
            case R.id.buttonXsquared:
                unary = "xsquared";

                break;
            case R.id.buttonAbs:
                unary = "abs";

                break;
            case R.id.buttonPi:
                unary = "pi";

                break;
            case R.id.buttonE:
                unary = "e";

                break;

        }

    }
    public String performUnary(String number1, String unary)
    {
        
        String result = "";
        double num1 = Double.valueOf(number1);
        switch (unary) {
            case "sqrt":
                num1 = Math.sqrt(num1);
                break;
            case "sin":
                num1 = Math.sin(num1);
                break;
            case "cos":
                num1 = Math.cos(num1);
                break;
            case "tan":
                num1 = Math.tan(num1);
                break;
            case "ln":
                num1 = Math.log(num1);
                break;
            case "log":
                num1 = Math.log10(num1);
                break;
            case "1overx":
                num1 = 1/num1;
                break;
            case "xquared":
                num1 = num1*num1;
                break;
            case "abs":
                num1 = Math.abs(num1);
                break;
            case "pi":
                num1 = Math.PI;
                break;
            case "e":
                num1 = Math.E;
                break;

        }
        result = String.valueOf(num1);
        return result;
    }
    public void performMath(String number1, String number2, String operator)
    {
        double num1 = 0;
        double num2 = 0;
        double result = 0;
        num1 = Double.valueOf(number1).doubleValue();
        num2 = Double.valueOf(number2).doubleValue();
        String resultString = "";
        switch (operator) {
            case "+":
                result = num1 + num2;
                resultString = String.valueOf(result);
                if (resultString.contains(".0"))
                {
                    resultString = resultString.replace(".0", "");
                }
                displayMath.setText(resultString);
                break;
            case "-":
                result = num1 - num2;
                resultString = String.valueOf(result);
                if (resultString.contains(".0"))
                {
                    resultString = resultString.replace(".0", "");
                }
                displayMath.setText(resultString);
                break;
            case "X":
                result = num1 * num2;
                resultString = String.valueOf(result);
                if (resultString.contains(".0"))
                {
                    resultString = resultString.replace(".0", "");
                }
                displayMath.setText(resultString);
                break;
            case "/":
                result = num1 / num2;
                resultString = String.valueOf(result);
                if (resultString.contains(".0"))
                {
                    resultString = resultString.replace(".0", "");
                }
                displayMath.setText(resultString);
                break;
        }
    }
}