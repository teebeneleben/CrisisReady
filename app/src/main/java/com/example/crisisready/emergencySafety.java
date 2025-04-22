package com.example.crisisready;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class emergencySafety extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_emergency_safety);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            ImageButton emergencyButton = findViewById(R.id.emergencyButton);
            ImageButton emergencyButton2 = findViewById(R.id.emergencyButton2);
            ImageButton emergencyButton3 = findViewById(R.id.emergencyButton3);
            ImageButton leftButton7 = findViewById(R.id.leftButton7);

            emergencyButton.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), Earthquake1.class)));
            emergencyButton2.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), Fire1.class)));
            emergencyButton3.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), Flood1.class)));
            leftButton7.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));

            return insets;
        });
    }
}