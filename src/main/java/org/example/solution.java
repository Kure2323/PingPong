package org.example;
import java.util.Scanner;
//PIC = Sonido raqueta
//POC = Sonido borda (useless)
//PONG! = Sonido WIN

public class solution {

    static boolean turno = true; //TRUE = DERECHA | FALSE = IZQUIERDA
    static Scanner entrada;

    public static boolean casoDePrueba() {

        entrada = new Scanner(System.in);
        String datos = entrada.nextLine();
        if (datos.equals("0")) {
            return false;
        } else {

            String[] vector = datos.split(" ");
            solution.Comprobador(vector);
            System.out.println(solution.Puntuaciones(vector));

            return true;
        }
    }

    public static void main(String[] args) {

        while (casoDePrueba()) {
        }

    } // main

    public static void Comprobador(String[] array) {

        boolean salida = false; //Boolean para comprobar errores

        try{
            if (Integer.parseInt(array[0]) != array.length - 1) { //Comprueba que el número introducido es igual a la cantidad de valores
                salida = true;
            }
        } catch (NumberFormatException e) { //En caso de introducir un valor NO numérico
            salida = true;
        }

        for (int i = 1; i < array.length; i++) { //Comprueba que la entrada sea adecuada
            if (!array[i].equals("PIC") && !array[i].equals("POC") && !array[i].equals("PONG!")) {
                salida = true;
            }
        }
        if (salida == true) { //Salta en caso de boolean true
            System.out.println("Error de formato.");
            System.exit(0);
        }


    } //Comprueba el formato de entrada

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
                solution.CambioTurno();
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