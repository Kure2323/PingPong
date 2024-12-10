package org.example;
import java.util.Scanner;
//PIC = Sonido raqueta
//POC = Sonido borda (useless)
//PONG! = Sonido WIN

/**
 * @author Pol Gorrindo Bermejo
 * @version 0.9 (10/12/2024)
 * Quiero que el puto Juez me de el visto weno
 */
public class solution {

    static boolean turno = true; //TRUE = DERECHA | FALSE = IZQUIERDA
    static Scanner entrada;

    public static boolean casoDePrueba() {

        entrada = new Scanner(System.in);
        String[] vector = entrada.nextLine().split(" ");
        if (vector[0].equals("0") && vector.length == 1) {
            return false;
        } else {

            solution.Comprobador(vector);
            System.out.println(solution.Puntuaciones(vector));

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
     * @param array
     */
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
            System.exit(0);
        }


    } //Comprueba el formato de entrada

    /**
     * Método para cambiar el valor del boolean 'turno'
     */
    public static void CambioTurno() {

        if (turno == true) {
            turno = false;
        } else {
            turno = true;
        }

    } //Realiza un cambio de valor al boolean 'turno'

    /**
     * Calcula la relación entre PIC y PONG!s con ayuda del 'turno' y obtiene las soluciones
     * @param vector
     * @return
     */
    public static String Puntuaciones(String[] vector) {
        Long i = 0L;
        Long d = 0L;
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

        return i + " " + d;
    } //Sistema de puntuaciones conforme al turno
}