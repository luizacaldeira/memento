package org.example;

public class VendaEstadoEmNegociacao implements VendaEstado {

    private VendaEstadoEmNegociacao() {};
    private static VendaEstadoEmNegociacao instance = new VendaEstadoEmNegociacao();
    public static VendaEstadoEmNegociacao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em negociação";
    }

}