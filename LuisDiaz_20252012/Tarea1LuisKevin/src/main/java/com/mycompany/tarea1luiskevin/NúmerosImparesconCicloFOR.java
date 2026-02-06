
package com.mycompany.tarea1luiskevin;

/**
 * @author Luis Kevin Diaz Piña
 */
public class NúmerosImparesconCicloFOR {
   public static void main(String[] args) {
        System.out.println("--- Listado de Numeros Impares (1-100) ---");

        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " "); 
         
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        System.out.println("Fin del ciclo.");
    } 
}
