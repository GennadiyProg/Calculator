package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button mButton0, mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7, mButton8,
            mButton9, mButtonPoint, mButtonAdd, mButtonSub, mButtonDiv, mButtonMul, mButtonEq, mButtonM, mButtonMR, mButtonMC, mButtonPerc;
    EditText mEditText;
    float mValueOne , mValueTwo;
    boolean mAddition, mSubtract, mMultiplication, mDivision;
    float internalStorage;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton0 = (Button) findViewById(R.id.button0);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton6 = (Button) findViewById(R.id.button6);
        mButton7 = (Button) findViewById(R.id.button7);
        mButton8 = (Button) findViewById(R.id.button8);
        mButton9 = (Button) findViewById(R.id.button9);
        mButtonPoint = (Button) findViewById(R.id.buttonPoint);
        mButtonAdd = (Button) findViewById(R.id.buttonAdd);
        mButtonSub = (Button) findViewById(R.id.buttonSub);
        mButtonMul = (Button) findViewById(R.id.buttonMul);
        mButtonDiv = (Button) findViewById(R.id.buttonDiv);
        mButtonEq = (Button) findViewById(R.id.buttonEq);
        mButtonM = (Button) findViewById(R.id.buttonM);
        mButtonMR = (Button) findViewById(R.id.buttonMR);
        mButtonMC = (Button) findViewById(R.id.buttonMC);
        mButtonPerc = (Button) findViewById(R.id.buttonPerc);
        mEditText = (EditText) findViewById(R.id.editText1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "1");
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "2");
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "3");
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "4");
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "5");
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "6");
            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "7");
            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "8");
            }
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "9");
            }
        });
        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "0");
            }
        });
        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(mEditText.getText() + "");
                    mAddition = true;
                    mEditText.setText(null);
                }
            }
        });
        mButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(mEditText.getText() + "");
                    mSubtract = true;
                    mEditText.setText(null);
                }
            }
        });
        mButtonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(mEditText.getText() + "");
                    mMultiplication = true;
                    mEditText.setText(null);
                }
            }
        });
        mButtonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(mEditText.getText() + "");
                    mDivision = true;
                    mEditText.setText(null);
                }
            }
        });
        mButtonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(mEditText.getText() + "");
                if (mAddition == true ) {
                    mEditText.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }
                if (mSubtract == true ) {
                    mEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }
                if (mMultiplication == true ) {
                    mEditText.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }
                if (mDivision == true ) {
                    mEditText.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });
        mButtonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + ".");
            }
        });
        mButtonPerc.setOnClickListener(v -> {
            if (mEditText == null) {
                mEditText.setText("");
            } else {
                mValueOne = Float.parseFloat(mEditText.getText() + "");
                mEditText.setText(mValueOne / 100.0f + "");
            }
        });
        mButtonM.setOnClickListener(v -> {
            if (mEditText != null) {
                internalStorage = Float.parseFloat((mEditText.getText() + ""));
                mEditText.setText("");
            }
        });
        mButtonMR.setOnClickListener(v -> {
            mEditText.setText(mEditText.getText() + Float.toString(internalStorage));
        });
        mButtonMC.setOnClickListener(v -> {
            mEditText.setText("");
            internalStorage = 0.0f;
        });
    }
}