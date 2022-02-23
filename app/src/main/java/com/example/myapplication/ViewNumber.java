package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ViewNumber extends AppCompatActivity {

    static EditText editText;
    static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_number);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);

        MyViewModel model = new ViewModelProvider(this).get(MyViewModel.class);
//        Intent intent = getIntent();
//        String s = intent.getStringExtra("position");
//        int position =Integer.parseInt(s);
        System.out.println("'load ok' "+ value);
        int position = model.getPosition();
        String value = model.getValue(position);
        editText.setText(value);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("cliker");
                String value = editText.getText().toString();
                model.changeNumber(value, position);
                setContentView(R.layout.activity_main);
            }
        }
        );
    }
}