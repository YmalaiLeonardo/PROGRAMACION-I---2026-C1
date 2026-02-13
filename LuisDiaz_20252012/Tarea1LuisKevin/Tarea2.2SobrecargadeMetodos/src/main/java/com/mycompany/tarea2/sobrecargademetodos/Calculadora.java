
package com.mycompany.tarea2.sobrecargademetodos;

/**
 * @author Kevin
 */
public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    // --- SOBRECARGA CON 3 PARÁMETROS ---
    // Nota cómo el nombre es el mismo, pero cambia la cantidad de variables
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    // --- SOBRECARGA CON 4 PARÁMETROS ---
    public int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int restar(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public int multiplicar(int a, int b, int c, int d) {
        return a * b * c * d;
    }
}
