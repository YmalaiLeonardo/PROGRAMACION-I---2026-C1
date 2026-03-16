
package com.mycompany.tareapractica4.javaswing;
import java.util.Scanner;

/**
 * @author kevin
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Usamos Scanner para leer lo que el usuario escribe en la consola
        Scanner teclado = new Scanner(System.in);
        int opcionPrincipal = 0;

        // Bucle while para que el menú se repita hasta que el usuario elija salir
        while (opcionPrincipal != 3) {
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Modo Calculadora");
            System.out.println("2. Modo Conversor de Temperatura");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            
            opcionPrincipal = teclado.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    // --- MODO CALCULADORA ---
                    System.out.println("\n--- MODO CALCULADORA ---");
                    System.out.print("Ingresa el primer número: ");
                    double num1 = teclado.nextDouble();
                    
                    System.out.print("Ingresa el segundo número: ");
                    double num2 = teclado.nextDouble();

                    System.out.println("Elige la operación:");
                    System.out.println("1. Suma (+)");
                    System.out.println("2. Resta (-)");
                    System.out.println("3. Multiplicación (x)");
                    System.out.println("4. División (÷)");
                    System.out.print("Opción: ");
                    int operacion = teclado.nextInt();

                    switch (operacion) {
                        case 1:
                            System.out.println("Resultado: " + (num1 + num2));
                            break;
                        case 2:
                            System.out.println("Resultado: " + (num1 - num2));
                            break;
                        case 3:
                            System.out.println("Resultado: " + (num1 * num2));
                            break;
                        case 4:
                            // Validación de división por cero con IF
                            if (num2 == 0) {
                                System.out.println("⚠️ ERROR: No se puede dividir entre cero.");
                            } else {
                                System.out.println("Resultado: " + (num1 / num2));
                            }
                            break;
                        default:
                            System.out.println("Operación no válida.");
                    }
                    break;

                case 2:
                    // --- MODO CONVERSOR ---
                    System.out.println("\n--- MODO CONVERSOR DE TEMPERATURA ---");
                    System.out.println("1. Fahrenheit a Celsius (°F -> °C)");
                    System.out.println("2. Celsius a Fahrenheit (°C -> °F)");
                    System.out.print("Elige una opción: ");
                    int opcionConv = teclado.nextInt();

                    if (opcionConv == 1) {
                        System.out.print("Ingresa los grados Fahrenheit: ");
                        double fahrenheit = teclado.nextDouble();
                        // Fórmula: °C = (°F − 32) × 5/9
                        // Nota: Usamos 5.0 y 9.0 para que Java no haga división entera y pierda los decimales
                        double celsius = (fahrenheit - 32) * (5.0 / 9.0);
                        System.out.println(fahrenheit + " °F equivalen a " + celsius + " °C");
                        
                    } else if (opcionConv == 2) {
                        System.out.print("Ingresa los grados Celsius: ");
                        double celsius2 = teclado.nextDouble();
                        // Fórmula: °F = (°C × 9/5) + 32
                        double fahrenheit2 = (celsius2 * (9.0 / 5.0)) + 32;
                        System.out.println(celsius2 + " °C equivalen a " + fahrenheit2 + " °F");
                        
                    } else {
                        System.out.println("Opción de conversión no válida.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida. Por favor, intenta de nuevo.");
            }
        }
        
        // Cerramos el scanner por buenas prácticas
        teclado.close();
    }
}