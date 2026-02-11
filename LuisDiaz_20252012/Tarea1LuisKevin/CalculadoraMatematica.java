package com.mycompany.calculadoramatematica;
import java.util.Scanner;

/**
 *
 * @author Kevin 
 */
public class CalculadoraMatematica {
    // Atributos privados
    private double numero1;
    private double numero2;

    // Constructor por defecto
    public CalculadoraMatematica() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    // Método para establecer números
    public void establecerNumeros(double n1, double n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }

    public double sumar() { return numero1 + numero2; }
    public double restar() { return numero1 - numero2; }
    public double multiplicar() { return numero1 * numero2; }
    
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return numero1 / numero2;
    }

    // EL MÉTODO MAIN DEBE ESTAR AQUÍ PARA QUE MAVEN LO ENCUENTRE
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            CalculadoraMatematica calc = new CalculadoraMatematica();
            int opcionMenu;
            
            do {
                System.out.println("\n===== CALCULADORA MATEMATICA =====");
                System.out.println("1. Ingresar numeros");
                System.out.println("2. Sumar");
                System.out.println("3. Restar");
                System.out.println("4. Multiplicar");
                System.out.println("5. Dividir");
                System.out.println("0. Salir");
                System.out.println("==================================");
                System.out.print("Seleccione una opcion: ");
                
                opcionMenu = sc.nextInt();
                
                switch (opcionMenu) {
                    case 1 -> {
                        System.out.print("Numero 1: ");
                        double n1 = sc.nextDouble();
                        System.out.print("Numero 2: ");
                        double n2 = sc.nextDouble();
                        calc.establecerNumeros(n1, n2);
                    }
                    case 2 -> System.out.println("Suma: " + calc.sumar());
                    case 3 -> System.out.println("Resta: " + calc.restar());
                    case 4 -> System.out.println("Multiplicacion: " + calc.multiplicar());
                    case 5 -> System.out.println("Division: " + calc.dividir());
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opcion invalida.");
                }
            } while (opcionMenu != 0);
        }
    }
}