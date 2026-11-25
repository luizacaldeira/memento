package org.example;

public class VendaEstadoAberta implements VendaEstado {

    private VendaEstadoAberta() {};
    private static VendaEstadoAberta instance = new VendaEstadoAberta();
    public static VendaEstadoAberta getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aberta";
    }

}