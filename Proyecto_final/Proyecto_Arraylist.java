
package Proyecto_final;

import java.util.ArrayList; //importando la clase array list

/**
 *
 * @author Ana
 */
public class Proyecto_Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList personas=new ArrayList();
       personas.add("Jolyne"); 
       personas.add("Hermes"); 
       personas.add("Dio"); 
       personas.add("Lisa"); 
       personas.add("Clemecio"); 
       personas.add("Alexa"); //Método add para añadir personas a la lista
       System.out.println(personas);
       
       System.out.println(personas.remove(2)); //Método remove para remover una persona en el indice señalado
       
       System.out.println(personas.indexOf("Jolyne")); //Método indexOf para saber la posicion de un elemento
       
       int cantidad=personas.size(); //Método size, devuelve el número de elementos
        System.out.println(cantidad);
        
        System.out.println(personas.get(0)); //Método get para obtener el elemento en el indice señalado 
         
        personas.clear(); //Metodo Clear, elimina todos los elementos
        System.out.println(personas.toString()); 
       
        boolean espacio = personas.isEmpty(); //indicando si esta vacio o no el arrayList
        System.out.println(espacio);
        
        
    }
    
}
