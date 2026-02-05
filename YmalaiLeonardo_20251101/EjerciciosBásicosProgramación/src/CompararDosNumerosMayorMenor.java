


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ymala
 */
import java.util.Scanner;

public class CompararDosNumerosMayorMenor {
    public static void main (String[] args){
        //Realizar un programa que dado dos números, me indique cual es el mayor y cual es el menor de ambos.
        System.out.println("\t<<Comparar Dos Números (Mayor y Menor)>>\n");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\tIngrese el numero 1: ");
        int num1 = sc.nextInt();
        System.out.print("\tIngrese el numero 2: ");
        int num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println("\n\tEl numero " + num1 + " es mayor que " + num2 + ".");
        } else {
            System.out.println("\n\tEl numero " + num2 + " es mayor que " + num1 + ".");
        } 
    }
}
