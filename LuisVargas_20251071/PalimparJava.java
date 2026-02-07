/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palimpar.java;

import java.util.Scanner;

/**
 *
 * @author Luis E. Vargas
 */
public class PalimparJava {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }

        entrada.close();
    }
}