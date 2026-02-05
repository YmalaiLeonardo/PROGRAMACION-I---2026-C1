/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ymala
 */
public class SumatoriaDoWhile {
    public static void main(String[] args){
        //Realizar un programa que imprima la sumatoria de los números del 1 al 50 utilizando ciclos do while.

        System.out.println("\t<<Sumatoria de Numeros con Do While>>\n");

        int suma = 0;
        int i = 1;

            do {
                suma = suma +i;
                i++;
                System.out.println("\t"+suma);
            } while (i <= 50);

            System.out.println("\n\tLa sumatoria total es: " + suma);
    }
}
