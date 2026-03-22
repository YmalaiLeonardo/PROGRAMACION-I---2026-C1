
/**
 *
 * @author YMALAI DORANGEL LEONARDO RAMON
 */
public class ProcesarDatos {

    private String matricula;
    private String nombres;
    private String apellidos;
    private String cuatrimestre;

    public void capturarDatos(String matricula, String nombres, 
                               String apellidos, String cuatrimestre) {
        this.matricula = matricula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cuatrimestre = cuatrimestre;
    }

    public String presentarDatos() {
        return "Matrícula: " + matricula +
               "\nNombres: " + nombres +
               "\nApellidos: " + apellidos +
               "\nCuatrimestre: " + cuatrimestre;
    }
}

