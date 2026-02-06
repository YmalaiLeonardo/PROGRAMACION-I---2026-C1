/*@author Arturo*/
import java.util.Scanner;

public class OperacionesMatematicasBasicas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var menu = 0;
        float num1, num2, resultado;
        
        System.out.println("Operaciones Basicas");
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextFloat();
        
        while(menu != 5){
            System.out.println("\nElija la operacion: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.println("Elija: ");
            menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println("La suma de los numeros es: " + resultado);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println("La resta de los numeros es: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println("La multiplicacion de los numeros es: " + resultado);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    System.out.println("La division de los numeros es: " + resultado);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        sc.close();
    }
    public static float sumar(float a, float b) {
        return a + b;
    }

    public static float restar(float a, float b) {
        return a - b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        if(b != 0) {
            return a / b;
        } else {
            System.out.println("Error: division entre 0");
            return 0;
        }
    }
}
