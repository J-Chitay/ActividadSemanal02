//Clase Hijo Gato, heredado de clase Padre Mascota
public class Gato extends Mascota implements AtencionEspecial{

    //Sobrescribimos el metodo de la clase abstracta de la clase Padre Mascota
    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau");
    }

    //sobrescribimos el metodo de la interface AtencionEspecial
    @Override
    public void recibirAtencionEspecial() {
        System.out.println("Reciviendo atencion especial \n");
    }
    
}
