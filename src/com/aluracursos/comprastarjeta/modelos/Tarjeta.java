package com.aluracursos.comprastarjeta.modelos;

public class Tarjeta {
    private double saldo;

    public Tarjeta(double saldo) {
        this.saldo = saldo;
    }

    public boolean verificarSaldoCompra(Producto producto) {
        if (producto.getValor() > this.saldo) {
            System.out.println("\nNo te alcanza para le producto: " + producto.getDescripcion() +
                    " Lo Sentimos");
            return false;
        }
        return true;
    }

    public void compraProducto(Producto producto) {
        this.saldo -= producto.getValor();
        System.out.println("\n¡Compra realizada con Exito!\n");
    }

    public double getSaldo() {
        return saldo;
    }
}
