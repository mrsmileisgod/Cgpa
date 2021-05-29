package com.ziro.calculate;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        Button button2=findViewById(R.id.button2);

        button.setBackgroundColor(Color.parseColor("#FF7F50"));
        button2.setBackgroundColor(Color.parseColor("#FF7F50"));

        ActionBar actionBar=getSupportActionBar();
        ColorDrawable colorDrawable=new ColorDrawable(Color.parseColor("#FF7F50"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            openActivity2(v);
//            }
//        });
    }
    public void openActivity1(View view){
//        Toast.makeText(this, "Okay", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);

    }
    public void openActivity2(View view){
//        Toast.makeText(this, "Okay", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

}