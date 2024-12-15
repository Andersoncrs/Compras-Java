package com.aluracursos.comprastarjeta.modelos;

public class Producto implements Comparable<Producto> {
    private final String descripcion;
    private final double valor;

    public Producto(String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Producto: " + this.getDescripcion() + ", Valor: " + this.getValor();
    }

    @Override
    public int compareTo(Producto producto) {
        return Double.compare(this.getValor(), producto.getValor());
    }
}
