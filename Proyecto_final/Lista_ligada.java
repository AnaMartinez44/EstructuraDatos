package Proyecto_final;

import java.util.LinkedList;

/**
 *
 * @author Ana
 */
public class Lista_ligada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LinkedList colores=new LinkedList();
      colores.add("azul"); // add es un método para añadir elementos a la lista
      colores.add("amarillo");  
      colores.add("blanco"); 
      colores.add("violeta"); 
      colores.add("rosa"); 
      colores.add("naranja"); 
      colores.add("rojo");
      
      System.out.println(colores.removeFirst()); //Método para eliminar el primero de la lista  
      System.out.println(colores.removeLast()); //Método para eliminar el último de la lista
      System.out.println(colores.getLast()); //Método para obtener el último de la lista
      System.out.println(colores.peek()); //Método que devuelve el primer elemento de la lista sin removerlo 
      System.out.println(colores.indexOf("violeta")); //Método que devuelve el indice del elemento indicado 
      System.out.println(colores.remove(3));  // Método para eliminar un elemento según el indice indicado
      System.out.println(colores.size()); //Método para saber el tamaño 
      colores.clear(); //Método para limpiar 
      System.out.println(colores.toString());
        System.out.println(colores.isEmpty()); //Método para saber si esta vacio 
    }   
}
