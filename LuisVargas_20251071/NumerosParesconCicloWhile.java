/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosparesconciclowhile;

/**
 *
 * @author Luis E. Vargas
 */
public class NumerosParesconCicloWhile {

    public static void main(String[] args) {

        System.out.println("\t<< Numeros Pares del 2 al 100 >>\n");

        int num = 2; // Inicializamos en el primer número par

        while (num <= 100) {
            System.out.println("\tNumero par: " + num);
            
            num += 2; // Incrementamos de 2 en 2
        }

        System.out.println("\n\tFin del programa.");
    }
}