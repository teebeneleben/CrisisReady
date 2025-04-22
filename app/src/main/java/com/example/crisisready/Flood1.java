package com.example.crisisready;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Flood1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_flood1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            ImageButton rightButton2 = findViewById(R.id.rightButton2);
            ImageButton leftButton5 = findViewById(R.id.leftButton5);

            rightButton2.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), Flood2.class)));
            leftButton5.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), emergencySafety.class)));
            return insets;
        });
    }
}