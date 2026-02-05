


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ymala
 */
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main (String[] args){
        //Realizar un programa que mediante la utilización de bucles, debe permitir imprimir cualquier tabla de multiplicar.
        System.out.println("\t<<Tabla de Multiplicar>>\n");
        
        Scanner sc = new Scanner (System.in);
        System.out.print("\tIngrese el numero>> ");
        int num = sc.nextInt();
        
        System.out.println("");
        for (int i = 1; i <= 10; i++) {
            int multi = i * num;            
            System.out.println("\t" + num + " * " + i + " = " + multi);
        }   
    }
}
