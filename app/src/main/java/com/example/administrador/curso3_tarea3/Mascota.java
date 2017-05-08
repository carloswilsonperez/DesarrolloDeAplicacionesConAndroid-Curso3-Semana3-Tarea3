package com.example.administrador.curso3_tarea3;

/**
 * Created by administrador on 08/05/17.
 */

public class Mascota {

    private String nombre;
    private String numLinkes;
    private int foto;
    private int colorFondo;

    //Contructor
    public Mascota (String nombre, String numLinkes, int foto, int colorFondo){
        this.nombre = nombre;
        this.numLinkes = numLinkes;
        this.foto = foto;
        this.colorFondo = colorFondo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumLinkes() {
        return numLinkes;
    }

    public void setNumLinkes(String numLinkes) {
        this.numLinkes = numLinkes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(int colorFondo) {
        this.colorFondo = colorFondo;
    }
}
