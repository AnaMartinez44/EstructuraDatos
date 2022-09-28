
package ListaDoblementeLigada;

/**
 *
 * @author Ana
 */
public class Principal {
    public static void main(String[] args) {
    ListaDLigada<Integer> lista = new ListaDLigada<>();
    
        lista.agregarAlFinal(58);
        lista.agregarAlFinal(59);
        lista.agregarAlFinal(60);
        lista.agregarAlFinal(61);
        lista.agregarAlFinal(62);
        lista.agregarAlFinal(63);
        lista.transversal();
        lista.agregarAlInicio(50);
        lista.transversal();
        lista.agregarDespuesDe(51,1);
        lista.transversal();
        lista.eliminar(2); //se elimino 51
        lista.transversal();
        lista.eliminarElPrimero();
        lista.transversal();
        lista.eliminarElFinal();
        lista.transversal();
        System.out.println(lista.buscar(60));
        lista.actualizar(59, 2);
        lista.transversal();  
    }
    

}
    
    

