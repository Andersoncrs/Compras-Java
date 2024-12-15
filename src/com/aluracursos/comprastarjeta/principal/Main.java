package com.aluracursos.comprastarjeta.principal;

import com.aluracursos.comprastarjeta.menu.Menu;
import com.aluracursos.comprastarjeta.modelos.Producto;
import com.aluracursos.comprastarjeta.modelos.Tarjeta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double saldoIngresado;
        int eleccionMenu;
        String descripcionProducto;
        double valorIngresado;
        List<Producto> listaCompras = new ArrayList<>();

        Menu menu = new Menu();
        saldoIngresado = menu.presentarIngresoSaldoIncial();
        Tarjeta tarjeta = new Tarjeta(saldoIngresado);


        do {
            eleccionMenu = menu.mostrarMenu(tarjeta);
            switch (eleccionMenu) {
                case 1:
                    descripcionProducto = menu.ingresarDescripcionProducto();
                    valorIngresado = menu.ingresarValorProducto(descripcionProducto);
                    Producto producto = new Producto(descripcionProducto, valorIngresado);
                    if (tarjeta.verificarSaldoCompra(producto)) {
                        tarjeta.compraProducto(producto);
                        listaCompras.add(producto);
                    } else {
                        eleccionMenu = 0;
                        menu.generarFactura(listaCompras, tarjeta);
                    }
                    break;
                case 0:
                    menu.generarFactura(listaCompras, tarjeta);
                    break;
            }
        } while (eleccionMenu != 0);

        System.out.println("¡Gracias por utilizar nuestros servicios!");

    }
}