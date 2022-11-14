package Colas.Colas_Acotadas;

/**
 *
 * @author Ana
 */
public class EjecutarColasAcotadas {

    public static void main(String[] args) {
     ColasAcotadas Pasajeros = new ColasAcotadas(7);
     
        Pasajeros.enqueue(4, "Maestre");
        Pasajeros.enqueue(2, "niños");
        Pasajeros.enqueue(3, "mujeres");
        Pasajeros.enqueue(3, "hombres");
        Pasajeros.enqueue(4, "vigia");
        Pasajeros.enqueue(4, "timonel");
        Pasajeros.enqueue(5, "capitan");
        Pasajeros.enqueue(4, "mecanmico");
        Pasajeros.enqueue(1, "niñas");
        Pasajeros.enqueue(3, "ancianos");
        
        
        System.out.println("estan saliendo:");
        System.out.println(Pasajeros);
        System.out.println(Pasajeros.dequeue());
     
   
    
    }
    
}
