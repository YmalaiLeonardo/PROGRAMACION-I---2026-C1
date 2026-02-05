


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ymala
 */
import java.util.Scanner;

public class OperacionesMatematicasBasicas {
    public static void main(String[] args) {
        //Realizar un programa que incluya las 4 operaciones matemáticas básicas (Suma, Resta, Multiplicación y División).
        Scanner sc = new Scanner(System.in);
        var menu = 0;
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("\t<<Operaciones Matematicas Basicas>>\n");
        System.out.print("\tIngresa el numero 1>> ");
        num1 = sc.nextInt();
        System.out.print("\tIngresa el numero 2>> ");
        num2 = sc.nextInt();
        
        while (menu != 5){
            System.out.println("\n\tOperaciones a realizar>>"
                    + "\n\t1. Suma"
                    + "\n\t2. Resta"
                    + "\n\t3. Multiplicacion"
                    + "\n\t4. Division"
                    + "\n\t5. Salir");
            System.out.print("\n\tElije>> ");
            menu = sc.nextInt();
            
            switch  (menu) {
                case 1: 
                    System.out.println("\n\tLa suma de los numeros ingresados es " + suma(num1, num2));
                    break;
                case 2: 
                    System.out.println("\n\tLa resta de los numeros ingresados es " + resta(num1, num2));
                    break;
                case 3: 
                    System.out.println("\n\tLa multiplicacion de los numeros ingresados es " + multiplicacion(num1, num2));
                    break;
                case 4: 
                    System.out.println("\n\tLa division de los numeros ingresados es " + division(num1, num2));
                    break;
                case 5: 
                    menu = 5; 
                    System.out.println("\n\tGracias por usar esta calculadora.");
                    break;
                default:
                    System.out.println("\n\tIngresa un numero correcto... ");
                    break;
            }
        }        
    }         

    
    public static float suma(int num1, int num2){
        return num1 + num2; 
    }
    
    public static float resta(int num1, int num2){
        return num1 - num2; 
    }
    
    public static float multiplicacion(int num1, int num2){
        return num1 * num2; 
    }
    
    public static float division(int num1, int num2){
            if (num1 != 0)
        {
            if (num1 > num2) {
            return num1 / num2;}
            else {
            return num2 / num1;}
        } else {
            return 0;
        }
    }    
}
