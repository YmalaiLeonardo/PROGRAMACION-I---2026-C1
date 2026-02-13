
/**
 *
 * @author Ymalai Dorangel Leonardo Ramon
 * @since 2026
 */
public class Calculadora_SobrecargaMetodos {
    
    public static void main(String[] args) {
        //Instanciamiento de la clase 
        Calculadora_SobrecargaMetodos cal = new Calculadora_SobrecargaMetodos();
        
        //Prueba con dos parametros 
        System.out.println("\tPRUEBA DOS PARAMETROS");
        System.out.println("\tSuma (2 parametros): " + cal.sumar(5,3));
        System.out.println("\tResta (2 parametros): " + cal.restar(10,4));
        System.out.println("\tMultipicacion (2 parametros): " + cal.multiplicar(6,7));
        System.out.println("\tDivision (2 parametros): " + cal.dividir(20,4));
        
        //Prueba con 3 parametros 
        System.out.println("\n\tPRUEBA TRES PARAMETROS");
        System.out.println("\tSuma (3 parametros): " + cal.sumar(5,3,8));
        System.out.println("\tResta (3 parametros): " + cal.restar(10,4,9));
        System.out.println("\tMultipicacion (3 parametros): " + cal.multiplicar(6,7,2));
        
        //Prueba con 4 parametros
        System.out.println("\n\tPRUEBA CUATRO PARAMETROS");
        System.out.println("\tSuma (4 parametros): " + cal.sumar(5,3,5, 7));
        System.out.println("\tResta (4 parametros): " + cal.restar(10,4,56,8));
        System.out.println("\tMultipicacion (4 parametros): " + cal.multiplicar(6,7,8,2));

        

    }
    
    //Resive dos parametros 
    public int sumar(int num1, int num2){
        return num1 + num2;
    }
    public int restar(int num1, int num2){
        return num1 - num2;
    }
    public int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    public int dividir(int num1, int num2){
        if (num2 == 0) {
            System.out.print("\n\tError: No se puede dividir entre cero.");
        return 0;}
        return num1 / num2;
    }
    
    //Recibe 3 parametros 
    public int sumar(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public int restar(int num1, int num2, int num3){
        return num1 - num2 - num3;
    }
    public int multiplicar(int num1, int num2, int num3){
        return num1 * num2 * num3;
    }
    
    //Recibe 4 parametros 
    public int sumar(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }
    public int restar(int num1, int num2, int num3, int num4){
        return num1 - num2 - num3 - num4;
    }
    public int multiplicar(int num1, int num2, int num3, int num4){
        return num1 * num2 * num3 * num4;
    }
    
}
