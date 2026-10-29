package org.example;

import java.util.Objects;
import java.util.Scanner;

public class FunctionAnadirCarrito {
    public static int anadirCarrito(String[][] arrayMaquina){

        Scanner escaner=new Scanner(System.in);
        int contador=0;
        boolean encontrado = false;

        boolean salir=false;
        String producto="";
        while (!salir) {

            System.out.println("Escribe el código de producto para añadirlo al carrito (o 'salir' para terminar): ");
            producto = escaner.nextLine();
            if (Objects.equals(producto, "salir")){
                salir=true;
            }
            else{

                for (String[] fila : arrayMaquina) {
                    for (String columna : fila) {

                        if (producto.equals(columna)) {
                            contador++;
                            encontrado=true;
                            System.out.println("Guardando el producto " + producto + " en el carrito");

                        }


                    }
                }
                if (!encontrado) {
                    System.out.println("El producto no existe.");
                }

            }


        }

        return contador;
    }

}
