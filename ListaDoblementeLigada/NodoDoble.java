
package ListaDoblementeLigada;

/**
 *
 * @author Ana
 * @param <T>
 */
public class NodoDoble <T> {
    private T dato;
    private NodoDoble <T>  anterior;
    private NodoDoble <T>  siguiente;
   
    //constructores
    public NodoDoble (){
    }
    
    public NodoDoble (T valor) {
        this.dato = valor;
    }

    public NodoDoble (T dato,NodoDoble <T>  anterior, NodoDoble <T>  siguiente) {
        this.dato = dato;
         this.anterior = anterior;
        this.siguiente = siguiente;
       
    }
    
    //getters y setters
     public T getDato() {
        return dato;
    }
      public void setDato(T dato) {
        this.dato = dato;
    }

     public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }
    public NodoDoble <T>  getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NodoDoble <T>  siguiente) {
        this.siguiente = siguiente;
    }
    
    //método tostring
    @Override
    public String toString() {
        return "{"  + dato + "}<-->";
    }
    
    
}

