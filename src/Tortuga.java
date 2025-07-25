//Clase Hijo Perro, heredado de clase Padre Mascota, y la interface Vacunable
public class Tortuga extends Mascota implements Vacunable{

    //Sobrescribimos el metodo de la clase abstracta de la clase Padre Mascota
    @Override
    public void hacerSonido() {
        System.out.println("Sonido de Tortuga");
    }

    //Sobrescribimos el metodo de la interface Vacunable
    @Override
    public void vacunar() {
        System.out.println("Vacunar \n");
    }
    
}
