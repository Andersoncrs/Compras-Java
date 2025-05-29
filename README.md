# Desafío Compras Cajero

Este proyecto simula un sistema de compras en línea en el que un usuario puede cargar saldo en su tarjeta, comprar productos y generar una factura. Está diseñado para manejar un saldo en tarjeta y verificar si el usuario tiene suficiente saldo para realizar compras.

## Tabla de Contenidos

- [Descripción](#descripción)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Ejemplo de Uso](#ejemplo-de-uso)
- [Contribución](#contribución)
- [Licencia](#licencia)

## Descripción

Este es un proyecto de consola en Java que simula el proceso de compras en línea con una tarjeta. Los usuarios pueden:

1. Ingresar saldo inicial a su tarjeta.
2. Comprar productos, donde se verifica si tienen suficiente saldo.
3. Verificar las compras realizadas y generar una factura con la lista de productos comprados.

El sistema incluye tres paquetes principales:
- **`menu`**: Contiene las funciones relacionadas con la interacción del usuario (mostrar menús, ingresar datos).
- **`modelos`**: Contiene las clases principales para representar objetos como `Producto` y `Tarjeta`.
- **`principal`**: Contiene la clase principal que ejecuta el flujo del programa.

## Uso

Al ejecutar el programa, el flujo es el siguiente:

1. El usuario ingresa el saldo inicial de la tarjeta.
2. El menú presenta opciones:
    - Comprar un producto.
    - Ver la factura y salir.
3. Al seleccionar "Comprar Producto":
    - El usuario ingresa una descripción y valor del producto.
    - El sistema verifica si el saldo es suficiente y realiza la compra.
4. Al seleccionar "Salir", el programa genera la factura con todos los productos comprados.

## Estructura del Proyecto

La estructura del proyecto es la siguiente:

```
Desafio-ComprasCajero/
├── src/
│   └── com/
│       └── aluracursos/
│           └── comprastarjeta/
│               ├── menu/            # Funciones para la interfaz de usuario
│               ├── modelos/         # Clases de negocio (Producto, Tarjeta)
│               └── principal/       # Clase principal que corre la app
├── doc/                                # Documentación generada por JavaDoc
└── README.md                           # Este archivo
```

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para desarrollar el sistema.
- **JavaDoc**: Para generar la documentación del código fuente.
- **Git**: Para el control de versiones y gestión del proyecto en GitHub.

## Ejemplo de Uso

### 1. Ejecutar el programa:

Al ejecutar el programa, la consola te pedirá ingresar un saldo inicial para la tarjeta.

```bash
********* Bienvenido a la tienda SuperCo **********

Por favor ingrese el saldo inicial de la tarjeta: 1000
```

### 2. Interacción con el menú:

El menú de opciones se muestra como sigue:

```bash
Saldo Actual: 1000.00 $

Eliga la Opcion que desea:
 1 - Comprar Producto
 0 - Salir
```

Si elige la opción 1 para comprar un producto:

```bash
Ingrese la Descripción del producto a Comprar
Producto A

Ingrese el valor del Producto: Producto A
300
```

Si el saldo es suficiente, el producto se comprará:

```bash
¡Compra realizada con Exito!
```

### 3. Generar la factura:

Al seleccionar la opción 0 para salir, se generará la factura:

```bash
************* Factura *************
***********************************
Producto: Producto A, Valor: 300.0

***********************************
Saldo: 700.0
***********************************
```

## Contribución

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una rama con tu nueva característica (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva característica'`).
4. Haz push a la rama (`git push origin feature/nueva-caracteristica`).
5. Abre un Pull Request.

## Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.
