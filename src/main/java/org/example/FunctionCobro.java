package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class FunctionCobro {
    public static void procesarPago(int[] carrito, float[] precios) {

        Scanner escaner = new Scanner(System.in).useLocale(java.util.Locale.US);

        float totalPagar = 0;
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] > 0) {
                totalPagar += carrito[i] * precios[i];
            }
        }

        if (totalPagar == 0) {
            System.out.println("El carrito está vacío.");
        }
        else{

            System.out.println("PAGAR CUENTA");
            System.out.printf("Importe total a pagar: %.2f €\n", totalPagar);

            float dineroEntregado = 0;


            while (dineroEntregado < totalPagar) {
                float restante = totalPagar - dineroEntregado;
                System.out.printf("Restante por pagar: %.2f €. Meta dinero en efectivo: \n", restante);

                if (!escaner.hasNextFloat()) {
                    System.out.println("Entrada no válida. Introduzca un número.");
                    escaner.next();
                } else {
                    float ingreso = escaner.nextFloat();

                    if (ingreso <= 0) {
                        System.out.println("Meta una cantidad positiva.");
                    } else {
                        dineroEntregado += ingreso;
                    }
                }
            }


            float cambio = dineroEntregado - totalPagar;
            System.out.println("Entregando productos...");

            if (cambio > 0) {
                System.out.printf("Devolviendo %.2f €.\n", cambio);
            }

            Arrays.fill(carrito, 0);

        }
    }
}
