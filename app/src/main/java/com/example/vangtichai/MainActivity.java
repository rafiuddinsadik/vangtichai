package com.example.vangtichai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editField;
    Boolean isFirstEdit = true;
    TextView resultTab;
    TextView resultTitle;
    Button resetBtn;
    Button calculate;
    Button clearField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editField = findViewById(R.id.editTaka);
        resultTab = findViewById(R.id.resultView);
        resultTitle = findViewById(R.id.resultTitle);
        resetBtn = findViewById(R.id.resetBtn);
        clearField = findViewById(R.id.clearField);
        calculate = findViewById(R.id.calculate);
    }

    public void NumberInputEvent(View view) {
        if(isFirstEdit){
            editField.setText("");
            isFirstEdit = false;
            clearField.setVisibility(View.VISIBLE);
            calculate.setEnabled(true);
        }
        String number = editField.getText().toString();
        switch (view.getId()){
            case R.id.val1:
                number += 1;
                break;
            case R.id.val2:
                number += 2;
                break;
            case R.id.val3:
                number += 3;
                break;
            case R.id.val4:
                number += 4;
                break;
            case R.id.val5:
                number += 5;
                break;
            case R.id.val6:
                number += 6;
                break;
            case R.id.val7:
                number += 7;
                break;
            case R.id.val8:
                number += 8;
                break;
            case R.id.val9:
                number += 9;
                break;
            case R.id.val0:
                if(number.equals("")){
                    isFirstEdit = true;
                    clearField.setVisibility(View.GONE);
                    calculate.setEnabled(false);
                    number = "";
                    break;
                }else{
                    number += 0;
                    break;
                }
        }
        editField.setText(number);
    }

    public void CalculateVangti(View view) {
        resultTitle.setVisibility(View.VISIBLE);
        resultTab.setVisibility(View.VISIBLE);
        resetBtn.setVisibility(View.VISIBLE);
        long val = Long.parseLong(editField.getText().toString());
        int[] arr = {500, 100, 50, 20, 10, 5, 2, 1};
        String result = "";
        for (int j : arr) {
            if (val / j != 0) {
                result += val / j + " Note(s) of " + j + "BDT \n";
                val = val % j;
            }
        }
        resultTab.setText(result);
    }

    public void ResetEverything(View view) {
        resultTitle.setVisibility(View.GONE);
        resultTab.setVisibility(View.GONE);
        resetBtn.setVisibility(View.GONE);
        clearField.setVisibility(View.GONE);
        calculate.setEnabled(false);
        editField.setText("");
        isFirstEdit = true;
    }

    public void ClearField(View view) {
        editField.setText("");
        clearField.setVisibility(View.GONE);
        editField.setText("");
        calculate.setEnabled(false);
        isFirstEdit = true;
    }
}