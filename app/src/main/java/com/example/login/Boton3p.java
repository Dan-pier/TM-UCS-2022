package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Boton3p extends AppCompatActivity {
    private EditText txt1;
    private Button btnpoi;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton3p);

        txt1 = findViewById(R.id.valor4);
        resultado = findViewById(R.id.txtpoi);
        btnpoi = findViewById(R.id.buttonpoi);
        btnpoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(txt1.getText().toString());
                if ((valor1 % 2) == 0){
                    resultado.setText("El número es Par ");
                }
                else{
                    resultado.setText("El número es Impar ");
                }

            }
        });
    }
}