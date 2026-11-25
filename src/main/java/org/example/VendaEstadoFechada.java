package org.example;

public class VendaEstadoFechada implements VendaEstado {

    private VendaEstadoFechada() {};
    private static VendaEstadoFechada instance = new VendaEstadoFechada();
    public static VendaEstadoFechada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Fechada";
    }

}