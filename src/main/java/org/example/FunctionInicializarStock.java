package org.example;

import java.util.Arrays;

public class FunctionInicializarStock {
    public static void inicializarStock(int[][] arrayMaquinaBack, int unidadesIniciales) {
        for (int[] fila : arrayMaquinaBack) {
            Arrays.fill(fila, unidadesIniciales);
        }
    }
}
