package org.example;

public class FunctionImprimirMatriz {
    public static void imprimirMatriz(String[][] arrayMaquina) {
        System.out.println("________________________________________________________");
        System.out.println("|                                                      |");
        System.out.println("|                     AUTOSERVICIO                     |");
        System.out.println("|                                                      |");

        for (String[] strings : arrayMaquina) {
            System.out.println("| |--------------------------------------------------| |");
            System.out.print("|  ");
            for (String string : strings) {
                System.out.print(" " + string + "   |  ");
            }
            System.out.println();
        }

        System.out.println("| |--------------------------------------------------| |");
        System.out.println("|                                                      |");
        System.out.println("________________________________________________________");
    }
}
