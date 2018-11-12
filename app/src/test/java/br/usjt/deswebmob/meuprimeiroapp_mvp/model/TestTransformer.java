package br.usjt.deswebmob.meuprimeiroapp_mvp.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTransformer {
    Transformer model;
    @Before
    public void setup(){
        model = new Transformer();
    }

    @Test
    public void testeInverte(){
        assertEquals("esarf amU", model.inverte("Uma frase"));
        assertEquals("Radar", model.inverte("radaR"));
        assertEquals(" ", model.inverte(" "));
        assertEquals("", model.inverte(""));
        assertEquals(null, model.inverte(null));

    }
}
