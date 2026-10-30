package org.example;

public class FuctionTablaProducto {
    public static void tablaProducto(int[][] arrayMaquinaBack, String[] productosNombres, int[] precios){

        int[] productosStock= new int[30];
        int contadorArrayStock=0;
        int contadorMostrarProductos=110;
        for (int[] fila : arrayMaquinaBack) {
            for (int columna : fila) {
                productosStock[contadorArrayStock] = columna;
                contadorArrayStock++;
            }
        }

        String[][] tablaProductos= new String[30][4];

        while (contadorMostrarProductos <= 139) {
            int i = contadorMostrarProductos - 110;

            tablaProductos[i][0] = "B" + contadorMostrarProductos;
            tablaProductos[i][1] = productosNombres[i];
            tablaProductos[i][2] = precios[i] + "€";
            tablaProductos[i][3] = String.valueOf(productosStock[i]);

            contadorMostrarProductos++;
        }

        System.out.println("|-------------------------------------------------------------|");
        System.out.printf("| %-10s | %-18s | %-12s | %-10s |\n", "Código", "Producto", "Precio", "Stock");
        System.out.println("|-------------------------------------------------------------|");

        for (String[] tablaProducto : tablaProductos) {
            System.out.printf("| %-10s | %-18s | %-12s | %-10s |\n",
                    tablaProducto[0],
                    tablaProducto[1],
                    tablaProducto[2],
                    tablaProducto[3]);
        }

        System.out.println("|-------------------------------------------------------------|");


    }
}
