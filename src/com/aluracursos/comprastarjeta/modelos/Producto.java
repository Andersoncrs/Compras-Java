/**
 * Clase que representa un producto con una descripción y un valor asociado.
 * Implementa la interfaz Comparable para permitir la comparación de productos
 * según su valor.
 */
package com.aluracursos.comprastarjeta.modelos;

public class Producto implements Comparable<Producto> {
    private final String descripcion;
    private final double valor;

    /**
     * Constructor de la clase Producto.
     *
     * @param descripcion Descripción del producto.
     * @param valor Valor del producto.
     */
    public Producto(String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    /**
     * Obtiene la descripción del producto.
     *
     * @return Descripción del producto.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene el valor del producto.
     *
     * @return Valor del producto.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Convierte el objeto Producto a una representación en forma de cadena.
     *
     * @return Representación del producto en forma de cadena.
     */
    @Override
    public String toString() {
        return "Producto: " + this.getDescripcion() + ", Valor: " + this.getValor();
    }

    /**
     * Compara este producto con otro basado en su valor.
     *
     * @param producto Producto a comparar.
     * @return Resultado de la comparación (positivo, negativo o cero).
     */
    @Override
    public int compareTo(Producto producto) {
        return Double.compare(this.getValor(), producto.getValor());
    }
}