/*@author Arturo*/
import java.util.Scanner;
public class DeterminarsiunNúmeroesParoImpar {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
    }
    
}
