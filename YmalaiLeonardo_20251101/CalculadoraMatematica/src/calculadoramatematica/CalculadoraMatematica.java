/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramatematica;
import java.util.Scanner;

/**
 * Clase principal que representa una Calculadora Matemática.
 * Implementa operaciones matemáticas básicas con dos números.
 * Implementa principios de programación estructurada y orientada a objetos.
 * 
 * @author Ymalai Dorangel Leonardo Ramon
 * @since Febrero 2026
 */
public class CalculadoraMatematica {
    
    /**
    * Método principal que inicia la ejecución del programa.
    * Clase principal que contiene el método main.
    * Implementa un menú interactivo para usar la CalculadoraMatematica.    
    */   
    public static void main(String[] args) {
        //Uso de la librería Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);
        
        //Instancia de la clase CalculadoraMatematica
        CalculadoraMatematica CM = new CalculadoraMatematica();
        
        //Variable para manejar las opciones del menú
        int opcionMenu = 0;
        
        //Solicitar los números al usuario
        System.out.println("\t-----CALCULADORA MATEMÁTICA-----\n");
        System.out.print("\tIngresa el numero 1>> ");
        double numero1 = sc.nextDouble();
        System.out.print("\tIngresa el numero 2>> ");
        double numero2 = sc.nextDouble();
            
        CM.establecerNumeros(numero1, numero2);            
            
        //Bucle do-while para mantener el menú activo    
        do {        
            //Muestra el menú de opciones en la consola.
            System.out.print("\n\tMenu de operaciones"
                    + "\n\t1. Suma"
                    + "\n\t2. Resta"
                    + "\n\t3. Multiplicacion"
                    + "\n\t4. Division"
                    + "\n\t0. Salir");
            System.out.print("\n\tSelecciona una opcion>> ");
            opcionMenu = sc.nextInt();
            
            
            //Switch para manejar las opciones del menú de forma ordenada
            
            switch (opcionMenu) {
                case 1: 
                    System.out.println("\n\tResultado de la suma: " + CM.sumar());
                    break;
                case 2:
                    System.out.println("\n\tResultado de la resta: " + CM.restar());
                    break;
                case 3:
                    System.out.println("\n\tResultado de la multiplicacion: " + CM.multiplicar());
                    break;
                case 4:
                    System.out.println("\n\tResultado de la division: " + CM.dividir());
                    break;
                case 0:
                    System.out.println("\n\tSaliendo...");
                    break;
                default:
                    System.out.println("\n\tIngrese una opcion correcta");
                    break;
            }
            
        } while (opcionMenu!=0); //Final del do while, verifica condicional
        sc.close(); //Cerrar el scanner optimiza memoria
    }
    
    //Se crean los atributos num1 y num2 de manera privada
    private double num1;
    private double num2; 
    
    /**
     * Constructor por defecto de la clase.
     * Inicializa ambos números en 0.0.
     */
    public CalculadoraMatematica(){
        this.num1 = 0;
        this.num2 = 0;
    }   
    
    /**
     * Metodo que establece los dos números para las operaciones.
     * 
     * @param num1 Primer número
     * @param num2 Segundo número
     */
    public void establecerNumeros(double numero1, double numero2){
        this.num1 = numero1;
        this.num2 = numero2;
    }
    
    //METODOS DE OPERACIONES MATEMATICAS    
    /**
     * Realiza la operación de suma entre los dos números almacenados.
     * 
     * @return Resultado de la suma: num1 + num2
     */
    public double sumar(){
        return num1 + num2;
    }
    /**
     * Realiza la operación de resta entre los dos números almacenados.
     * 
     * @return Resultado de la resta: num1 - num2
     */
    public double restar(){
    return num1-num2;
    }
    /**
     * Realiza la operación de multiplicación entre los dos números almacenados.
     * 
     * @return Resultado de la multiplicación: num1 * num2
     */
    public double multiplicar(){
    return num1*num2;
    }
    /**
     * Realiza la operación de división entre los dos números almacenados.
     * Realiza validación para evitar división por cero.
     * 
     * @return Resultado de la división: num1 / num2, o 0 si hay división por cero   
     */
    public double dividir(){
    if (num2 == 0) {
    System.out.print("\n\tError: No se puede dividir entre cero.");
        return 0;}     
    return num1/num2;
    }
  
}
