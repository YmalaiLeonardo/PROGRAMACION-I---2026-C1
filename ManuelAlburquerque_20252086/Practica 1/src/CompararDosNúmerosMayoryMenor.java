/*@author Arturo*/
import java.util.Scanner;
public class CompararDosNúmerosMayoryMenor {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Introduzca el primer numero: ");
        num1 = sc.nextInt();
        
        System.out.println("Introduzca el segundo numero: ");
        num2 = sc.nextInt();
        
        if(num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        }
        else{
            System.out.println(num1 + " es menor que " + num2);
        }
    }
}
