package calculadoraextendida;
//@author Arturo
public class RaizCuadrada_Exponente {

    /**
     * Calcula la raíz cuadrada de un número.
     * @param numero valor del cual se calcula la raíz cuadrada
     * @return raíz cuadrada del número
     * @throws IllegalArgumentException si el número es negativo
     */
    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);       
        
    }

    /**
     * Calcula la potencia (base elevada al exponente).
     * @param base    número base
     * @param exponente potencia a la que se eleva la base
     * @return resultado de base^exponente
     */
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}