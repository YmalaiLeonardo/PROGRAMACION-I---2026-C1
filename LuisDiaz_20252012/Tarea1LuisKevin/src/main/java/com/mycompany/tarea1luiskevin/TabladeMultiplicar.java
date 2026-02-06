
package com.mycompany.tarea1luiskevin;

import java.util.Scanner;

/*
 * @author Luis Kevin Diaz Piña
 */
public class TabladeMultiplicar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("De qu numero deseas ver la tabla de multiplicar?: ");
        int tabla = leer.nextInt();

        System.out.println("\n--- Tabla del " + tabla + " ---");

        for (int i = 1; i <= 12; i++) {
            int resultado = tabla * i;
            
            System.out.println(tabla + " x " + i + " = " + resultado);
        }
        leer.close();
    }
}
