/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ymala
 */
public class NumeroParesCicloWhile {
    public static void main(String[] args){
        // Realizar un programa que imprima los números pares del 2 al 100 utilizando ciclos while.
        System.out.println("\t<<Numeros Pares Ciclo While>>\n");

        int num = 2;
        while (num < 100) {
        System.out.println("\t"+num);
        num = num + 2;
        }
    }
}
