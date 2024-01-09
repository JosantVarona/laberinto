package model;

public class player {
    private String nombre;
    private int vidas;
     public player(String nombre){
         this.nombre = nombre;
     }
     public player(){
         this("");
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Adios aventurero" + nombre;
    }
}
