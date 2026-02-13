
package com.mycompany.tarea2.clasesymetodos;

/**
 * @author Kevin
 */
public class Tv {

    // Atributos (Características)
    public String marca;
    public int pulgadas;
    public boolean encendido;
    public int volumen;

    // Métodos (Acciones)
    public void encender() {
        encendido = true;
        System.out.println("La TV se esta encendiendo...");
    }

    public void apagar() {
        encendido = false;
        System.out.println("La TV se esta apagando...");
    }

    public void subirVolumen() {
        volumen++;
        System.out.println("Subiendo el volumen...");
    }

    public void bajarVolumen() {
        volumen--;
        System.out.println("Bajando el volumen...");
    }
   }
