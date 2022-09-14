package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Boton2r extends AppCompatActivity {
    private EditText txt1;
    private Button btnraiz;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton2r);

        txt1 = findViewById(R.id.valor3);
        resultado = findViewById(R.id.txtraiz);
        btnraiz = findViewById(R.id.buttonraiz);
        btnraiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(txt1.getText().toString());
                double respuesta = Math.sqrt(valor1);
                resultado.setText("La raíz cuadrada es: "+respuesta);

            }
        });
    }
}