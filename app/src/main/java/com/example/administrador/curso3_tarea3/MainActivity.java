package com.example.administrador.curso3_tarea3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;
    /**/
    private final String LOGTAG = "Logs !!!!!!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.miToolBar);
        setSupportActionBar(toolbar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        // Instacia el linearLayoutManager que sirve para manejar la forma en que se ve la lista
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //Le decimos que el RecyclerView se comporte como un LinearLayoutManager y adquiera todas sus propiedades
        listaMascotas.setLayoutManager(llm);
        // Inicializamos la lista de contactos
        inicializarListaMascotas();
        // Inicializamos el adaptador
        inicializaAdaptador();

        Log.i(LOGTAG, "Mensaje de información");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_favoritas) {
            Intent intent = new Intent(this, Activity2.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Inicializa el adaptador
    public void inicializaAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    // Cargo las mascotas a mostrar
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Pulgarcito", 2, R.drawable.perro00, R.color.fondo_perro00));
        mascotas.add(new Mascota("Atila", 5, R.drawable.perro01, R.color.fondo_perro01));
        mascotas.add(new Mascota("Toby", 3, R.drawable.perro02, R.color.fondo_perro02));
        mascotas.add(new Mascota("Peñarol", 3, R.drawable.perro03, R.color.fondo_perro03));
        mascotas.add(new Mascota("Yaman", 4, R.drawable.perro04, R.color.fondo_perro04));
        mascotas.add(new Mascota("Paco", 2, R.drawable.perro05, R.color.fondo_perro05));
    }
}
