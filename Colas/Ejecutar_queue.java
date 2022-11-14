package Colas;

/**
 *
 * @author Ana
 */
public class Ejecutar_queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Queue<Integer> cola = new Queue<Integer>();

        cola.enqueue(0);
        cola.enqueue(6);
        cola.enqueue(7);
        cola.enqueue(8);
        System.out.println(cola);
        
        
        cola.dequeue();
        System.out.println(cola);

    }

}
