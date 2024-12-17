package org.example;
import java.util.Scanner;
//PIC = Sonido raqueta
//POC = Sonido borda (useless)
//PONG! = Sonido WIN

/**
 * @author Pol Gorrindo Bermejo
 * @version 1.1 (17/12/2024) aceptado por el Juez
 */
public class solution {

    static Scanner entrada = new Scanner(System.in);

    /**
     * Método donde se introduce y verifica cada caso de prueba
     * @return True: en caso de que el número introducido no sea '0'
     * False: en caso de que el número introducido sea '0' provocará el cierre del programa
     */
    public static boolean casoDePrueba() {

        String[] vector = entrada.nextLine().split(" ");

        if (vector[0].equals("0")) {  //Identifica si la entrada es '0' y devuelve false para cerrar el programa
            return false;
        } else {

            if (comprobador1(vector) || comprobador2(vector) || comprobador3(vector)) {
                return false;
            }
            System.out.println(solution.puntuaciones(vector));

            return true;
        }
    }

    public static void main(String[] args) {

        while (casoDePrueba()) {
        }

    } // main

    /**
     * Método que realiza una comprobación sobre que el número y la cantidad de sonidos sea igual
     * @param array Entrada formada por los sonidos
     * @return Boolean: True cuando hay un error
     */
    public static boolean comprobador1(String[] array) {

        try {
            if (Integer.parseInt(array[0]) != array.length - 1) { //Comprueba que el número introducido es igual a la cantidad de valores
                return true;
            }
        } catch (NumberFormatException e) { //En caso de introducir un valor NO numérico
            return true;
        }
        return false;
    }

    /**
     * Método de comprobación de que sea PIC POC o PONG!
     * @param array Entrada formada por los sonidos
     * @return Boolean: True cuando hay un error
     */
    public static boolean comprobador2(String[] array) {
        for (int i = 1; i < array.length; i++) { //Comprueba que la entrada sea adecuada
            if (!array[i].equals("PIC") && !array[i].equals("POC") && !array[i].equals("PONG!")) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método de coprobación de que la última posición sea PONG!
     * @param array Entrada formada por los sonidos
     * @return Boolean: True cuando hay un error
     */
    public static boolean comprobador3(String[] array) {

        if (!array[array.length - 1].equals("PONG!")) {
            return true;
        }
        return false;
    } //Comprueba el formato de entrada

    /**
     * Calcula la relación entre PIC y PONG!s con ayuda del 'turno' y obtiene las soluciones
     * @param vector Entrada formada por los sonidos
     * @return Resultado de las puntuaciones
     */
    public static String puntuaciones(String[] vector) {
        int i = 0;
        int d = 0;
        boolean turno = true;
        for (int j = 1; j < vector.length; j++) {

            if (vector[j].equals("PIC")) {
                turno = !turno;

            } else if (vector[j].equals("PONG!")) {

                if (turno) {
                    i++;
                } else {
                    d++;

                }
            }

        }

        return i + " " + d;
    } //Sistema de puntuaciones conforme al turno
}