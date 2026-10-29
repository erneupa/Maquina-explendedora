package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner escanerSeleccion = new Scanner(System.in);
        Scanner escanerSeleccionProducto = new Scanner(System.in);

        String[][] arrayMaquina = new String[6][5];
        int[][] arrayMaquinaBack = new int[6][5];
        int[] precios={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        String[] productosNombres = {
                "Agua",
                "CocaCola",
                "Fanta",
                "Sprite",
                "Pepsi",
                "Zumo",
                "Monster",
                "RedBull",
                "Café",
                "Té",
                "Patatas",
                "Doritos",
                "Cheetos",
                "Palomitas",
                "Gusanos",
                "Cacahuetes",
                "Pistachos",
                "Almendras",
                "KitKat",
                "Snickers",
                "Twix",
                "Mars",
                "Oreo",
                "Galletas",
                "Donut",
                "Croissant",
                "Chicle",
                "Caramelo",
                "Gominolas",
                "Chocolatina"
        };

        int[] productosStock= new int[30];
        int contadorMostrarProductos=110;
        int contadorArrayStock=0;
        int seleccion;
        boolean estadoSeleccion=false;
        int totalProductosCarrito=0;

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

                    FunctionImprimirMatriz.imprimirMatriz(arrayMaquina);

                    for (int[] fila : arrayMaquinaBack) {
                        for (int columna : fila) {

                            productosStock[contadorArrayStock] = columna;
                            contadorArrayStock++;
                        }
                    }

                    System.out.println();
                    System.out.printf("| %-10s | %-18s | %-12s | %-10s |\n", "Código", "Producto", "Precio", "Stock");
                    System.out.println("+------------+--------------------+--------------+------------+");

                    while (contadorMostrarProductos <= 139) {
                        int i = contadorMostrarProductos - 110;
                        String codigo = "B" + contadorMostrarProductos;
                        String precio = precios[i] + "€";

                        System.out.printf("| %-10s | %-18s | %-12s | %-10s |\n",
                                codigo,
                                productosNombres[i],
                                precio,
                                productosStock[i]);

                        contadorMostrarProductos++;
                    }
                    System.out.println("+------------+--------------------+--------------+------------+");

                    break;

                case 2:


                    totalProductosCarrito += FunctionAnadirCarrito.anadirCarrito(arrayMaquina);;

                    break;

                case 3:

                    FunctionCarrito.logicaCarrito(totalProductosCarrito);
                    System.out.println(totalProductosCarrito);
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