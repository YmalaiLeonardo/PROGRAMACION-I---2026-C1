/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumatoriadowhile;

/**
 *
 * @author Luis E. Vargas
 */
public class SumatoriaDoWhile {
    public static void main(String[] args) {

        int suma = 0;
        int i = 1;

        System.out.println("<<Sumatoria de Numeros con Do While>>");

        do {
            suma += i;
            System.out.println(suma);
            i++;
        } while (i <= 50);

        System.out.println("\nLa sumatoria total es: " + suma);
    }
}
