package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class FunctionMantenimiento {
    public static void modoMantenimiento(String[][] arrayMaquina, int[][] arrayMaquinaBack, String[] productosNombres) {

        Scanner escaner = new Scanner(System.in);
        String pin = "1234";

        System.out.println("Introduce el PIN: ");
        String pinIngresado = escaner.nextLine();

        if (!pinIngresado.equals(pin)) {
            System.out.println("PIN incorrecto.");
        } else {
            System.out.println("Accediendo...");
            int opcion;

            do {
                System.out.println("MENÚ DE MANTENIMIENTO");
                System.out.println("1. Reponer stock de un producto");
                System.out.println("2. Reposición completa");
                System.out.println("3. Volver al menú principal");
                System.out.print("Selecciona una opción: ");

                if (!escaner.hasNextInt()) {
                    System.out.println("Entrada no válida. Escribe un número.");
                    escaner.next();
                    opcion = 0;
                } else {
                    opcion = escaner.nextInt();
                    escaner.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.println("Introduce el código de producto: ");
                            String codigo = escaner.nextLine();

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
                                String producto = productosNombres[indiceLineal];
                                int stockActual = arrayMaquinaBack[filaEncontrada][colEncontrada];

                                System.out.println("Producto: "+producto+" Stock actual: "+stockActual);
                                System.out.println("¿Cuántas unidades deseas añadir?: ");

                                if (!escaner.hasNextInt()) {
                                    System.out.println("Cantidad incorrecta.");
                                    escaner.next();
                                } else {
                                    int unidadesSumar = escaner.nextInt();
                                    escaner.nextLine();

                                    if (unidadesSumar <= 0) {
                                        System.out.println("Debes introducir una cantidad mayor a 0.");
                                    } else if (stockActual + unidadesSumar > 10) {
                                        System.out.println("Capacidad superada. El máximo por casilla es 10.");
                                    } else {
                                        arrayMaquinaBack[filaEncontrada][colEncontrada] += unidadesSumar;
                                        System.out.println("Stock actualizado: "+arrayMaquinaBack[filaEncontrada][colEncontrada]+" unidades de "+producto+" en "+codigo.toUpperCase());
                                    }
                                }
                            }
                            break;

                        case 2:
                            for (int[] ints : arrayMaquinaBack) {
                                Arrays.fill(ints, 10);
                            }
                            System.out.println("Todas las casillas han sido repuestas al máximo.");
                            break;

                        case 3:
                            System.out.println("Saliendo del modo mantenimiento...");
                            break;

                        default:
                            System.out.println("Escribe una opcion entre el 1 y el 3.");
                            break;
                    }
                }
            } while (opcion != 3);
        }
    }
}