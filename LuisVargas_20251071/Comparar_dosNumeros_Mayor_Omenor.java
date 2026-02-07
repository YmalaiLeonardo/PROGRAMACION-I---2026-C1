/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparar_dosnumeros_mayor_omenor;

import java.util.Scanner;

/**
 *
 * @author Luis E. Vargas
 */
public class Comparar_dosNumeros_Mayor_Omenor {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el primer numero: ");
            int num1 = sc.nextInt();
            
            System.out.print("Ingrese el segundo numero: ");
            int num2 = sc.nextInt();
            
            if (num1 > num2) {
                System.out.println("El numero mayor es: " + num1);
                System.out.println("El numero menor es: " + num2);
            } else if (num2 > num1) {
                System.out.println("El numero mayor es: " + num2);
                System.out.println("El numero menor es: " + num1);
            } else {
                System.out.println("Ambos numeros son iguales");
            }
        }
    }
}
