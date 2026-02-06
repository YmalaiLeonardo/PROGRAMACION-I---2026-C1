/*@author Arturo*/
import java.util.Scanner;
public class TabladeMultiplicar {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        
        for(int i = 1; i <= 10; i++){
            int resultado = num * i;
            
            System.out.println(num + " x " + i + " = " + resultado);
        }
        
    }
    
}
