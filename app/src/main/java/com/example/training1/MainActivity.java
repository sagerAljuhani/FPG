package com.example.training1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button InfoButton;


    TextView insertedName;
    TextView InsertedWeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InfoButton = findViewById(R.id.InfoButton);
        InfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                openInfoPage();
            }
        });


    }

    public void openInfoPage() {


        Intent moveSecondPage = new Intent(this, DistanceCounter.class);
        startActivity(moveSecondPage);
    }


}
