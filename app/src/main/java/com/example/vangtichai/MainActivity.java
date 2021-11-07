package com.example.vangtichai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editField;
    Boolean isFirstEdit = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editField = findViewById(R.id.editTaka);
    }

    public void NumberInputEvent(View view) {
        if(isFirstEdit){
            editField.setText("");
            isFirstEdit = false;
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
                    number = "";
                    break;
                }else{
                    number += 0;
                    break;
                }
        }
        editField.setText(number);
    }
}