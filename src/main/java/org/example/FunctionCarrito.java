package org.example;

public class FunctionCarrito {
    public static void logicaCarrito(int[] carrito, String[] productosNombres, float[] precios) {

        System.out.println("CARRITO DE LA COMPRA");
        boolean carritoVacio = true;
        float totalPagar = 0;

        for (int i = 0; i < carrito.length; i++) {

            if (carrito[i] > 0) {
                carritoVacio = false;
                int unidades = carrito[i];
                float precioUnidad = precios[i];
                float totalProducto = unidades * precioUnidad;
                totalPagar += totalProducto;

                System.out.printf("Productos: %s Cantidad: %d Precio: %.2f €  Subtotal: %.2f €\n",
                        productosNombres[i], unidades, precioUnidad, totalProducto);
            }
        }

        if (carritoVacio) {
            System.out.println("Tu cesta de la compra está vacía.");
        } else {
            System.out.println("----------------------------------------------------------------");
            System.out.printf("Total a Pagar: %.2f €\n", totalPagar);
        }
    }
}
