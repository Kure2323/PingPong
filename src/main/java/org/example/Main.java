package org.example;

import java.util.Scanner;
//PIC = Sonido raqueta
//POC = Sonido borda (useless)
//PONG! = Sonido WIN

public class Main {
    static boolean turno = true; //TRUE = DERECHA | FALSE = IZQUIERDA

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        while (true) {

            String datos = entrada.nextLine();
            if (Funciones.Seguir(datos)) {
                break;
            }
            String[] vector = datos.split(" ");
            Funciones.Comprobador(vector);
            System.out.println(Funciones.Puntuaciones(vector));

        }


    }
}