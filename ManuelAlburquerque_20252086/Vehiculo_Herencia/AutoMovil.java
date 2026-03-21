package automovil;
//@author Arturo
public class AutoMovil {

    private String marca;
    private String modelo;
    private int año;
    private String color;

    public AutoMovil() {
        System.out.println("Constructor de AutoMovil");
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

    public int getAnio() {
        return año;
    }

    public void setAnio(int anio) {
        this.año = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void encender() {
        System.out.println("El automovil esta encendiendo...");
    }

    public void apagar() {
        System.out.println("El automovil esta apagado...");
    }

    public void acelerar() {
        System.out.println("El automovil esta acelerando...");
    }

    public void frenar() {
        System.out.println("El automovil esta frenando...");
    }
}