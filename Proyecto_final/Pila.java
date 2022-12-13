package Proyecto_final;
import java.util.Stack;
/**
 *
 * @author Ana
 */
public class Pila {
    public static void main(String[] args) {
    Stack fruta= new Stack ();
    fruta.push("manzana");
    fruta.push("pera");
    fruta.push("fresa");
    fruta.push("naranja");
    fruta.push("melón"); //push agrega un elemento al tope de la estructura
    System.out.println(fruta);
    System.out.println(fruta.pop());  //Saca el elemento del tope y lo regresa. El puntero al tope se mueve al anterior elemento
    System.out.println(fruta.peek()); //Consulta el elemento en el tope, sin sacarlo.
    System.out.println(fruta.size()); // Método para saber el tamaño 
    System.out.println(fruta.isEmpty());//Método para saber si esta vacio 
        
      
    }
    
}


