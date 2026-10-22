package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner escanerSeleccion = new Scanner(System.in);
        Scanner escanerSeleccionProducto = new Scanner(System.in);

        String[][] arrayMaquina = new String[6][5];
        int[][] arrayMaquinaBack = new int[6][5];
        int[] precios={1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int[] productosStock= new int[30];
        int contadorArrayStock=0;
        int seleccion = 0;
        boolean estadoSeleccion=false;

        String seleccionProducto = "";
        boolean seleccionProductoEncontrado=false;


        boolean apagar=false;

        do {

            FunctionImprimirMatriz.imprimirMatriz(arrayMaquina);

            System.out.println("1. Mostrar escaparate y cuadrícula de stock");
            System.out.println("2. Seleccionar producto y añadir al carrito");
            System.out.println("3. Consultar cesta de la compra actual");
            System.out.println("4. Abonar compra y retirar productos");
            System.out.println("5. Modo Mantenimiento / Reposición");
            System.out.println("6. Salir / Apagar máquina");

            System.out.println("Escribe la opción que quieres hacer: ");
            seleccion = escanerSeleccion.nextInt();

            while (!estadoSeleccion){

                if (seleccion <=0 || seleccion > 6){

                    System.out.println("Vuelve a escribir una opción correcta: ");
                    seleccion = escanerSeleccion.nextInt();

                }
                else{

                    estadoSeleccion = true;
                }
            }


            switch (seleccion) {

                case 1:

                    FunctionImprimirMatrizBack.imprimirMatrizBack(arrayMaquinaBack);

                    for (int fila=0; fila<arrayMaquinaBack.length;fila++){
                        for (int columna=0;columna<arrayMaquinaBack[fila].length;columna++){

                            productosStock[contadorArrayStock]=arrayMaquinaBack[fila][columna];
                            contadorArrayStock++;
                        }
                    }
                    System.out.println(Arrays.toString(productosStock));
                    break;

                case 2:

                    System.out.println("Escribe el código de producto para añadirlo al carrito: ");
                    seleccionProducto=escanerSeleccionProducto.nextLine();

                    do{

                        for (String[] fila : arrayMaquina){
                            for (String columna :fila){

                                if (seleccionProducto.equals(columna)){

                                    System.out.println("Guardando el producto "+seleccionProducto+" en el carrito");
                                    seleccionProductoEncontrado=true;

                                }

                            }
                        }

                        if (!seleccionProductoEncontrado){
                            System.out.println("Escribe el código de producto para añadirlo al carrito: ");
                            seleccionProducto=escanerSeleccionProducto.nextLine();
                        }

                    }while(!seleccionProductoEncontrado);

                    break;

                case 3:

                    FunctionCarrito.logicaCarrito(seleccionProducto);
                    break;

                case 4:

                    System.out.println("Acción 4 inactiva");
                    break;

                case 5:

                    System.out.println("Acción 5 inactiva");
                    break;

                case 6:

                    System.out.println("Saliendo...");
                    apagar=true;

            }

        }while (!apagar);



    }
}