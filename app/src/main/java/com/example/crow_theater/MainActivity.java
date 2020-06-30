package com.example.crow_theater;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnMainReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMainReg = (ImageButton) findViewById(R.id.btnMainReg);

        btnMainReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRegister();
            }
        });
    }
    public void openActivityRegister(){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
