


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ymala
 */

import java.util.Scanner;

public class NumerosParImpar {
    public static void main (String[] args){
        //Realizar un programa que ingresado un numero, me indique si es par o impar.
        System.out.println("\t<<Comparar Dos Números (Mayor y Menor)>>\n");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\tIngrese el numero 1: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.print("\n\t" + num + " es par.");
        } else {            
            System.out.print("\n\t" + num + " es impar.");
        }           
        System.out.println("");        
    }
}
