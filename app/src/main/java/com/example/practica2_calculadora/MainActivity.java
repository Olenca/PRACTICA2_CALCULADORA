package com.example.practica2_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String signo, mostrar, resto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCero = (Button) findViewById(R.id.Cero);
        Button btnUno = (Button) findViewById(R.id.Uno);
        Button btnDos = (Button) findViewById(R.id.Dos);
        Button btnTres = (Button) findViewById(R.id.Tres);
        Button btnCuatro = (Button) findViewById(R.id.Cuatro);
        Button btnCinco = (Button) findViewById(R.id.Cinco);
        Button btnSeis = (Button) findViewById(R.id.Seis);
        Button btnSiete = (Button) findViewById(R.id.Siete);
        Button btnOcho = (Button) findViewById(R.id.Ocho);
        Button btnNueve = (Button) findViewById(R.id.Nueve);
        Button btnSuma = (Button) findViewById(R.id.Suma);
        Button btnResta = (Button) findViewById(R.id.Resta);
        Button btnMultiplicacion = (Button) findViewById(R.id.Multiplicacion);
        Button btnDivision = (Button) findViewById(R.id.Division);
        Button btnElevado = (Button) findViewById(R.id.Elevado);
        Button btnRaiz = (Button) findViewById(R.id.Raiz);
        Button btnPunto = (Button) findViewById(R.id.Punto);
        Button btnIgual = (Button) findViewById(R.id.Igual);
        Button btnEliminar = (Button) findViewById(R.id.Eliminar);
        final TextView res = (TextView) findViewById(R.id.res);


        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = res.getText().toString();
                mostrar = mostrar + "0";
                res.setText(mostrar);
            }
        });
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = res.getText().toString();
                mostrar = mostrar + "1";
                res.setText(mostrar);
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = res.getText().toString();
                mostrar = mostrar + "2";
                res.setText(mostrar);
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = res.getText().toString();
                mostrar = mostrar + "3";
                res.setText(mostrar);
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = res.getText().toString();
                mostrar = mostrar + "4";
                res.setText(mostrar);
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar =res.getText().toString();
                mostrar = mostrar + "5";
                res.setText(mostrar);
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = res.getText().toString();
                mostrar = mostrar + "6";
                res.setText(mostrar);
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = res.getText().toString();
                mostrar = mostrar + "7";
                res.setText(mostrar);
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = res.getText().toString();
                mostrar = mostrar + "8";
                res.setText(mostrar);
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = res.getText().toString();
                mostrar = mostrar + "9";
                res.setText(mostrar);
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resto = res.getText().toString();
                signo = "+";
                res.setText("");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resto = res.getText().toString();
                signo = "-";
                res.setText("");
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resto = res.getText().toString();
                signo = "*";
                res.setText("");
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resto = res.getText().toString();
                signo = "/";
                res.setText("");
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = res.getText().toString();
                mostrar = mostrar + ".";
                res.setText(mostrar);
            }
        });
        btnEliminar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = "";
                res.setText(mostrar);
                resto = "";
                signo = "";

            }
        });
        btnElevado.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resto = res.getText().toString();
                signo = "^";
                res.setText("");
            }
        });
        btnRaiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resto = res.getText().toString();
                signo = "√";
                res.setText("");
            }
        });



        btnIgual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double resul;
                mostrar = res.getText().toString();
                mostrar = mostrar + "1";
                if (signo.equals("+")) {
                    resul = Double.parseDouble(resto) + Double.parseDouble(res.getText().toString());
                    res.setText(String.valueOf(resul));
                }
                if (signo.equals("-")) {
                    resul = Double.parseDouble(resto) - Double.parseDouble(res.getText().toString());
                    res.setText(String.valueOf(resul));
                }
                if (signo.equals("*")) {
                    resul = Double.parseDouble(resto) * Double.parseDouble(res.getText().toString());
                    res.setText(String.valueOf(resul));
                }
                if (signo.equals("/")) {
                    resul = Double.parseDouble(resto) / Double.parseDouble(res.getText().toString());
                    res.setText(String.valueOf(resul));
                }
                if (signo.equals("^")) {
                    resul = Double.parseDouble(res.getText().toString());
                    resul = Math.pow(resul, resul);
                    res.setText(String.valueOf(resul));
                }
                if (signo.equals("√")) {
                    resul = Double.parseDouble(res.getText().toString());
                    resul = Math.sqrt((resul));
                    res.setText(String.valueOf(resul));
                }

            }
        });
    }
}