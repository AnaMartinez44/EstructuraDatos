
package Colas;

import java.util.ArrayList;

/**
 *
 * @author Ana
 * @param <T>
 */
public class Queue<T> {
    //atributos 
    private ArrayList<T> elementos; 
    //private int longitud; 
    
    //constructor 

    public Queue() {
        this.elementos = new ArrayList<>() ;
        //this.longitud = longitud;
    }
    
    //métodos 
    //public Queue() {
        //this.elementos = new ArrayList<>();
     
    //}
    
    public boolean EstaVacia() {
        return !this.elementos.isEmpty(); // devolver false estavacia si diferente de vacia 
    }

    public int length() {
        return this.elementos.size()-1; //checar
    }
    
    public void enqueue(T elem) {
          elementos.add(elem);
                 // add(elem);
  }  
  //  }
    
    public T dequeue (){
       if (!EstaVacia()) {
           return (T) "Esta vacia";
         } else {
            T aux = elementos.get(0);
            elementos.remove(0);
            return aux;
            
        //(elementos.size());s
          //  return aux;
        }
        
  } 

    
    //método tostring 
      @Override
    public String toString() {  
        
        for (int i=0; i<elementos.size(); i++) {
            
            System.out.println(elementos.get(i));
                    //elementos.get((elementos.size())));
        }
        return "";
    }
    }
    
    
    

