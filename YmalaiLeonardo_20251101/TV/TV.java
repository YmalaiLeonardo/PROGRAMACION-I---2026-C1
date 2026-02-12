
// Clase Tv que representa un televisor
public class TV {
    
    //Atributos
    public String marca;
    public int pulgadas; 
    public boolean encendido;
    public int volumen;
        
    //Metodos
    public void encender(){
        System.out.println("\n\tLa TV se está encendiendo...");
        this.encendido = true;
    }
    public void apagar(){
        System.out.println("\tLa TV se está apagando...");
        this.encendido = false;        
    }
    public void subirVolumen() {
        System.out.println("\tSubiendo el volumen...");
        this.volumen++;
    }
    public void bajarVolumen(){
        System.out.println("\tBajando el volumen...");
        this.volumen--;
    }   
    
}
