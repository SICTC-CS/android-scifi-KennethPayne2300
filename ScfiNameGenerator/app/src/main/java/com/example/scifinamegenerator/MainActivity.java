package com.example.scifinamegenerator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText first, last, city, school, food, character;
    private LinearLayout horizontal;
    private TextView names;
    private Button generateBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.firstTXT);
        last = findViewById(R.id.lastTXT);
        city = findViewById(R.id.cityTXT);
        school = findViewById(R.id.schoolTXT);
        food = findViewById(R.id.foodTXT);
        character = findViewById(R.id.charTXT);
        names = findViewById(R.id.NamesTXT);
        generateBTN = findViewById(R.id.generateBTN);
        horizontal = findViewById(R.id.horizontalLayout);

        generateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sciFiFirst, sciFiLast, sciFiOrigin;

                sciFiFirst = first.getText().toString().substring(0,2)+last.getText().toString().substring(0,3);
                sciFiLast = city.getText().toString().substring(0,2)+school.getText().toString().substring(0,3);
                sciFiOrigin = food.getText().toString()+" "+character.getText().toString();

                names.setText(String.format("%s %s from the planet %s", sciFiFirst, sciFiLast, sciFiOrigin));
                names.setVisibility(View.VISIBLE);
                horizontal.setVisibility(View.GONE);
            }
        });

    }
}