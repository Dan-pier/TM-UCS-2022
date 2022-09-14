package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Boton1s extends AppCompatActivity {
    private EditText txt1, txt2;
    private Button btnsumar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton1s);

        txt1 = findViewById(R.id.valor1);
        txt2 = findViewById(R.id.valor2);
        resultado = findViewById(R.id.txtrespuesta);
        btnsumar = findViewById(R.id.buttonsuma);
        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(txt1.getText().toString());
                int valor2 = Integer.parseInt(txt2.getText().toString());
                int r = valor1 + valor2;
                resultado.setText("La suma es: "+r);

            }
        });
    }
}