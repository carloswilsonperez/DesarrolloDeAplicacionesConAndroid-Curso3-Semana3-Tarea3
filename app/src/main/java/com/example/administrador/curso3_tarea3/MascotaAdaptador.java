package com.example.administrador.curso3_tarea3;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by administrador on 08/05/17.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;

    // Constructor
    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    // Método que va a inflar el layout y lo pasara al ViewHolder para que obtenga los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }


    // Se setean los datos de la clase MascotaViewHolder con los datos de la lista recibida
    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position){
        final Mascota mascota = mascotas.get(position); //Obtiene todos los datos de la mascota en la posición position
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());// Seteo el view con la foto recibida del ArrayList
        //mascotaViewHolder.tvNumLikes.setText(mascota.getNumLinkes());// Seteo el view con el nombre recibido del ArrayList
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());
    }

    @Override
    public int getItemCount(){
        return mascotas.size();
    }

    //**********  Clase interna MascotaViewHolder *****************
    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private ImageButton btnLike;
        private TextView tvNombre;
        private TextView tvNumLikes;
        private ImageView imgHuesoAmarillo;

        // Constructor
        public MascotaViewHolder(View itemView){
            super(itemView);
            // Cargo todos las vistas del cardview
            this.imgFoto    = (ImageView) itemView.findViewById(R.id.imgFoto);
            this.btnLike    = (ImageButton) itemView.findViewById(R.id.btnLike);
            this.tvNombre   = (TextView) itemView.findViewById(R.id.tvNombre);
            this.tvNumLikes = (TextView) itemView.findViewById(R.id.tvNumLikes);
        }

    }
}
