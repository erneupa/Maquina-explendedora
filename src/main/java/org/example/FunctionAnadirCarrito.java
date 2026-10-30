package org.example;

import java.util.Scanner;

public class FunctionAnadirCarrito {
    public static void anadirCarrito(String[][] arrayMaquina, int[][] arrayMaquinaBack, String[] productosNombres, float[] precios, int[] carrito) {

        FunctionTablaProducto.tablaProducto(arrayMaquinaBack, productosNombres, precios);

        Scanner escaner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.print("Escribe el código del producto o 'salir' para terminar: ");
            String codigo = escaner.nextLine();

            if (codigo.equalsIgnoreCase("salir")) {
                salir = true;
            } else {
                boolean encontrado = false;
                int filaEncontrada = -1;
                int colEncontrada = -1;

                for (int fila = 0; fila < arrayMaquina.length; fila++) {
                    for (int columna = 0; columna < arrayMaquina[fila].length; columna++) {
                        if (codigo.equalsIgnoreCase(arrayMaquina[fila][columna])) {
                            encontrado = true;
                            filaEncontrada = fila;
                            colEncontrada = columna;
                            break;
                        }
                    }
                    if (encontrado) break;
                }

                if (!encontrado) {
                    System.out.println("El código no existe.");
                } else {
                    int indiceLineal = (filaEncontrada * 5) + colEncontrada;
                    int stockDisponible = arrayMaquinaBack[filaEncontrada][colEncontrada];
                    String nombreArticulo = productosNombres[indiceLineal];


                    if (stockDisponible <= 0) {
                        System.out.println("El producto " + nombreArticulo + " está AGOTADO.");
                    } else {
                        System.out.print("¿Cuántas unidades deseas de "+nombreArticulo+"?: ");

                        if (!escaner.hasNextInt()) {
                            System.out.println("Entrada no válida. Debes escribir un número entero.");
                            escaner.nextLine();
                        } else {
                            int unidades = escaner.nextInt();
                            escaner.nextLine();

                            if (unidades <= 0) {
                                System.out.println("Tienes que poner una cantidad real.");
                            } else if (unidades > stockDisponible) {
                                System.out.println("No hay suficiente stock. Disponibles: " + stockDisponible);
                            } else {
                                arrayMaquinaBack[filaEncontrada][colEncontrada] -= unidades;
                                carrito[indiceLineal] += unidades;
                                System.out.println("Añadiendo " + unidades + " " + nombreArticulo + " al carrito.");
                            }
                        }
                    }
                }
            }
        }
    }
}