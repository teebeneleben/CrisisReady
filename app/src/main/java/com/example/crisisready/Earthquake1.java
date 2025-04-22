package com.example.crisisready;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Earthquake1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_earthquake1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            ImageButton rightButton = findViewById(R.id.rightButton);
            ImageButton leftButton = findViewById(R.id.leftButton);

            rightButton.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), Earthquake2.class)));
            leftButton.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), emergencySafety.class)));


            return insets;
        });
    }
}