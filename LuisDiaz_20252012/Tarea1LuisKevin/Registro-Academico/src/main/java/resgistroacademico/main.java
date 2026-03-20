
package resgistroacademico;

/**
 * @author kevin
 */
public class main {

    public static void main(String[] args) {
        // Iniciar la primera ventana
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrodeEstudiantesGUI1().setVisible(true);
        });
    }
}
