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

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digita un numero: ");
        int num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.println("Es Par");
        } else {
            System.out.println("Es Impar");
        }
    }
}
