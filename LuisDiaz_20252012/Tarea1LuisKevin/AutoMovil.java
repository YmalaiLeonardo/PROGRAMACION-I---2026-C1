
package com.mycompany.tarea3herenciayencapsulacion;

/**
 * @author kevin
 */
public class AutoMovil {
    // atributos encapsulados privado
    private String marca;
    private String modelo;
    private int año;
    private String color;

    //constructor
    public AutoMovil() {
        System.out.println("constructor del carro");
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // --- metodos de accion -

    public void encender() {
        System.out.println("El carro esta encendiendo...");
    }

    public void apagar() {
        System.out.println("El carro se esta apagando...");
    }

    public void acelerar() {
        System.out.println("El carro esta acelerando...");
    }

    public void frenar() {
        System.out.println("El carro esta frenando...");
    }
}