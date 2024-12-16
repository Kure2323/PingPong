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
    void comprobador1() {

        assertAll(
                () -> assertFalse(solution.comprobador1(array)),
                () -> assertTrue(solution.comprobador1(patata)),
                () -> assertFalse(solution.comprobador1(prueba2)),
                () -> assertTrue(solution.comprobador1(prueba3))

        );

    }
    @Test
    void comprobador2() {

        assertAll(

        );
    }
    @Test
    void comprobador3() {
        assertAll(
                
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