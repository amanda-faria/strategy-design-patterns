package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteTest {

    @Test
    void deveCalcularFreteSimples() {
        Frete frete = new Frete();
        frete.freteSimples(10.0f, 5.0f);
        assertEquals(20.0f, frete.getFrete());
    }
    @Test
    void deveCalcularFreteExpresso() {
        Frete frete = new Frete();
        frete.freteExpresso(10.0f, 20.0f);
        assertEquals(65.0f, frete.getFrete());
    }

    @Test
    void deveCalcularFreteInternacional() {
        Frete frete = new Frete();
        frete.freteInternacional(10.0f, 12.0f);
        assertEquals(69.0f, frete.getFrete());
    }

    @Test
    void deveCalcularFreteGratis() {
        Frete frete = new Frete();
        frete.freteGratis(10.0f, 5.0f);
        assertEquals(0.0f, frete.getFrete());
    }

}