package org.example;

public class FunctionImprimirMatrizBack {
    public static void imprimirMatrizBack(int[][] arrayMaquinaBack) {


        System.out.println("_________________________________________");
        System.out.println("|                                       |");
        System.out.println("|              AUTOSERVICIO             |");
        System.out.println("|                                       |");

        for (int fila = 0; fila < arrayMaquinaBack.length; fila++) {
            System.out.println("| |-----------------------------------| |");
            System.out.print("|  ");
            for (int columna = 0; columna < arrayMaquinaBack[fila].length; columna++) {


                System.out.print(" " + arrayMaquinaBack[fila][columna] + "   |  ");

            }
            System.out.println();

        }

        System.out.println("| |-----------------------------------| |");
        System.out.println("|                                       |");
        System.out.println("_________________________________________");

    }
}
