//Libreria para listas
import java.util.ArrayList;

//Clase ConsultaVeterinaria
public class ConsultaVeterinaria {

    //Clase main
    public static void main(String[] args) {
        //Creamos un objeto de lista
        ArrayList<Mascota> mascota = new ArrayList<>();
        //Mandamos a llamar a las clases hijas
        mascota.add(new Perro());
        mascota.add(new Gato());
        mascota.add(new Conejo());
        mascota.add(new Tortuga());
        
        //Recorremos la lista y los metodos
        for (Mascota m : mascota){
            m.hacerSonido();
            m.descansar();
            
            //condicionamos el metodo de la interface AtencionEspecial, imprimirlo si es verdadero
            if(m instanceof AtencionEspecial){
                ((AtencionEspecial) m).recibirAtencionEspecial();
            } 
            
            //condicionamos la el metodo de la interface Vacunable, imprimirlo si es verdadero
            if (m instanceof Vacunable){
                ((Vacunable) m).vacunar();
            }
        }
    }
    
}
