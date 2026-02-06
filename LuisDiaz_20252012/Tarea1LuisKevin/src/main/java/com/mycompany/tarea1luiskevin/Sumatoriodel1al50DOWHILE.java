
package com.mycompany.tarea1luiskevin;

/**
 * @author Luis Kevin Diaz Piña
 */
public class Sumatoriodel1al50DOWHILE {
    public static void main(String[] args) {

        int suma = 0;
        int contador = 1;

        System.out.println("Calculando la suma de los numeros del 1 al 50...");

        do {
            suma += contador;
            contador++;
        } while (contador <= 50);

        System.out.println("La sumatoria total es: " + suma);
    }
}
