package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solutionTest {

    String[] array = {"5","PIC","POC","PONG!","PIC","PONG!"};
    String[] patata = {"3","PIC","POC","PIC","PONG!"};
    String[] prueba2 = {"25","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!"};
    String[] prueba3 = {"24","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!"};


    @Test
    void casoDePrueba() {
    }

    @Test
    void comprobador() {

        assertAll(
                () -> assertFalse(solution.comprobador(array)),
                () -> assertTrue(solution.comprobador(patata)),
                () -> assertFalse(solution.comprobador(prueba2)),
                () -> assertTrue(solution.comprobador(prueba3))

        );

    }

    @Test
    void puntuaciones() {

        assertAll(
                ()-> assertEquals("0 2",solution.puntuaciones(array)),
                ()-> assertEquals("0 10",solution.puntuaciones(prueba2))
        );

    }
}