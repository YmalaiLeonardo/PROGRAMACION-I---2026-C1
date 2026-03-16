
package com.mycompany.tarea3herenciayencapsulacion;

/**
 * @author kevin
 */
public class Tarea3HerenciayEncapsulacion {

    public static void main(String[] args) {
        
        // --- aqui se crea la instancia de la clase carro ---
        AutoMovil auto = new AutoMovil();
        
        // Usando los setters para dar valores a los atributos
        auto.setMarca("Toyota");
        auto.setModelo("Corolla");
        auto.setAño(2023);
        auto.setColor("Blanco");

        // Probando los metodos
        System.out.println("Marca: " + auto.getMarca());
        auto.encender();
        auto.acelerar();

        System.out.println("--- Honda Civic ---");
        
        // --- Crear instancia de hondaCivic ---
        HondaCivic honda = new HondaCivic();
        
        // usando los setters heredados para dar valores que se presentaron
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setAño(2024);
        honda.setColor("Rojo");

        // probando los metodos (incluyendo los sobrescritos)
        System.out.println("Marca: " + honda.getMarca());
        honda.encender(); // Ejecuta el metodo sobrescrito en HondaCivic
        honda.acelerar(); // Ejecuta el metodo sobrescrito en HondaCivic
    }
}
