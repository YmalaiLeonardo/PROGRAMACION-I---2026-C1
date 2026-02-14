//@author Artur
public class Prueba {

    public static void main(String[] args) {

        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();

        // TV 1
        tv1.marca = "Samsung";
        tv1.pulgadas = 55;
        tv1.volumen = 20;

        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();

        System.out.println("-------------");

        // TV 2
        tv2.marca = "LG";
        tv2.pulgadas = 65;
        tv2.volumen = 15;

        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();

        System.out.println("-------------");

        // TV 3
        tv3.marca = "Sony";
        tv3.pulgadas = 50;
        tv3.volumen = 10;

        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
    }
}
