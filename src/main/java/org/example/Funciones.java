package org.example;

public class Funciones {
    public static void Datos(String[] array) {

        boolean salida = false;

        try{
            if (Integer.parseInt(array[0]) != array.length - 1) {
                salida = true;
            }
        } catch (NumberFormatException e) {
            salida = true;
        }

        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals("PIC") && !array[i].equals("POC") && !array[i].equals("PONG!")) {
                salida = true;
            }
        }
        if (salida == true) {
            System.out.println("Error de formato.");
            System.exit(0);
        }


    }
    public static boolean Seguir(String entrada) {

        if (entrada.equals("0")) {
            return true;
        } else {
            return false;
        }
    }
}
