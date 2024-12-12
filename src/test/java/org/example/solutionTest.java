package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solutionTest {

    String[] array = {"5","PIC","POC","PONG!","PIC","PONG!"};
    String[] patata = {"3","PIC","POC","PIC","PONG!"};

    @Test
    void casoDePrueba() {
    }

    @Test
    void comprobador() {

        assertAll(
                () -> assertFalse(solution.comprobador(array)),
                () -> assertTrue(solution.comprobador(patata))
        );

    }

    @Test
    void puntuaciones() {

        assertAll(
                ()-> assertEquals("0 2",solution.puntuaciones(array))
        );

    }
}