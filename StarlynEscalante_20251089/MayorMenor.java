/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author Starlyn Eduardo Escalante
 */

    import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer numero: ");
        int a = sc.nextInt();

        System.out.print("Segundo numero: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("El mayor es " + a + " y el menor es " + b);
        } else if (b > a) {
            System.out.println("El mayor es " + b + " y el menor es " + a);
        } else {
            System.out.println("Son iguales");
        }
    }
}

