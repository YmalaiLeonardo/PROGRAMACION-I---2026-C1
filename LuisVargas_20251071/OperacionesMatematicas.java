package com.mycompany.operacionesmatematicas;

import java.util.Scanner; 

/**
 * @author Luis E. Vargas
 */
public class OperacionesMatematicas {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0; // Inicializamos en 0 para que entre al while directamente
        int num1 = 0;
        int num2 = 0;

        System.out.println("\t<< Operaciones Matematicas Basicas >>\n");
        System.out.print("\tIngresa el numero 1 >> ");
        num1 = sc.nextInt();
        System.out.print("\tIngresa el numero 2 >> ");
        num2 = sc.nextInt();

        // El bucle comienza aquí y pedirá el menú UNA SOLA VEZ por vuelta
        while (menu != 5) {
            System.out.println("\n\t--- Operaciones a realizar ---");
            System.out.println("\t1. Suma");
            System.out.println("\t2. Resta");
            System.out.println("\t3. Multiplicacion");
            System.out.println("\t4. Division");
            System.out.println("\t5. Salir");
            System.out.print("\tElije >> ");
            
            menu = sc.nextInt(); // AQUÍ es donde el programa espera tu elección

            switch (menu) {
                case 1:
                    System.out.println("\n\tLa suma de los numeros ingresados es: " + suma(num1, num2));
                    break;
                case 2:
                    System.out.println("\n\tLa resta de los numeros ingresados es: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("\n\tLa multiplicacion de los numeros ingresados es: " + multiplicacion(num1, num2));
                    break;
                case 4:
                    System.out.println("\n\tLa division de los numeros ingresados es: " + division(num1, num2));
                    break;
                case 5:
                    System.out.println("\n\tGracias por usar esta calculadora.");
                    break;
                default:
                    System.out.println("\n\tIngresa un numero correcto...");
                    break;
            }
        }
        sc.close();
    }

    // Métodos de la imagen
    public static float suma(int num1, int num2) {
        return (float) num1 + num2;
    }

    public static float resta(int num1, int num2) {
        return (float) num1 - num2;
    }

    public static float multiplicacion(int num1, int num2) {
        return (float) num1 * num2;
    }

    public static float division(int num1, int num2) {
        if (num2 != 0) {
            if (num1 > num2) {
                return (float) num1 / num2;
            } else {
                return (float) num2 / num1;
            }
        } else {
            return 0;
        }
    }
}
