package org.example;
import java.util.Scanner;
//PIC = Sonido raqueta
//POC = Sonido borda (useless)
//PONG! = Sonido WIN

/**
 * @author Pol Gorrindo Bermejo
 * @version 0.9 (10/12/2024)
 * Quiero que el puto Juez me de el visto weno
 * Reparado: RTE: de la clase Scanner
 * Fallos: WA de qué?
 */
public class solution {

    static boolean turno = true; //TRUE = DERECHA | FALSE = IZQUIERDA
    static Scanner entrada = new Scanner(System.in);

    /**
     * Método donde se introduce y verifica cada caso de prueba
     * @return true: en caso de que el número introducido no sea '0'
     * false: en caso de que el número introducido sea '0' provocará el cierre del programa
     */
    public static boolean casoDePrueba() {

        String[] vector = entrada.nextLine().split(" ");

        if (vector[0].equals("0") && vector.length == 1) {
            return false;
        } else {

            if (comprobador(vector)) {
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
     * Método que realiza una comprobación sobre el vector introducido
     * Incluye (Long del array, Try-catch, Entrada == PIC/POC/PONG!)
     * @param array de entrada
     */
    public static boolean comprobador(String[] array) {

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
                break;
            }
        }
        if (!array[array.length - 1].equals("PONG!")) {
            salida = true;
        }
        if (salida) { //Cuando es true significa que hay algún error
            return true;
        } else {
            return false;
        }


    } //Comprueba el formato de entrada

    /**
     * Calcula la relación entre PIC y PONG!s con ayuda del 'turno' y obtiene las soluciones
     * @param vector de entrada
     * @return el resultado de las puntuaciones
     */
    public static String puntuaciones(String[] vector) {
        int i = 0;
        int d = 0;
        for (int j = 1; j < vector.length; j++) {

            if (vector[j].equals("PIC")) {
                turno = !turno;

            } else if (vector[j].equals("PONG!")) {

                if (turno) {
                    i++;
                } else {
                    d++;
                    turno = true;
                }
            }

        }

        return i + " " + d;
    } //Sistema de puntuaciones conforme al turno
}