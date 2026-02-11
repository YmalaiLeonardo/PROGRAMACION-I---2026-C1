//@author Arturo
import java.util.Scanner;

public class CalculadoraMatematica {

    private double numero1;

    private double numero2;

    //constructor
    public CalculadoraMatematica() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    //metodo para ingresar los numeros
    public void ingresarNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    /**
     * Calcula la suma de los numeros
     * 
     * @return resultado de la suma
     */
    public double sumar() {
        return numero1 + numero2;
    }

    /**
     * Calcula la resta de los numeros
     * 
     * @return resultado de la resta
     */
    public double restar() {
        return numero1 - numero2;
    }

    /**
     * Calcula la multiplicacion de los numeros
     * 
     * @return resultado de la multiplicacion
     */
    public double multiplicar() {
        return numero1 * numero2;
    }

    /**
     * Calcula la division de los numeros
     * Valida que el divisor no sea cero
     * 
     * @return resultado de la division
     */
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return 0;
        }
        return numero1 / numero2;
    }

    //Metodo principal del programa
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculadoraMatematica calculadora = new CalculadoraMatematica();

        int opcionMenu;
        double n1, n2;

        do {
            System.out.println("\n===== CALCULADORA MATEMATICA =====");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Salir");
            System.out.println("=================================");
            System.out.print("Seleccione una opcion: ");
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {

                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    n1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    n2 = sc.nextDouble();
                    calculadora.ingresarNumeros(n1, n2);
                    System.out.println("Numeros ingresados correctamente.");
                    break;

                case 2:
                    System.out.println("Resultado de la suma: " + calculadora.sumar());
                    break;

                case 3:
                    System.out.println("Resultado de la resta: " + calculadora.restar());
                    break;

                case 4:
                    System.out.println("Resultado de la multiplicacion: " + calculadora.multiplicar());
                    break;

                case 5:
                    System.out.println("Resultado de la division: " + calculadora.dividir());
                    break;

                case 6:
                    System.out.println("Gracias por usar la calculadora.");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }

        } while (opcionMenu != 6);

        sc.close();
    }
}
