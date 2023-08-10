package model;

public class Vaso {
    private int cantidadVasos;
    private int contenido;

    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public void setCantidadVasos(int cantidadVasos) {
        this.cantidadVasos = cantidadVasos;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public boolean hasVasos(int cantidadVasos){

       if(cantidadVasos > 0 && cantidadVasos <= this.cantidadVasos) {
            this.cantidadVasos = this.cantidadVasos - cantidadVasos;
            return true;
        }else{
            return false;
        }
    }

    public int giveVasos(int cantidadVasos){

        if(cantidadVasos > 0 && cantidadVasos <= this.cantidadVasos) {
            this.cantidadVasos = this.cantidadVasos - cantidadVasos;
            return this.cantidadVasos;
        }else{
            return this.cantidadVasos;
        }
    }
}
