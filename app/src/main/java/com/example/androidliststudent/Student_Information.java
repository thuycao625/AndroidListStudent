package com.example.androidliststudent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Student_Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tvName, tvAge, tvHometown;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__information);

        String name = getIntent().getExtras().getString("name");
        String age = getIntent().getExtras().getString("age");
        String hometown = getIntent().getExtras().getString("hometown");

        tvName = findViewById(R.id.name);
        tvName.append(name);

        tvAge = findViewById(R.id.age);
        tvAge.append(age);

        tvHometown = findViewById(R.id.hometown);
        tvHometown.append(hometown);

    }
}
