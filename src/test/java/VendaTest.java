import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    @Test
    void deveArmazenarEstados() {
        Venda venda = new Venda();
        venda.setEstado(VendaEstadoAberta.getInstance());
        venda.setEstado(VendaEstadoFechada.getInstance());
        assertEquals(2, venda.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Venda venda = new Venda();
        venda.setEstado(VendaEstadoAberta.getInstance());
        venda.setEstado(VendaEstadoFechada.getInstance());
        venda.restauraEstado(0);
        assertEquals(VendaEstadoAberta.getInstance(), venda.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Venda venda = new Venda();
        venda.setEstado(VendaEstadoAberta.getInstance());
        venda.setEstado(VendaEstadoEmNegociacao.getInstance());
        venda.setEstado(VendaEstadoAberta.getInstance());
        venda.setEstado(VendaEstadoFechada.getInstance());
        venda.restauraEstado(2);
        assertEquals(VendaEstadoAberta.getInstance(), venda.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Venda venda = new Venda();
            venda.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoIndiceNegativo() {
        try {
            Venda venda = new Venda();
            venda.setEstado(VendaEstadoAberta.getInstance());
            venda.restauraEstado(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}