    package com.example.aravi.calculator;

    import android.graphics.Color;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.View;
    import android.view.animation.AlphaAnimation;
    import android.widget.Button;
    import android.widget.TextView;
    import android.widget.ToggleButton;

    public class MainActivity extends AppCompatActivity {

        private Button btnZero;
        private Button btnOne;
        private Button btnTwo;
        private Button btnThree;
        private Button btnFour;
        private Button btnFive;
        private Button btnSix;
        private Button btnSeven;
        private Button btnEight;
        private Button btnNine;
        private Button btnDecimal;
        private Button btnEqualTo;
        private Button btnClear;
        private Button btnDelete;
        private Button btnAdd;
        private Button btnSub;
        private Button btnMul;
        private Button btnDiv;
        private Button btnMemoryAdd;
        private Button btnMemorySub;
        private Button btnMemoryRecall;
        private Button btnMemoryClear;
        private TextView display;
        private TextView result;
        private double value1 = Double.NaN;
        private double value2 = Double.NaN;
        private char operation_involved;
        private int equalToCount = 0;
        private Button btnToggle;
        private double memory_val;
        private AlphaAnimation buttonClick; //from stack overflow


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            initializeView();
            buttonClick = new AlphaAnimation(1F, 0.8F); //from stack overflow

            display.setText("0");

            btnZero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateInputLength()){
                        if(!display.getText().toString().equals("0"))
                          display.setText(display.getText().toString() + "0");
                        else
                            display.setText("0");
                    }

                }
            });

            btnOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateInputLength()){
                        if(!display.getText().toString().equals("0"))
                            display.setText(display.getText().toString() + "1");
                        else
                            display.setText("1");
                    }


                }
            });

            btnTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateInputLength()){
                        if(!display.getText().toString().equals("0"))
                            display.setText(display.getText().toString() + "2");
                        else
                            display.setText("2");
                    }
                }
            });

            btnThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateInputLength()){
                        if(!display.getText().toString().equals("0"))
                            display.setText(display.getText().toString() + "3");
                        else
                            display.setText("3");
                    }
                }
            });

            btnFour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateInputLength()){
                        if(!display.getText().toString().equals("0"))
                            display.setText(display.getText().toString() + "4");
                        else
                            display.setText("4");
                    }
                }
            });

            btnFive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateInputLength()){
                        if(!display.getText().toString().equals("0"))
                            display.setText(display.getText().toString() + "5");
                        else
                            display.setText("5");
                    }
                }
            });

            btnSix.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateInputLength()){
                        if(!display.getText().toString().equals("0"))
                            display.setText(display.getText().toString() + "6");
                        else
                            display.setText("6");
                    }
                }
            });

            btnSeven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateInputLength()){
                        if(!display.getText().toString().equals("0"))
                            display.setText(display.getText().toString() + "7");
                        else
                            display.setText("7");
                    }

                }
            });

            btnEight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateInputLength()){
                        if(!display.getText().toString().equals("0"))
                            display.setText(display.getText().toString() + "8");
                        else
                            display.setText("8");
                    }
                }
            });

            btnNine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateInputLength()){
                        if(!display.getText().toString().equals("0"))
                            display.setText(display.getText().toString() + "9");
                        else
                            display.setText("9");
                    }
                }
            });

            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateOperatorSequence()) {
                        calculate();
                        operation_involved = '+';
                        if (!Double.isNaN(value1))
                            result.setText(String.valueOf(value1) + "+");
                        display.setText(null);
                        equalToCount = 0;
                    }


                }
            });

            btnSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateOperatorSequence()) {
                        calculate();
                        operation_involved = '-';
                        if (!Double.isNaN(value1))
                            result.setText(String.valueOf(value1) + "-");
                        display.setText(null);
                        equalToCount = 0;
                    }

                }
            });

            btnMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateOperatorSequence()) {
                        calculate();
                        operation_involved = '*';
                        if (!Double.isNaN(value1))
                            result.setText(String.valueOf(value1) + "*");
                        display.setText(null);
                        equalToCount = 0;
                    }

                }
            });

            btnDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateOperatorSequence()) {
                        calculate();
                        operation_involved = '/';
                        if (!Double.isNaN(value1))
                            result.setText(String.valueOf(value1) + "/");
                        display.setText(null);
                        equalToCount = 0;
                    }

                }
            });

            btnDecimal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateOperatorSequence() && validateDecimal()) {
                        display.setText(display.getText().toString() + ".");
                    }
                }
            });

            btnEqualTo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (validateOperatorSequenceForEqualTo()) {
                        equalToCount++;
                        if (equalToCount == 1) {
                            calculate();
                            operation_involved = '=';
                            if (!Double.isNaN(value1) && !Double.isNaN(value2)) {
                                if (String.valueOf(value1) != "Infinity") {
                                    result.setText(String.valueOf(value1));
                                } else {
                                    result.setText("Cannot divide by zero");
                                    value1 = Double.NaN;
                                    value2 = Double.NaN;
                                }
                                display.setText(null);

                            }
                        }


                    }
                }
            });

            btnClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    value1 = Double.NaN;
                    value2 = Double.NaN;
                    display.setText(null);
                    result.setText(null);
                    equalToCount = 0;
                    display.setText("0");
                }
            });

            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (display.getText().length() > 0) {
                        //Deleting the last character
                        CharSequence words = display.getText().toString();
                        display.setText(words.subSequence(0, words.length() - 1));
                    } else {
                        //Flushing out the entire content
                        value1 = Double.NaN;
                        value2 = Double.NaN;
                        display.setText(null);
                        result.setText(null);
                        equalToCount = 0;
                        display.setText("0");

                    }
                }
            });

            btnToggle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (display.getText().length() > 0) {
                        //Changing the sign of the number present in display text view
                        double dummy = -1 * Double.parseDouble(display.getText().toString());
                        if (!Double.isNaN(dummy))
                            display.setText(String.valueOf(dummy));
                    } else {
                        //if no new input is present in the display text view, the recent result value is considered
                        value1 = -1 * value1;
                        if (!Double.isNaN(value1)) {
                            display.setText(String.valueOf(value1));

                        }


                    }


                }
            });

            btnMemoryAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (display.getText().length() > 0) {
                        memory_val = memory_val + Double.parseDouble(display.getText().toString());
                        display.setText(null);
                        result.setText(null);
                        value1 = Double.NaN;
                        value2 = Double.NaN;

                    } else {
                        memory_val = memory_val + value1;
                        display.setText(null);
                        result.setText(null);
                        value1 = Double.NaN;
                        value2 = Double.NaN;
                    }
                    btnMemoryRecall.setTextColor(Color.parseColor("#ffffff"));
                }
            });

            btnMemorySub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (display.getText().length() > 0) {
                        memory_val = memory_val - Double.parseDouble(display.getText().toString());
                        display.setText(null);
                        result.setText(null);

                    } else {
                        if (!Double.isNaN(value1))
                            memory_val = memory_val - value1;
                        display.setText(null);
                        result.setText(null);
                    }
                    btnMemoryRecall.setTextColor(Color.parseColor("#ffffff"));
                }
            });

            btnMemoryClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    memory_val = 0;
                    display.setText(null);
                    btnMemoryRecall.setTextColor(Color.parseColor("#000000"));
                }
            });

            btnMemoryRecall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(buttonClick);
                    if (!Double.isNaN(memory_val))
                        display.setText(String.valueOf(memory_val));
                }
            });


        }

        private void initializeView() {

            btnZero = findViewById(R.id.btn0);
            btnOne = findViewById(R.id.btn1);
            btnTwo = findViewById(R.id.btn2);
            btnThree = findViewById(R.id.btn3);
            btnFour = findViewById(R.id.btn4);
            btnFive = findViewById(R.id.btn5);
            btnSix = findViewById(R.id.btn6);
            btnSeven = findViewById(R.id.btn7);
            btnEight = findViewById(R.id.btn8);
            btnNine = findViewById(R.id.btn9);
            btnDecimal = findViewById(R.id.btndot);
            btnClear = findViewById(R.id.btnclear);
            btnDelete = findViewById(R.id.btnDel);
            btnEqualTo = findViewById(R.id.btnequalto);
            btnAdd = findViewById(R.id.btnadd);
            btnSub = findViewById(R.id.btnsub);
            btnMul = findViewById(R.id.btnmul);
            btnDiv = findViewById(R.id.btndiv);
            btnToggle = findViewById(R.id.btnToggle);
            btnMemoryAdd = findViewById(R.id.btnmadd);
            btnMemorySub = findViewById(R.id.btnmsub);
            btnMemoryRecall = findViewById(R.id.btnmread);
            btnMemoryClear = findViewById(R.id.btnmc);
            display = findViewById(R.id.textDisplay);
            result = findViewById(R.id.textResult);
        }

        private void calculate() {
            if (!Double.isNaN(value1)) {
                if (display.getText().length() > 0) {

                    value2 = Double.parseDouble(display.getText().toString());

                    switch (operation_involved) {
                        case '+':
                            value1 = value1 + value2;
                            break;
                        case '-':
                            value1 = value1 - value2;
                            break;
                        case '*':
                            value1 = value1 * value2;
                            break;
                        case '/':
                            value1 = value1 / value2;
                            break;
                        case '=':
                            break;

                    }
                }


            } else {
                if (display.getText().length() > 0)
                    value1 = Double.parseDouble(display.getText().toString());
            }

        }

        //Validates for two consecutive operators
        private boolean validateOperatorSequence() {
            if (result.getText().length() > 0) {
                CharSequence input = result.getText().toString();
                if (input.length() - 1 == '+' || input.length() - 1 == '-' || input.length() - 1 == '*' || input.length() - 1 == '/' || input.length() - 1 == '.') {
                    return false;
                }
            }
            return true;
        }

        private boolean validateOperatorSequenceForEqualTo() {
            if (result.getText().length() > 0) {
                CharSequence input = result.getText().toString();
                if ((input.length() - 1 == '+' || input.length() - 1 == '-' || input.length() - 1 == '*' || input.length() - 1 == '/' || input.length() - 1 == '.') && (display.getText().length() > 0)) {
                    return false;
                }
            }
            return true;
        }

        //Checks if the input has more than one decimal
        private boolean validateDecimal() {
            if (display.getText().length() > 0) {
                String input = display.getText().toString();
                if (display.getText().length() > 0 && input.contains(".")) {
                    return false;
                }
            }
            return true;
        }

        //Checks if the input length is less than or equal to 10 (excluding decimal)
        private boolean validateInputLength() {
            if (display.getText().length() > 0) {
                String input = display.getText().toString();

                if (input.contains("-")) {
                    if (display.getText().length() <= 11 && input.contains(".")) {
                        return true;
                    } else if (display.getText().length() <= 10 && !input.contains(".")) {
                        return true;
                    }

                } else {
                    if (display.getText().length() <= 10 && input.contains(".")) {
                        return true;
                    } else if (display.getText().length() <= 9 && !input.contains(".")) {
                        return true;
                    }
                }
            } else {
                return true;
            }
            return false;


        }
    }