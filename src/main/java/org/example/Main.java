package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);


        int seleccion = 0;


        boolean apagar=false;
        do{
            System.out.println("1. Mostrar escaparate y cuadrícula de stock");
            System.out.println("2. Seleccionar producto y añadir al carrito");
            System.out.println("3. Consultar cesta de la compra actual");
            System.out.println("4. Abonar compra y retirar productos");
            System.out.println("5. Modo Mantenimiento / Reposición");
            System.out.println("6. Salir / Apagar máquina");

            System.out.println("Escribe la opción que quieres hacer");
            seleccion=escaner.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Acción 1 inactiva");
                    break;
                case 2:
                    System.out.println("Acción 2 inactiva");
                    break;
                case 3:
                    System.out.println("Acción 3 inactiva");
                    break;
                case 4:
                    System.out.println("Acción 4 inactiva");
                    break;
                case 5:
                    System.out.println("Acción 5 inactiva");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    apagar=true;
                    break;

            }
        }while (apagar!=true);

    }
}