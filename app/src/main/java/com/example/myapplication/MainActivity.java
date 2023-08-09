package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button MyBtn;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edittext);
        MyBtn=findViewById(R.id.btn);
        title=findViewById(R.id.title);
        MyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputName=editText.getText().toString();
                Toast.makeText(MainActivity.this, "Welcome "+inputName+" to Our App",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}