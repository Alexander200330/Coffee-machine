package model;

public class MaquinaCafe {
    //Creo un objeto de tipo Cafetera e instancio y defino 100 de cantidad de café
    private Cafetera cafetera = new Cafetera(100);

    // Defino 10 vasos de cada uno y 3 Oz para el pequeño, 5 para el mediano y 7 para el grande
    private Vaso vasosPequeños = new Vaso(10, 3);
    private Vaso vasosMedianos = new Vaso(10, 5);
    private Vaso vasosGrandes = new Vaso(10, 7);

    // Defino 50 Cucharadas de azúcar
    private Azucarero azucar = new Azucarero(50);

    public Cafetera getCafetera() {
        return cafetera;
    }

    public Vaso getVasosPequeños() {
        return vasosPequeños;
    }

    public void setVasosPequeños(Vaso vasosPequeños) {
        this.vasosPequeños = vasosPequeños;
    }

    public Vaso getVasosMedianos() {
        return vasosMedianos;
    }

    public void setVasosMedianos(Vaso vasosMedianos) {
        this.vasosMedianos = vasosMedianos;
    }

    public Vaso getVasosGrandes() {
        return vasosGrandes;
    }

    public void setVasosGrandes(Vaso vasosGrandes) {
        this.vasosGrandes = vasosGrandes;
    }

    public Azucarero getAzucar() {
        return azucar;
    }

    public void setAzucar(Azucarero azucar) {
        this.azucar = azucar;
    }

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public Vaso getTipoVaso(String tipoVaso) {
        // vaso pequeño = pequeño
        // vaso mediano = mediano
        // vaso grande = grande
        if (tipoVaso == "pequeño") {
            return vasosPequeños;
        } else if (tipoVaso == "mediano") {
            return vasosMedianos;
        } else if (tipoVaso == "grande"){
            return vasosGrandes;
        } else{
            return null;
        }
    }

    // Compruebo si hay x cantidad de vasos disponibles
    public String checkVaso(String tipoVaso, int cantidadVaso) {
         if (tipoVaso == "pequeño" && cantidadVaso > vasosPequeños.getCantidadVasos()  ) {
             if(vasosPequeños.getCantidadVasos() == 0){
                 return "No hay vasos";
             } else if(vasosPequeños.getCantidadVasos() < cantidadVaso){
                 String insuficiente = "insuficiente";
                 return insuficiente;
             }
        } else if (tipoVaso == "mediano" && cantidadVaso > vasosMedianos.getCantidadVasos()) {
             if(vasosMedianos.getCantidadVasos() == 0){
                 return "No hay vasos";
             } else if(vasosMedianos.getCantidadVasos() < cantidadVaso){
                 String insuficiente = "insuficiente";
                 return insuficiente;
             }
        } else if (tipoVaso == "grande" && cantidadVaso > vasosGrandes.getCantidadVasos()){
             if(vasosGrandes.getCantidadVasos() == 0){
                 return "No hay vasos";
             } else if(vasosGrandes.getCantidadVasos() < cantidadVaso){
                 String insuficiente = "insuficiente";
                 return insuficiente;
             }
        }
        return null;
    }

    // Compruebo Si hay x cantidad de Azúcar
    public String checkSugar(String tipoVaso, int cantidadAzucar) {
        if(cantidadAzucar > azucar.getCantidadAzucar()){
            return "No hay Azúcar";
        }
        return null;
    }

    // Doy cantidad de vasos y resto cantidad de azúcar
    public int getVasoCafe(Vaso tipoVaso, int cantidadVaso, int cantidadAzucar) {

         if (tipoVaso == vasosPequeños && cantidadVaso < vasosPequeños.getCantidadVasos()  ) {
             vasosPequeños.giveVasos(cantidadVaso);
             azucar.giveAzucar(cantidadAzucar);
            return vasosPequeños.getCantidadVasos();
        } else if (tipoVaso == vasosMedianos && cantidadVaso < vasosMedianos.getCantidadVasos()  ) {
             vasosMedianos.giveVasos(cantidadVaso);
             azucar.giveAzucar(cantidadAzucar);
            return vasosMedianos.getCantidadVasos();
        } else if (tipoVaso == vasosGrandes && cantidadVaso < vasosGrandes.getCantidadVasos()  ) {
             vasosGrandes.giveVasos(cantidadVaso);
             azucar.giveAzucar(cantidadAzucar);
             return vasosGrandes.getCantidadVasos();
        }
        return 0;
    }

}
