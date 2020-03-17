package com.example.training1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class InfoPage extends AppCompatActivity {
    String name;
    public int weight;

    EditText nameSpace;
    EditText weightSpace;

    Button saveButton;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infro_page);


        nameSpace = (EditText) findViewById(R.id.nameSpace);
        weightSpace = (EditText) findViewById(R.id.weightSpace);


        saveButton = (Button) findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = nameSpace.getText().toString();
                weight = Integer.valueOf(weightSpace.getText().toString());


            }
        });

        backButton = findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                openMainPage();
            }
        });

    }

    public void openMainPage() {


        Intent openMainPage = new Intent(this, MainActivity.class);
        startActivity(openMainPage);
    }

}
