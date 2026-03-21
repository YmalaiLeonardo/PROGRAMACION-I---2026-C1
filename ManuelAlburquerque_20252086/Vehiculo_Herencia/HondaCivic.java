package automovil;
//@author Arturo
public class HondaCivic extends AutoMovil {

    public HondaCivic() {
        super();
        System.out.println("Constructor de HondaCivic");
    }

    @Override
    public void encender() {
        System.out.println("El Honda Civic esta encendiendo con arranque deportivo...");
    }

    @Override
    public void acelerar() {
        System.out.println("El Honda Civic acelera rapidamente...");
    }
}