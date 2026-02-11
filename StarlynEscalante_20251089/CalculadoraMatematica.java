import java.util.Scanner;

/**
 * Práctica 1er Parcial - POO
 * Nombre: Starlyn Escalante | Matricula: 2025-1089
 */
public class CalculadoraMatematica {

    // Variables privadas (encapsulamiento)
    private double numero1;
    private double numero2;

    // Constructor por defecto
    public CalculadoraMatematica() {
        this.numero1 = 0.0;
        this.numero2 = 0.0;
    }

    // Metodo para pasar los numeros a las variables
    public void ingresarNumeros(double n1, double n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }

    // --- Metodos de calculo ---

    public double sumar() {
        return numero1 + numero2; // Retorna la suma
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    /**
     * Metodo de division con el IF para que no de error si el divisor es cero
     */
    public double dividir() {
        if (numero2 == 0) {
            System.out.println(">>> Error: No se puede dividir entre cero.");
            return Double.NaN;
        } 
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        // Instanciamos la clase
        CalculadoraMatematica calc = new CalculadoraMatematica();
        Scanner sc = new Scanner(System.in);
        
        int opcion = -1;
        boolean cargado = false; // Para saber si ya pusieron los numeros

        // El bucle do-while del menu
        do {
            System.out.println("\n===== CALCULADORA MATEMATICA =====");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Elige una opcion: ");

            // Evitar que el programa se cierre si el usuario escribe una letra
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                sc.next(); 
                System.out.println("Opcion no valida.");
                continue;
            }

            // Switch para las opciones
            switch (opcion) {
                case 1:
                    System.out.print("Numero 1: ");
                    double v1 = sc.nextDouble();
                    System.out.print("Numero 2: ");
                    double v2 = sc.nextDouble();
                    calc.ingresarNumeros(v1, v2);
                    cargado = true;
                    System.out.println("Listo, numeros guardados.");
                    break;

                case 2:
                    if(cargado) System.out.println("Resultado: " + calc.sumar());
                    else System.out.println("Error: Primero elige la opcion 1.");
                    break;

                case 3:
                    if(cargado) System.out.println("Resultado: " + calc.restar());
                    else System.out.println("Error: Primero elige la opcion 1.");
                    break;

                case 4:
                    if(cargado) System.out.println("Resultado: " + calc.multiplicar());
                    else System.out.println("Error: Primero elige la opcion 1.");
                    break;

                case 5:
                    if(cargado) {
                        double res = calc.dividir();
                        if (!Double.isNaN(res)) {
                            System.out.println("Resultado: " + res);
                        }
                    } else {
                        System.out.println("Error: Primero elige la opcion 1.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo de la calculadora...");
                    break;

                default:
                    System.out.println("Esa opcion no existe.");
                    break;
            }
        } while (opcion != 0);
        
        sc.close();
    }
}
