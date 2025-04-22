package com.example.crisisready;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Fire1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fire1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            ImageButton rightButton3 = findViewById(R.id.rightButton3);
            ImageButton leftButton2 = findViewById(R.id.leftButton2);

            rightButton3.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), Fire2.class)));
            leftButton2.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), emergencySafety.class)));
            return insets;
        });
    }
}