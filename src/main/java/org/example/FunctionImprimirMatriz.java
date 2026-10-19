package org.example;

public class FunctionImprimirMatriz {
    public static void imprimirMatriz(String[][] arrayMaquina) {
        System.out.println("________________________________________________________");
        System.out.println("|                                                      |");
        System.out.println("|                     AUTOSERVICIO                     |");
        System.out.println("|                                                      |");

        for (int fila = 0; fila < arrayMaquina.length; fila++) {
            System.out.println("| |--------------------------------------------------| |");
            System.out.print("|  ");
            for (int columna = 0; columna < arrayMaquina[fila].length; columna++) {
                System.out.print(" " + arrayMaquina[fila][columna] + "   |  ");
            }
            System.out.println();
        }

        System.out.println("| |--------------------------------------------------| |");
        System.out.println("|                                                      |");
        System.out.println("________________________________________________________");
    }
}
