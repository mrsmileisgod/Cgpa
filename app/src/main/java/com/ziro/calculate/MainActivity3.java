package com.ziro.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText editTextNumberDecimal;
    Button button3;
    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button3=findViewById(R.id.button3);
        editTextNumberDecimal=findViewById(R.id.editTextNumberDecimal);
        textView5=findViewById(R.id.textView5);

//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getCgpa(v);
//            }
//        });


    }
    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    public void getCgpa(View view){
        String s=editTextNumberDecimal.getText().toString();
        double per=Double.parseDouble(s);
        double cgpa=per/9.5;
        if(per>100 || per==0){
            textView5.setText("Enter Valid Value!");
        }
        else if(per>=95){
            textView5.setText("Your CGPA is : 10");
        }
        else {
            textView5.setText("Your CGPA is : " + String.format("% .1f", cgpa));
        }

    }
}