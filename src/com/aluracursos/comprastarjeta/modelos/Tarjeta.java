/**
 * Clase que representa una tarjeta con un saldo asociado.
 * Se encarga de manejar operaciones como la verificación del saldo
 * para compras y la actualización del saldo después de una compra.
 */
package com.aluracursos.comprastarjeta.modelos;

public class Tarjeta {
    private double saldo;

    /**
     * Constructor de la clase Tarjeta.
     *
     * @param saldo El saldo inicial de la tarjeta.
     */
    public Tarjeta(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Verifica si el saldo es suficiente para comprar un producto.
     *
     * @param producto Producto que se desea comprar.
     * @return true si el saldo es suficiente, false en caso contrario.
     */
    public boolean verificarSaldoCompra(Producto producto) {
        if (producto.getValor() > this.saldo) {
            System.out.println("\nNo te alcanza para el producto: " + producto.getDescripcion() +
                    " Lo Sentimos");
            return false;
        }
        return true;
    }

    /**
     * Realiza una compra, descontando el valor del producto del saldo.
     *
     * @param producto Producto que se desea comprar.
     */
    public void compraProducto(Producto producto) {
        this.saldo -= producto.getValor();
        System.out.println("\n¡Compra realizada con Exito!\n");
    }

    /**
     * Obtiene el saldo actual de la tarjeta.
     *
     * @return Saldo actual de la tarjeta.
     */
    public double getSaldo() {
        return saldo;
    }
}
