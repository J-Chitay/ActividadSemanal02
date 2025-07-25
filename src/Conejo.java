//Clase Hijo Gato, heredado de clase Padre Mascota e implementado la interface AtencionEspecial y Vacunable
public class Conejo extends Mascota implements AtencionEspecial, Vacunable{
    
    //Sobrescribimos la clase abstracta de la clase Padre Mascota
    @Override
    public void hacerSonido() {
        System.out.println("Sonido de un conejo");
    }

    //Sobrescribimos el metodo de la interface AtencionEspecial
    @Override
    public void recibirAtencionEspecial() {
        System.out.println("Reciviendo atencion especial");
    }

    //Sobrescribimos el metodo de la interface Vacunable
    @Override
    public void vacunar() {
        System.out.println("Vacunar \n");
    }
    
}
