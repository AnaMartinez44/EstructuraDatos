
package ListaDoblementeLigada;

/**
 *
 * @author Ana
 * @param <T>
 */
public class ListaDLigada<T> {
     NodoDoble<T> head;
     int Tamanio;

    public ListaDLigada() {
        this.head = null;
        this.Tamanio = 0;
    }
    
    public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamanio() {
        return Tamanio;
    }
    
     public void agregarAlInicio(T valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } else {
            nuevo.setSiguiente(this.head);
            this.head.setAnterior(nuevo);
            this.head = nuevo;
        }
    }
     
    public void agregarAlFinal(T valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } else {
            NodoDoble aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
        }
    }
    
    public void agregarDespuesDe(T valor, int posicion){
        NodoDoble nuevo = new NodoDoble(valor);
        NodoDoble aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++){
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        nuevo.setAnterior(aux);
        aux.setSiguiente(nuevo);
    }
    
    public void eliminar(int posicion){
        NodoDoble aux1 = this.head;
        NodoDoble aux2 = null;
        for (int contador = 1; contador < posicion - 1; contador++){
            aux1 = aux1.getSiguiente();
        }
        aux2= aux1.getSiguiente().getSiguiente();
        aux1.setSiguiente(aux2);
        aux2.setAnterior(aux1);
    }
    
    public void eliminarElPrimero(){
       NodoDoble aux = this.head;
        if (!this.estaVacia()){
            this.head = aux.getSiguiente();
            this.head.setAnterior(null);
        }
    }
    
    public void eliminarElFinal(){
        if (!this.estaVacia()) {
            NodoDoble aux = this.head;
            while (aux.getSiguiente().getSiguiente() != null){
                aux = aux.getSiguiente();
                
            }
            aux.setSiguiente(null);
        } else {
            head = null;
        }
    }
    
    public int buscar(T valor){
        int j=1;
        NodoDoble aux = this.head;
        while(aux != null && aux.getDato()!= valor ){
            aux = aux.getSiguiente();
            j +=1;
        }
        return j;
    }
    
    public void actualizar(T a_buscar,T dato ){
        NodoDoble aux = this.head;
        if(!this.estaVacia()){
            while(aux != null && aux.getDato()!=a_buscar){
                aux = aux.getSiguiente();
            }
            aux.setDato(dato);
        }
    }
    public void transversal() { //recorrer y veR
          NodoDoble<T> aux = this.head;
          while(aux.getSiguiente()!=null){
            System.out.print(aux);
             aux=aux.getSiguiente();   
        }
        System.out.println("");
    }   
}
