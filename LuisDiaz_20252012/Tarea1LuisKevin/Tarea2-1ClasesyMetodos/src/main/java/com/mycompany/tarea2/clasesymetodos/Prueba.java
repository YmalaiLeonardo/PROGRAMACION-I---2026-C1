package com.mycompany.tarea2.clasesymetodos;

/**
 *
 * @author Kevin
 */
public class Prueba {
    public static void main(String[] args) {
        // --- TV 1 ---
        Tv tv1 = new Tv();
        tv1.marca = "Samsung";
        tv1.pulgadas = 55;
        tv1.volumen = 20;

        System.out.println("=== TV 1 ===");
        System.out.println("Marca: " + tv1.marca);
        System.out.println("Pulgadas: " + tv1.pulgadas);
        System.out.println("Volumen: " + tv1.volumen);
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();

        System.out.println(); // Espacio en blanco

        // --- TV 2 ---
        Tv tv2 = new Tv();
        tv2.marca = "LG";
        tv2.pulgadas = 43;
        tv2.volumen = 15;

        System.out.println("=== TV 2 ===");
        System.out.println("Marca: " + tv2.marca);
        System.out.println("Pulgadas: " + tv2.pulgadas);
        System.out.println("Volumen: " + tv2.volumen);
        tv2.encender();
        
        System.out.println();

        // --- TV 3 ---
        Tv tv3 = new Tv();
        tv3.marca = "Sony";
        tv3.pulgadas = 65;
        tv3.volumen = 10;

        System.out.println("=== TV 3 ===");
        System.out.println("Marca: " + tv3.marca);
        System.out.println("Pulgadas: " + tv3.pulgadas);
        System.out.println("Volumen: " + tv3.volumen);
        tv3.encender();
        tv3.subirVolumen();
    }
}

