package org.example;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private VendaEstado estado;
    private List<VendaEstado> memento = new ArrayList<VendaEstado>();

    public VendaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(VendaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<VendaEstado> getEstados() {
        return this.memento;
    }
}
