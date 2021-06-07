package com.ziro.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView7;
    TextView textView8;
    EditText editText;
    EditText editText2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        Editable marks1=editText.getText();
//        Editable marks2=editText2.getText();
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        button3=findViewById(R.id.button3);

        button3.setOnClickListener(this::getPercent);

    }
    @SuppressLint({"DefaultLocale", "SetTextI18n"})


    public void getPercent(View view){

        try{
            String s1 =editText.getText().toString();
            double marks=Integer.parseInt(s1);
            String s2=editText2.getText().toString();
            double totalMarks=Integer.parseInt(s2);
            double per=(marks/totalMarks)*100.0;
            double cgpa=per/9.5;
            if(per>95 && per<100){
                textView8.setText("Your CGPA is : 10");
                textView7.setText("Your percentage is : " + String.format("% .2f", per) + "%");
            }
            else if(per>100){
                textView7.setText("Enter Valid Values!");
                textView8.setText("");

            }
            else {
                textView7.setText("Your percentage is : " + String.format("% .2f", per) + "%");
                textView8.setText("Your CGPA is : " + String.format("% .1f", cgpa));
            }
        }catch (NumberFormatException e){
            Toast.makeText(this, "Enter Valid Values!", Toast.LENGTH_SHORT).show();

        }



    }
}