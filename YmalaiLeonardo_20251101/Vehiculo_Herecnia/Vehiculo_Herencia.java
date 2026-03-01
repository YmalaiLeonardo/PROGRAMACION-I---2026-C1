/**
 * Clase principal que demuestra el concepto de herencia en Java.
 * Crea instancias de diferentes tipos de vehículos y prueba sus métodos.
 * 
 * @author Ymalai Dorangel Leonardo Ramon
 * @since 2026
 */
public class Vehiculo_Herencia {
    /**
     * Método principal que ejecuta el programa.
     * Demuestra la creación y uso de objetos AutoMovil y HondaCivic.
     * 
     */
    public static void main(String[] args) {
        // Creación y configuración de un AutoMovil genérico
        AutoMovil auto = new AutoMovil();
        auto.setMarca("Toyota");
        auto.setModelo("Corolla");
        auto.setYear(2023);
        auto.setColor("Blanco");
        
        System.out.println("Marca: " + auto.getMarca());
        auto.encender();
        auto.acelerar();
              
        System.out.println("\n ----Honda Civic----");
        // Creación y configuración de un HondaCivic específico
        HondaCivic honda = new HondaCivic();
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setYear(2024);
        honda.setColor("Rojo");
        
        System.out.println("Marca: " + honda.getMarca());
        honda.encender(); // Método sobrescrito
        honda.acelerar(); // Método sobrescrito       
    }    
}
