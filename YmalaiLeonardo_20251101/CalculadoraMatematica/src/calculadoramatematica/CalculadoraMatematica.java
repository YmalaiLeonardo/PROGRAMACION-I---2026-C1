/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramatematica;
import java.util.Scanner;

/**
 *
 * @author ymala
 */
public class CalculadoraMatematica {
    
    //Metodo principal de la clase    
    public static void main(String[] args) {
        //Uso de la librareria Scanner 
        Scanner sc = new Scanner(System.in);
        
        //Instancia de la clase CalculadoraMatematica
        CalculadoraMatematica CM = new CalculadoraMatematica();
        
        //Variable para manejar el menu
        int opcionMenu = 0;
        
        //Se piden los numeros a operar 
        System.out.println("\t-----CALCULADORA MATEMÁTICA-----\n");
        System.out.print("\tIngresa el numero 1>> ");
        double numero1 = sc.nextDouble();
        System.out.print("\tIngresa el numero 2>> ");
        double numero2 = sc.nextDouble();
            
        CM.numerosIngresados(numero1, numero2);            
            
            
        do { // Uso del para mantener el menu abierto hasta que el usuario lo permita.         

            //Se imprimen opciones
            System.out.print("\n\tMenu de operaciones"
                    + "\n\t1. Suma"
                    + "\n\t2. Resta"
                    + "\n\t3. Multiplicacion"
                    + "\n\t4. Division"
                    + "\n\t0. Salir");
            System.out.print("\n\tSelecciona una opcion>> ");
            opcionMenu = sc.nextInt();
            
        } while (opcionMenu!=0);
    }
    
    //Se crean los atributos num1 y num2 de manera privada
    private double num1;
    private double num2; 
    
    //Constructor por defecto
    public CalculadoraMatematica(){
        this.num1 = 0;
        this.num2 = 0;
    }
    
    //Metodo para pasarle valores a los numero 1 y 2
    public void numerosIngresados(double numero1, double numero2){
        this.num1 = numero1;
        this.num2 = numero2;
    }
    
    //METODOS DE OPERACIONES MATEMATICAS
    //Metodo para suma 
    public double suma(){
        return num1 + num2;
    }
    //Metodo resta
    public double restar(){
    return num1-num2;
    }
    //Metodo para multiplicar
    public double multiplicar(){
    return num1*num2;
    }
    //Metodo para dividir
    public double dividir(){
    if (num2 == 0) {
    System.out.println("Error: No se puede dividir entre cero.");
        return 0;}    
    return num1/num2;
    }
    
    
    
    
    
    
    
    
    
    
}
