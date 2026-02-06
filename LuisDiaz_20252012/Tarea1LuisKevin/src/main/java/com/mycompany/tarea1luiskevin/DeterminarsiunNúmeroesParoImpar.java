
package com.mycompany.tarea1luiskevin;

import java.util.Scanner;

/**
 * @author Luis Kevin Diaz Piña
 */
public class DeterminarsiunNúmeroesParoImpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("--- Detector de Numeros Pares e Impares ---");
        System.out.print("Ingresa un numero entero: ");
        
        int numero = leer.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es PAR.");
        } else {
            System.out.println("El numero " + numero + " es IMPAR.");
        }
        leer.close();
    }
}
