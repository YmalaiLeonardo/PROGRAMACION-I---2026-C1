//@author Arturo
public class Tv {

    String marca;
    int pulgadas;
    boolean encendido;
    int volumen;

    public void encender() {
        System.out.println("La TV se esta encendiendo...");
        encendido = true;
    }

    public void apagar() {
        System.out.println("La TV se esta apagando...");
        encendido = false;
    }

    public void subirVolumen() {
        System.out.println("Subiendo el volumen...");
        volumen++;
    }

    public void bajarVolumen() {
        System.out.println("Bajando el volumen...");
        volumen--;
    }
}
