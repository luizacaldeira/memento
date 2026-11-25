package org.example;

public class VendaEstadoCancelada implements VendaEstado {

    private VendaEstadoCancelada() {};
    private static VendaEstadoCancelada instance = new VendaEstadoCancelada();
    public static VendaEstadoCancelada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Cancelada";
    }

}
