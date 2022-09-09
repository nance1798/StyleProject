package com.example.styleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // This is a change

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton(View view){
        EditText favoriteFood = findViewById(R.id.editTextFood);
        EditText favoriteNumber = findViewById(R.id.editTextNumber);
        TextView finalResult = findViewById(R.id.finalText);

        String food = favoriteFood.getText().toString();
        String number = favoriteNumber.getText().toString();


        finalResult.setText("Congratulations, you have received " + number + " servings of " + food);


    }
}