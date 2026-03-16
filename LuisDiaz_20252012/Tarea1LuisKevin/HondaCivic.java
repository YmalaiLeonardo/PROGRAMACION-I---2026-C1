
package com.mycompany.tarea3herenciayencapsulacion;

/**
 * @author kevin
 */
public class HondaCivic extends AutoMovil {

    // Constructor
    public HondaCivic() {
        super(); // Llama al constructor del padre (AutoMovil)
        System.out.println("Constructor de HondaCivic");
    }
    // Sobrescritura de métodos del padre

    @Override
    public void encender() {
        System.out.println("El Honda Civic esta encendiendo...");
    }

    @Override
    public void acelerar() {
        System.out.println("El Honda Civic acelera rapidamente...");
    }
    
    // Nota del junior: No sobrescribí apagar() ni frenar() porque 
    // las instrucciones solo pedían sobrescribir dos métodos.
}
