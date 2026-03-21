package registroacademico;
//@author Arturo
public class Estudiante {
    private String nombre;
    private String matricula;
    private String carrera;

    private double practicas;
    private double parciales;
    private double asignaciones;
    private double examenFinal;

    public Estudiante(String nombre, String matricula, String carrera,
                      double practicas, double parciales,
                      double asignaciones, double examenFinal) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.practicas = practicas;
        this.parciales = parciales;
        this.asignaciones = asignaciones;
        this.examenFinal = examenFinal;
    }

    public double calcularNotaFinal() {
        return practicas + parciales + asignaciones + examenFinal;
    }

    public String obtenerResultado() {
        if (calcularNotaFinal() >= 60) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}