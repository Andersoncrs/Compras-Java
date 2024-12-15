/**
 * Clase que maneja la interacción con el usuario a través del menú.
 * Permite realizar operaciones como ingresar saldo inicial, comprar productos,
 * y generar la factura al finalizar las compras.
 */
package com.aluracursos.comprastarjeta.menu;

import com.aluracursos.comprastarjeta.modelos.Producto;
import com.aluracursos.comprastarjeta.modelos.Tarjeta;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    /**
     * Valida que un valor ingresado sea mayor a cero.
     *
     * @param valor Valor a validar.
     * @return true si el valor no es válido, false en caso contrario.
     */
    public boolean validacionIngresoValor(double valor) {
        return !(valor > 0);
    }

    /**
     * Presenta el menú inicial para ingresar el saldo de la tarjeta.
     *
     * @return Saldo inicial ingresado.
     */
    public double presentarIngresoSaldoIncial() {
        do {
            try {
                System.out.println("""
                        ********* Bienvendio a la tienda SuperCo **********
                        
                        Por favor ingrese el saldo incial de la tarjeta:""");
                double saldoIngresado = input.nextDouble();
                limpiarBufferScanner();
                if (validacionIngresoValor(saldoIngresado)) {
                    System.out.println("Error: Ingresa un valor mayor a 0 por favor\n");
                    continue;
                }
                return saldoIngresado;
            } catch (Exception e) {
                limpiarBufferScanner();
                System.out.println("Ha ocurrido un Error: " + e);
                System.out.println("Intentelo de Nuevo Por favor\n");
            }
        } while (true);
    }

    /**
     * Muestra el menú principal y permite elegir una opción.
     *
     * @param tarjeta Tarjeta con el saldo actual.
     * @return Opcion elegida por el usuario.
     */
    public int mostrarMenu(Tarjeta tarjeta) {
        int opcionElegida;
        do {
            try {
                System.out.printf("""
                        Saldo Actual: %.2f $
                        
                        Eliga la Opcion que desea:
                         1 - Comprar Producto
                         0 - Salir
                        """, tarjeta.getSaldo());
                opcionElegida = input.nextInt();
                limpiarBufferScanner();
                if (opcionElegida != 1 && opcionElegida != 0) {
                    System.out.println("Ha elegido una opcion incorrecta, intentelo de nuevo.\n");
                    continue;
                }
                return opcionElegida;
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error " + e);
                System.out.println("Intentelo de nuevo\n");
                limpiarBufferScanner();
            }
        } while (true);
    }

    /**
     * Permite al usuario ingresar la descripción de un producto.
     *
     * @return Descripción del producto ingresada por el usuario.
     */
    public String ingresarDescripcionProducto() {
        do {
            System.out.println("Ingrese la Descipcion del producto a Comprar");
            String productoIngresado = input.nextLine();
            if (Objects.equals(productoIngresado, "")) {
                System.out.println("Ingrese un Producto Por favor");
                continue;
            }
            return productoIngresado;
        } while (true);
    }

    /**
     * Permite al usuario ingresar el valor de un producto.
     *
     * @param descripcionProducto Descripción del producto para referencia.
     * @return Valor del producto ingresado por el usuario.
     */
    public double ingresarValorProducto(String descripcionProducto) {
        do {
            try {
                System.out.println("\nIngrese el valor del Producto: " + descripcionProducto);
                double valorIngresado = input.nextDouble();
                limpiarBufferScanner();
                if (validacionIngresoValor(valorIngresado)) {
                    System.out.println("Ingrese un valor mayor a 0");
                    continue;
                }
                return valorIngresado;
            } catch (Exception e) {
                limpiarBufferScanner();
                System.out.println("Ha sucedido un Error: " + e);
                System.out.println("Intentelo de nuevo");
            }
        } while (true);
    }

    /**
     * Genera y muestra la factura con los productos comprados y el saldo restante.
     *
     * @param listaDeProductos Lista de productos comprados.
     * @param tarjeta Tarjeta con el saldo restante.
     */
    public void generarFactura(List<Producto> listaDeProductos, Tarjeta tarjeta) {
        Collections.sort(listaDeProductos);
        System.out.println("************* Factura *************");
        System.out.println("***********************************");
        for (Producto producto : listaDeProductos) {
            System.out.println(producto + "\n");
        }
        System.out.println("***********************************");
        System.out.println("Saldo: " + tarjeta.getSaldo());
        System.out.println("***********************************");

    }

    /**
     * Limpia el buffer del Scanner para evitar errores de entrada.
     */
    private void limpiarBufferScanner() {
        if (input.hasNextLine()) {
            input.nextLine();
        }
    }
}

