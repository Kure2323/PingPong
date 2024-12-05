package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String datos = entrada.nextLine();

        boolean bien = Funciones.Seguir(datos);


        String[] vector = datos.split(" ");

        Funciones.Datos(vector);

    }
}