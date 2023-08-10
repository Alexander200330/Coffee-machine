package ui;

import model.MaquinaCafe;
import model.Vaso;

import java.util.Scanner;

public class UIMenu {

    private static MaquinaCafe maquinaCafe = new MaquinaCafe();
    public static void showMenu(){
        System.out.println("--- Hola, Bienvenido/a!!! ---");
        System.out.println("¿Qué café te gustaría tomar?\n");
        System.out.println("1. Vaso pequeño 3 Oz café");
        System.out.println("2. Vaso mediano 5 Oz café");
        System.out.println("3. Vaso grande 7 Oz café");
        System.out.println("0. Salir.");

        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print(">> ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    Vaso vasoPequeño = maquinaCafe.getVasosPequeños();
                    seleccionarVaso(vasoPequeño, "pequeño");
                    break;
                case 2:
                    Vaso vasoMediano = maquinaCafe.getVasosMedianos();
                    seleccionarVaso(vasoMediano, "mediano");
                    break;
                case 3:
                    Vaso vasoGrande = maquinaCafe.getVasosGrandes();
                    seleccionarVaso(vasoGrande, "grande");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        } while (true);

    }

    public static void seleccionarVaso(Vaso vaso, String tipoVaso){
        int cantidadVasos = pedirCantidad();
        String tipoVasoPlural = tipoVaso + "s";
        comprobarSiHayVasos(tipoVaso, cantidadVasos, vaso);

        // Si llegó a esta parte es que hay suficiente vasos, resto esos vasos.
        vaso.giveVasos(cantidadVasos);

        // Con esto determino si hay café
        if(cantidadVasos * vaso.getContenido() <  maquinaCafe.getCafetera().getCantidadCafe()){
            // En esta resto el café de la cafetera
            maquinaCafe.getCafetera().giveCafe(cantidadVasos * vaso.getContenido());
            int azucar = pedircantidadAzucar();
            if(maquinaCafe.getAzucar().hasAzucar(azucar)){
                maquinaCafe.getAzucar().giveAzucar(azucar);
                System.out.println("!Gracias por tu compra, aquí tienes " + cantidadVasos + " vasos de café " + tipoVasoPlural);
                decidirRegresarOSalir();
            } else{
                System.out.println("No hay suficiente Azúcar nos quedan " + maquinaCafe.getAzucar().getCantidadAzucar());
                decidirRegresarOSalir();
            }
        } else{
            System.out.println("Lo sentimos pero no hay suficiente café para " + cantidadVasos + " vasos " + tipoVasoPlural);
            decidirRegresarOSalir();
        }
    }



    private static void comprobarSiHayVasos(String tipoVaso, int cantidad, Vaso vaso){
        String tipoVasoPlural = tipoVaso + "s";
        Scanner sc = new Scanner(System.in);
        if(maquinaCafe.checkVaso(tipoVaso, cantidad) == "No hay vasos"){
            System.out.println("Lo sentimos, pero se nos terminaron los vasos " + tipoVasoPlural);
            decidirRegresarOSalir();
        } else if(maquinaCafe.checkVaso(tipoVaso, cantidad) == "insuficiente"){
            System.out.println("Lo sentimos, No hay suficientes vasos " + tipoVasoPlural + ", tenemos " + vaso.getCantidadVasos());
            decidirRegresarOSalir();
        }
    }


    public static int pedircantidadAzucar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEscribe la cantidad de cucharadas de azúcar: ");
        int cantidad = 0;
        cantidad = Integer.parseInt(sc.nextLine());
        return cantidad;
    }

    public static int pedirCantidad(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEscribe la cantidad de vasos: ");
        int cantidad = 0;
        cantidad = Integer.parseInt(sc.nextLine());
        return cantidad;
    }

    public static void decidirRegresarOSalir(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPresione enter para continuar...");
        sc.nextLine();

        System.out.println("Elegir una opción: ");
        System.out.println("0. Salir");
        System.out.println("1. Regresar al menú");

        int opcion = 0;

        System.out.print(">> ");
        opcion = Integer.parseInt(sc.nextLine());
        do{
            if(opcion == 0){
                System.exit(0);
            } else if(opcion == 1){
                showMenu();
            }
        } while(opcion != 0 || opcion != 1);

    }

}

