
/**
 * Clase que representa un modelo específico de automóvil: Honda Civic.
 * 
 * Esta clase demuestra el concepto de HERENCIA en Programación Orientada a Objetos,
 * ya que extiende (hereda) de la clase AutoMovil. Además, muestra el polimorfismo
 * mediante la SOBRESCRITURA de métodos (Override) para proporcionar comportamientos
 * específicos del modelo Honda Civic.
 * 
 * @author Ymalai Dorangel Leonardo Ramon
 * @since 2026
 */
public class HondaCivic extends AutoMovil {
     /**
     * Constructor de la clase HondaCivic.
     * 
     * Este constructor demuestra el uso de la palabra clave 'super' para llamar al constructor de la clase padre (AutoMovil) antes de ejecutar su propio código. Esto asegura que la parte del automóvil genéricose inicialice correctamente antes de agregar las características específicas del Honda Civic.
     * 
     * La secuencia de ejecución será:
     * 1. Constructor de AutoMovil (clase padre)
     * 2. Constructor de HondaCivic (clase hija)
     */
    public HondaCivic(){
        super(); // Llama al constructor de la clase padre AutoMovil
        System.out.println("Constructor de HondaCivic");
    }

    /**
     * Sobrescribe el método apagar() de la clase AutoMovil.
     * 
     * Proporciona un comportamiento específico para el Honda Civic cuando se apaga el vehículo.
     * 
     * @see AutoMovil#apagar()
     */
    @Override
    public void apagar() {
        System.out.println("El Honda de esta apagando lentamente...");
    }

     /**
     * Sobrescribe el método encender() de la clase AutoMovil.
     * 
     * Proporciona un comportamiento específico para el Honda Civic cuando se intenta encender el vehículo, simulando un problema característico de este modelo.
     * 
     * @see AutoMovil#encender()
     */
    @Override
    public void encender() {
        System.out.println("El honda tiene problema para encender...");
    }

    /**
     * Sobrescribe el método frenar() de la clase AutoMovil.
     * 
     * Proporciona un comportamiento específico para el Honda Civic cuando se aplican los frenos, simulando una frenada brusca.
     * 
     * @see AutoMovil#frenar()
     */
    @Override
    public void frenar() {
        System.out.println("El honda frena bruscamente...");
    }

     /**
     * Sobrescribe el método acelerar() de la clase AutoMovil.
     * 
     * Proporciona un comportamiento específico para el Honda Civic cuando se acelera el vehículo, simulando una aceleración moderada.
     * 
     * @see AutoMovil#acelerar()
     */
    @Override
    public void acelerar() {
        System.out.println("El honda acelera moderadamente...");
    }
}
