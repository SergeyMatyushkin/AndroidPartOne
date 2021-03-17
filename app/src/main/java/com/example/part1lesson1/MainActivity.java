package com.example.part1lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;
    private Switch aSwitch;
    private CheckBox checkBox;
    private ToggleButton toggleButton;
    private CalendarView calendarView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.new_maket);
        initViews();
    }

    private void initViews() {
        textView = findViewById(R.id.TextView1);
        editText = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.button);
        aSwitch = findViewById(R.id.switch1);
        checkBox = findViewById(R.id.checkBox);
        toggleButton = findViewById(R.id.toggleButton);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextTextPersonName2);
        editText = findViewById(R.id.editTextPhone);
        editText = findViewById(R.id.editTextNumber);
        editText = findViewById(R.id.editTextTextPassword);
        editText = findViewById(R.id.editTextTextEmailAddress);
        calendarView = findViewById(R.id.calendarView);








    }


}