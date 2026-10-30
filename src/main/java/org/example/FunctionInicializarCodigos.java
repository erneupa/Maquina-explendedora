package org.example;

public class FunctionInicializarCodigos {
    public static void inicializarCodigos(String[][] arrayMaquina) {
        int contador = 110;
        for (int fila = 0; fila < arrayMaquina.length; fila++) {
            for (int columna = 0; columna < arrayMaquina[fila].length; columna++) {
                arrayMaquina[fila][columna] = "B" + contador;
                contador++;
            }
        }
    }
}
