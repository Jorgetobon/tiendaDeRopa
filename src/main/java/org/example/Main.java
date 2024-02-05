package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre;
        String apelldio;
        String tipoDeCliente;
        double cantidaArticulos;
        double precioTotal;
        double totalConDescuento;
        double descuento;


        Scanner teclado = new Scanner(System.in);

        System.out.println("***********************************************");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese el apellido del cliente: ");
        apelldio = teclado.nextLine();
        System.out.println("Ingrese el tipo de cliente: ");
        tipoDeCliente = teclado.nextLine();


        System.out.println("Digite el precio sin descuento");
        precioTotal = teclado.nextDouble();

        System.out.println("Digite la cantidad: ");
        cantidaArticulos = teclado.nextDouble();

        if (tipoDeCliente.toUpperCase().equals("REGULAR")) {
            if (cantidaArticulos >= 1 && cantidaArticulos <= 3) {
                descuento = 0.5 * precioTotal;


                System.out.println("Disfruta tu compra");
            } else if (cantidaArticulos >= 4 && cantidaArticulos <= 6) {
                descuento = 0.10 * precioTotal;
                System.out.println("Disfruta tu compra");
            } else if (cantidaArticulos >=6) {
                descuento = 0.15 * precioTotal;
                System.out.println("Disfruta tu compra");

            }
        }else

        if (tipoDeCliente.toUpperCase().equals("VIP")){
            if (cantidaArticulos >= 1 && cantidaArticulos <= 3) {
                descuento = 0.10 * precioTotal;
                System.out.println("Disfruta tu compra");

            } else if(cantidaArticulos >= 4 && cantidaArticulos <= 6 ) {
                descuento = 0.15 * precioTotal;
                System.out.println("Disfruta tu compra");

            } else if(cantidaArticulos >= 6) {
                descuento = 0.20 * precioTotal;

            }else{
                System.out.println("Ingrese si el cliente es (REGULAR O VIP)");
                return;

            }

            totalConDescuento = precioTotal + descuento;

            System.out.println("\nResumen de la compra:");
            System.out.println("Cliente: " + nombre);
            System.out.println("Tipo de cliente: " + tipoDeCliente);
            System.out.println("Cantidad de artículos: " + cantidaArticulos);
            System.out.println("Descuento aplicado: " + (descuento ) + "%");
            System.out.println("Cantidad descontada: $" + (precioTotal - totalConDescuento));
            System.out.println("Total a pagar: $" + (precioTotal-descuento));
            System.out.println("*********************************");

        }

    }
}