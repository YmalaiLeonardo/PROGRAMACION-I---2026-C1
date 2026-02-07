/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author Starlyn Eduardo Escalante
 */
public class Sumatoria {
    public static void main(String[] args) {
        int c = 1;
        int total = 0;

        do {
            total = total + c;
            c++;
        } while(c <= 50);

        System.out.println("La suma total es: " + total);
    }
}