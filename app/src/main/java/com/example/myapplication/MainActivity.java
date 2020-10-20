package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2;
    Button suma,resta,multiplicacion,division,nada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();

        txt1= (EditText) findViewById(R.id.txt1);
        txt2= (EditText) findViewById(R.id.txt2);
        suma= (Button) findViewById(R.id.suma);
        resta= (Button) findViewById(R.id.resta);
        multiplicacion= (Button) findViewById(R.id.multiplicacion);
        division= (Button) findViewById(R.id.division);
        nada= (Button) findViewById(R.id.nada);


        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            int x = Integer.parseInt(txt1.getText().toString());
            int y = Integer.parseInt(txt2.getText().toString());
            int r = x + y;
            Toast.makeText(MainActivity.this, "La suma es igual a: "+r, Toast.LENGTH_SHORT).show();

            }

        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(txt1.getText().toString());
                int y = Integer.parseInt(txt2.getText().toString());
                int r = x - y;
                Toast.makeText(MainActivity.this, "La resta es igual a: "+r, Toast.LENGTH_SHORT).show();

            }

        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float x = Integer.parseInt(txt1.getText().toString());
                float y = Integer.parseInt(txt2.getText().toString());
                if (y==0){

                    Toast.makeText(MainActivity.this, "no se puede dividir entre 0", Toast.LENGTH_SHORT).show();
                    txt1.setText("");
                    txt2.setText("");

                }
                else {
                    float r = x / y;
                    Toast.makeText(MainActivity.this, "La división es igual a: " + r, Toast.LENGTH_SHORT).show();
                }

            }

        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(txt1.getText().toString());
                int y = Integer.parseInt(txt2.getText().toString());
                int r = x * y;
                Toast.makeText(MainActivity.this, "La multipliación es igual a: "+r, Toast.LENGTH_SHORT).show();

            }

        });
        nada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt1.setText("");
                txt2.setText("");
                Toast.makeText(MainActivity.this, "se han limpiado los campos", Toast.LENGTH_SHORT).show();

            }

        });

    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }


}