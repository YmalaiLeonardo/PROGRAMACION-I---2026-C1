/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosimpares;

/**
 * @author Luis E. Vargas
 */
public class NumerosImpares {

    public static void main(String[] args) {
        System.out.println("\t<< Numeros Impares del 1 al 100 >>\n");

        // i empieza en 1 (impar) y le sumamos 2 en cada vuelta (1, 3, 5...)
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("\tNumero impar: " + i);
        }
    }
}