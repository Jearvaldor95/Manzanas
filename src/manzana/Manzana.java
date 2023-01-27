/*
Programa que calcula el valor a pagar por la compra de un numero de manzanas
si el número de manzanas es igual o menos de dos no se le aplica ningun descuento,
si está entre 3 y 5 el descuento será de 10%, si está entre 6 y 10 será del 15% y mas de 11 manzanas un 20%
*/
package manzana;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Manzana {
public static void main(String[] args) {

        // TODO Auto-generated method stub
        Scanner buscar = new Scanner(System.in);
        int nManzanas, valor, descuento = 0, pago;
        System.out.println("ingrese el numero de manzanas a comprar");

        nManzanas = buscar.nextInt();
        System.out.println("ingrese el valor de la manzana");
        valor = buscar.nextInt();

        if (nManzanas >= 0 && nManzanas <= 2) {

            descuento = 0;
        } else {
            if (nManzanas >= 3 && nManzanas <= 5) {
                descuento = 10;
            } else {
                if (nManzanas >= 6 && nManzanas <= 10) {
                    descuento = 15;

                } else {
                    if (nManzanas >= 11) {
                        descuento = 20;
                    }
                }
            }
        }
        int resultado = (valor * nManzanas) * descuento / 100;
        pago = (valor * nManzanas - resultado);
        System.out.println("el valor a pagar es:" + pago);
    }

}
