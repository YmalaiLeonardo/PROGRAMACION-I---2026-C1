/*@author Arturo*/
public class Sumatoriadel1al50DOWHILE {
    public static void main(String [] args){
        int i = 1;
        int num = 0;
        
        do{
            num += i;
            i++;
        }
        
        while(i <=50);
        
         System.out.println("La sumatoria de los numeros es: " + num);
    }
   
}
