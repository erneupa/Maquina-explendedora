package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner escanerSeleccion = new Scanner(System.in);

        String[][] arrayMaquina = new String[6][5];

        int[][] arrayMaquinaBack = new int[6][5];
        FunctionInicializarStock.inicializarStock(arrayMaquinaBack, 10);
        FunctionInicializarCodigos.inicializarCodigos(arrayMaquina);


        int[] carrito = new int[30];


        float[] precios={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
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

        int seleccion;


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
            while (!escanerSeleccion.hasNextInt()) {
                System.out.println("Entrada no válida. Escribe una opción del 1 al 6: ");
                escanerSeleccion.next(); // Limpia la letra del escáner
            }

            seleccion = escanerSeleccion.nextInt();

            boolean estadoSeleccion = false;

            while (!estadoSeleccion) {
                if (seleccion <= 0 || seleccion > 6) {
                    System.out.println("Vuelve a escribir una opción correcta: ");
                    while (!escanerSeleccion.hasNextInt()) {
                        System.out.println("Entrada no válida. Debe ser un número del 1 al 6: ");
                        escanerSeleccion.next();
                    }
                    seleccion = escanerSeleccion.nextInt();
                } else {
                    estadoSeleccion = true;
                }
            }


            switch (seleccion) {

                case 1:

                    FunctionImprimirMatriz.imprimirMatriz(arrayMaquina);

                    FunctionTablaProducto.tablaProducto(arrayMaquinaBack,productosNombres,precios);


                    break;

                case 2:
                    FunctionAnadirCarrito.anadirCarrito(arrayMaquina, arrayMaquinaBack, productosNombres, precios, carrito);
                    break;

                case 3:

                    FunctionCarrito.logicaCarrito(carrito, productosNombres, precios);
                    break;

                case 4:
                    FunctionCobro.procesarPago(carrito, precios);
                    break;

                case 5:
                    FunctionMantenimiento.modoMantenimiento(arrayMaquina, arrayMaquinaBack, productosNombres);
                    break;

                case 6:

                    System.out.println("Saliendo...");
                    apagar=true;

            }

        }while (!apagar);



    }
}