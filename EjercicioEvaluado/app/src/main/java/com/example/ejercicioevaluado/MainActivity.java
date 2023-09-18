package com.example.ejercicioevaluado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ejercicioevaluado.clases.Libro;
import com.example.ejercicioevaluado.clases.Publicacion;
import com.example.ejercicioevaluado.clases.Revista;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    public static ArrayList<Publicacion> LstPublicaciones = new ArrayList<>();
    private Button btnAgregarPublicacion, btnMostrarLista, btnAcercaDe;
    public static ArrayList<Publicacion> lstPublicaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPublicaciones = new ArrayList<Publicacion>();


        btnAgregarPublicacion = findViewById(R.id.btnAgregar);
        btnMostrarLista  = findViewById(R.id.btnMostrarLista);
        btnAcercaDe = findViewById(R.id.btnAcercaDe);

        // Configurando evento
        btnAgregarPublicacion.setOnClickListener(this);
        btnAcercaDe.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AcercaDe.class));
        });

        btnMostrarLista.setOnClickListener(this);
        btnMostrarLista.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MostrarLista.class));
        });
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        // Agregar publicacion
        if(id == R.id.btnAgregar){
            startActivity(new Intent(this, ElegirTipoPublicacion.class));
        }

    }
}