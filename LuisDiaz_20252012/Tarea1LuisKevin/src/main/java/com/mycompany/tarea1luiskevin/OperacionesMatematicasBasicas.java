
package com.mycompany.tarea1luiskevin;

import java.util.Scanner;

/**
 * @author Luis Kevin Diaz Piña
 */

public class OperacionesMatematicasBasicas {
   
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("--- Calculadora Basica ---");

        System.out.print("Introduce el primer numero: ");
        double num1 = leer.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = leer.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("\n--- Resultados ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        
        if (num2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: No se puede dividir por cero.");
        }
        leer.close();
    } 
}