package model;

public class Azucarero {
    private int cantidadAzucar;

    public Azucarero(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public boolean hasAzucar(int cantidadAzucar){
        if(cantidadAzucar > 0 && cantidadAzucar <= this.cantidadAzucar){
            return true;
        } else{
            return false;
        }
    }

    public int giveAzucar(int cantidadAzucar){

        if(cantidadAzucar > 0 && cantidadAzucar <= this.cantidadAzucar) {
            this.cantidadAzucar = this.cantidadAzucar - cantidadAzucar;
            return this.cantidadAzucar;
        }else{
            return this.cantidadAzucar;
        }
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }
}
