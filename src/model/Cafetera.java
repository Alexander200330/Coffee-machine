package model;

public class Cafetera {

    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public boolean hasCafe(int cantidadCafe){
        if(cantidadCafe > 0 && cantidadCafe <= this.cantidadCafe){
            return true;
        } else{
            return false;
        }
    }

    public int giveCafe(int cantidadCafe){

        if(cantidadCafe > 0 && cantidadCafe <= this.cantidadCafe) {
            this.cantidadCafe = this.cantidadCafe - cantidadCafe;
            return this.cantidadCafe;
        }else{
            return this.cantidadCafe;
        }
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }
}
