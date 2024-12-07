package org.example;

import static org.example.Main.turno;

public class Funciones {

    public static void Comprobador(String[] array) {

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


    } //Comprueba el formato de entrada

    public static boolean Seguir(String entrada) {

        if (entrada.equals("0")) {
            return true;
        } else {
            return false;
        }
    } //Comprueba la entrada si es = 0 para salir o no para seguir

    public static void CambioTurno() {

        if (turno == true) {
            turno = false;
        } else {
            turno = true;
        }

    } //Realiza un cambio de valor al boolean 'turno'

    public static String Puntuaciones(String[] vector) {
        int i = 0;
        int d = 0;
        for (int j = 1; j < vector.length; j++) {

            if (vector[j].equals("PIC")) {
                Funciones.CambioTurno();
            } else if (vector[j].equals("PONG!")) {
                if (turno == true) {
                    i++;
                } else {
                    d++;
                    turno = true;
                }
            }

        }
        String puntuaciones = i + " " + d;

        return puntuaciones;


    } //Sistema de puntuaciones conforme al turno
}
