package org.example;

public class FunctionCarrito {
    public static void logicaCarrito(String seleccionProducto) {


        if (seleccionProducto!=""){
            System.out.println(seleccionProducto);
        }
        else{
            System.out.println("No se ha guardado ningún producto en el carrito");
        }
    }
}
