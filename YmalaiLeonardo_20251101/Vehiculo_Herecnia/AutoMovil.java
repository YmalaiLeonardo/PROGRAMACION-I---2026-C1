/**
 * Clase que representa un Automóvil con sus características básicas
 * y comportamientos fundamentales.
 * 
 * Esta clase modela un vehículo automotor con atributos como marca,
 * modelo, año y color, proporcionando métodos para acceder y modificar
 * estos datos, así como operaciones básicas como encender, apagar,
 * acelerar y frenar.
 * 
 * @author Ymalai Dorangel Leonardo Ramon
 * @since 2026
 */
public class AutoMovil {
    private String marca; /** Marca del automóvil (ej: Toyota, Honda, Ford) */
    private String modelo; /** Modelo específico del automóvil (ej: Corolla, Civic, Focus) */
    private int year; /** Año de fabricación del automóvil */
    private String color; /** Color del automóvil */

    /**
     * Constructor por defecto de la clase AutoMovil.
     * Inicializa un nuevo objeto AutoMovil y muestra un mensaje
     * indicando que se ha creado la instancia.
     */
    public AutoMovil() {
        System.out.println("Constructor de AutoMóvil");
    }
    
    // ===== GETTERS =====
    // Métodos para obtener los valores de los atributos privados
    
    /**
     * Obtiene la marca del automóvil.
     * 
     * @return La marca actual del automóvil
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el modelo del automóvil.
     * 
     * @return El modelo actual del automóvil
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene el año de fabricación del automóvil.
     * 
     * @return El año actual del automóvil
     */
    public int getYear() {
        return year;
    }

    /**
     * Obtiene el color del automóvil.
     * 
     * @return El color actual del automóvil
     */
    public String getColor() {
        return color;
    }
    
    // ===== SETTERS =====
    // Métodos para modificar los valores de los atributos privados
    
    /**
     * Establece la marca del automóvil.
     * 
     * @param marca La nueva marca a asignar
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Establece el modelo del automóvil.
     * 
     * @param modelo El nuevo modelo a asignar
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Establece el año de fabricación del automóvil.
     * 
     * @param year El nuevo año a asignar
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Establece el color del automóvil.
     * 
     * @param color El nuevo color a asignar
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    // ===== MÉTODOS DE COMPORTAMIENTO =====
    // Métodos que simulan las acciones que puede realizar un automóvil
    
    /**
     * Simula la acción de encender el automóvil.
     * Muestra un mensaje en consola indicando que el automóvil
     * está en proceso de encendido.
     */
    public void encender(){
        System.out.println("El automóvil está encendiendo...");
    }
    
    /**
     * Simula la acción de apagar el automóvil.
     * Muestra un mensaje en consola indicando que el automóvil
     * está en proceso de apagado.
     */
    public void apagar(){
        System.out.println("El automóvil esta apagando...");
    }
    
     /**
     * Simula la acción de acelerar el automóvil.
     * Muestra un mensaje en consola indicando que el automóvil
     * está aumentando su velocidad.
     */
    public void acelerar(){
        System.out.println("El automóvil esta acelerando...");
    }
    
    /**
     * Simula la acción de frenar el automóvil.
     * Muestra un mensaje en consola indicando que el automóvil
     * está disminuyendo su velocidad.
     */
    public void frenar(){
        System.out.println("El automóvil esta frenando...");
    }    
}
