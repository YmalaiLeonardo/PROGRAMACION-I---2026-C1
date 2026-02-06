
package com.mycompany.tarea1luiskevin;

/**
 * @author Luis Kevin Diaz Piña
 */
public class NúmerosParesconCicloWHILE {
    public static void main(String[] args) {
        System.out.println("--- Listado de Numeros Pares(2-100) ---");

        int num = 2;

        while (num <= 100) {
            System.out.print(num + " ");

            if (num % 10 == 0) {
                System.out.println();
            }
            num += 2; 
        }
        System.out.println("Fin del ciclo");
    }
}