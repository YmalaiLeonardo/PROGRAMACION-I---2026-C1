/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author Luis E. Vargas
 */
public class TablaMultiplicar {

   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           System.out.println("\t<< Generador de Tablas de Multiplicar >>\n");
           
           // Solicitamos el número al usuario
           System.out.print("\tQue tabla deseas ver? >> ");
           int tabla = sc.nextInt();
           
           System.out.println("\n\tTabla del " + tabla + ":");
           System.out.println("\t-------------------");
           
           // Usamos un for del 1 al 10 para multiplicar
           for (int i = 1; i <= 10; i++) {
               int resultado = tabla * i;
               // Imprimimos uno abajo de otro para que salga en cadena
               System.out.println("\t" + tabla + " x " + i + " = " + resultado);
           }
           
           System.out.println("\t-------------------");
       }
    }
}