
package com.mycompany.tarea1luiskevin;

import java.util.Scanner;

/*
 * @author Luis Kevin Diaz Piña
 */
public class CompararDosNúmerosMayoryMenor {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("--- Comparador de Numeros ---");
        
        System.out.print("Ingresa el primer numero: ");
        double n1 = leer.nextDouble();
        
        System.out.print("Ingresa el segundo numero: ");
        double n2 = leer.nextDouble();

        if (n1 > n2) {
            System.out.println("El numero mayor es: " + n1);
            System.out.println("El numero menor es: " + n2);
        } else if (n2 > n1) {
            System.out.println("El numero mayor es: " + n2);
            System.out.println("El numero menor es: " + n1);
        } else {
            // Caso en el que ambos números sean iguales
            System.out.println("Ambos numeros son iguales (" + n1 + ").");
        }
        leer.close();
    }
}
