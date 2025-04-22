package com.example.crisisready;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            ImageButton homeButton = findViewById(R.id.homeButton);
            ImageButton homeButton2 = findViewById(R.id.homeButton2);
            ImageButton homeButton3 = findViewById(R.id.homeButton3);
            ImageButton homeButton4 = findViewById(R.id.homeButton4);
            ImageButton homeButton5 = findViewById(R.id.homeButton5);

            homeButton.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), emergencySafety.class)));
            homeButton2.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), firstAid.class)));
            homeButton3.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), Checklist.class)));
            homeButton5.setOnClickListener(v1 -> startActivity(new Intent(getApplicationContext(), UserProfile.class)));

            return insets;
        });
    }
}