package com.example.introducaoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtMensagem;
    Button btnClique1;
    Button btnClique2;
    Button btnClique3;
    Button btnClique4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main).setBackgroundColor(getResources().getColor(android.R.color.darker_gray));

        txtMensagem = findViewById(R.id.txtMensagem);
        btnClique1 = findViewById(R.id.Btn_carro_hatch);
        btnClique2 = findViewById(R.id.Btn_carro_sedan);
        btnClique3 = findViewById(R.id.Btn_carro_suv);
        btnClique4 = findViewById(R.id.Btn_carro_importados);

        btnClique1.setOnClickListener(view -> {

            Intent abrirTela2 = new Intent(
                    MainActivity.this,
                    MainActivity2.class
            );

            startActivity(abrirTela2);

        });

        btnClique2.setOnClickListener(view -> {

            Intent abrirTela3 = new Intent(
                    MainActivity.this,
                    MainActivity3.class
            );

            startActivity(abrirTela3);

        });

        btnClique3.setOnClickListener(view -> {

            Intent abrirTela4 = new Intent(
                    MainActivity.this,
                    MainActivity4.class
            );

            startActivity(abrirTela4);

        });

        btnClique4.setOnClickListener(view -> {

            Intent abrirTela5 = new Intent(
                    MainActivity.this,
                    MainActivity5.class
            );

            startActivity(abrirTela5);

        });

    }
}