/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ymala
 */
public class Estudiante {
    private String nombre;
    private String matricula;
    private String carrera;
    private int practicas;
    private int parciales;
    private int asignaciones;
    private int examenFinal;

    public Estudiante(String nombre, String matricula, String carrera,
                      int practicas, int parciales, int asignaciones, int examenFinal) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.practicas = practicas;
        this.parciales = parciales;
        this.asignaciones = asignaciones;
        this.examenFinal = examenFinal;
    }

    public int calcularNotaFinal() {
        return practicas + parciales + asignaciones + examenFinal;
    }

    public boolean estaAprobado() {
        return calcularNotaFinal() >= 60;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getMatricula() { return matricula; }
    public String getCarrera() { return carrera; }
    public int getPracticas() { return practicas; }
    public int getParciales() { return parciales; }
    public int getAsignaciones() { return asignaciones; }
    public int getExamenFinal() { return examenFinal; }
}
