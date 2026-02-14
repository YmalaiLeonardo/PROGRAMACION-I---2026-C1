//@author Arturo
public class Prueba {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("Suma 2: " + calc.sumar(4, 6));
        System.out.println("Suma 3: " + calc.sumar(4, 6, 2));
        System.out.println("Suma 4: " + calc.sumar(4, 6, 2, 1));

        System.out.println("Resta 2: " + calc.restar(10, 3));
        System.out.println("Multiplicacion 3: " + calc.multiplicar(2, 3, 4));

        System.out.println("Division: " + calc.dividir(20, 5));
    }
}
