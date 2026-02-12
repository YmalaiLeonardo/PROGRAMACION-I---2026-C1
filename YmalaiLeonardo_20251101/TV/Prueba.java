
/**
 * Clase Prueba para instanciar y usar objetos Tv
 * @author Ymalai Dorangel Leonardo Ramon
 * @since Febrero 2026
 */
public class Prueba {
    public static void main(String[] args) {
        
        //Instancia de TV
        TV tv1 = new TV();
        TV tv2 = new TV();
        TV tv3 = new TV();
        
        //Asignar valores a cada atributo, mostrarlos e invocar metodos
        //TV 1
        System.out.println("\n\t---TV1---");
        tv1.marca = "\tSamsung";
        tv1.pulgadas = 55;
        tv1.volumen = 20;
        tv1.encendido = false;
        
        System.out.print("\n\tMarca: " + tv1.marca);
        System.out.print("\n\tPulgadas: " + tv1.pulgadas);
        System.out.print("\n\tVolumen: " + tv1.volumen);
        
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();
                
        //TV 2
        System.out.println("\n\t---TV2---");
        tv2.marca = "\tLG";
        tv2.pulgadas = 43;
        tv2.volumen = 15;
        tv2.encendido = false;
        
        System.out.print("\n\tMarca: " + tv2.marca);
        System.out.print("\n\tPulgadas: " + tv2.pulgadas);
        System.out.print("\n\tVolumen: " + tv2.volumen);
        
        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();
               
        // TV 3
        System.out.println("\n\t---TV3---");
        tv3.marca = "\tSony";
        tv3.pulgadas = 65;
        tv3.volumen = 30;
        tv3.encendido = false;
        
        System.out.print("\n\tMarca: " + tv3.marca);
        System.out.print("\n\tPulgadas: " + tv3.pulgadas);
        System.out.print("\n\tVolumen: " + tv3.volumen);
        
        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
       
    }
}
