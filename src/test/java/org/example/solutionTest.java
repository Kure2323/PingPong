package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solutionTest {

    String[] array = {"5","PIC","POC","PONG!","PIC","PONG!"};
    String[] error = {"3","PIC","POC","PIC","Pong!"};
    String[] prueba2 = {"25","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!"};
    String[] prueba3 = {"24","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!","PIC","POC","PONG!","PIC","PONG!"};


    @Test
    void casoDePrueba() {
    }

    @Test
    void comprobador1() {

        assertAll(
                () -> assertFalse(solution.comprobador1(array)),
                () -> assertTrue(solution.comprobador1(error)),
                () -> assertFalse(solution.comprobador1(prueba2)),
                () -> assertTrue(solution.comprobador1(prueba3))

        );

    }
    @Test
    void comprobador2() {

        assertAll(
                () -> assertTrue(solution.comprobador2(error)),
                () -> assertFalse(solution.comprobador2(array))
        );
    }
    @Test
    void comprobador3() {
        assertAll(
                () -> assertTrue(solution.comprobador3(error)),
                () -> assertFalse(solution.comprobador3(array))
        );
    }

    @Test
    void puntuaciones() {

        assertAll(
                ()-> assertEquals("1 1",solution.puntuaciones(array)),
                ()-> assertEquals("5 5",solution.puntuaciones(prueba2))
        );

    }
}