
/**
* Metodo principal. Lanza la interfaz grafica.
* @param args argumentos de linea de comandos
* @author Ymalai Dorangel Leonardo Ramon
*/
public class Main {
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraExtendida().setVisible(true);
            }
        });
    }
}

