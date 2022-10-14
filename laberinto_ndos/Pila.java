package laberinto_ndos;
/**
 *
 * @author Ana
 */
import java.util.ArrayList;

public class Pila<T> {

    //atributos
    private ArrayList<T> datos;
    private int limitador;

    //comstructores
    public Pila(int limitador) {
        this.datos = new ArrayList<>();
        this.limitador = limitador;
    }

    public Pila() {
        this.datos = new ArrayList<>();
     
    }

    public boolean EstaVacia() {
        return !this.datos.isEmpty();
    }

    public int length() {
        return this.datos.size();
    }

    public T pop() {
        if (!EstaVacia()) {
            System.out.println("Esta vacia");
            return null;
        } else {
            T aux = datos.get(datos.size()-1);
            datos.remove(datos.size()-1);
            return aux;
        }
    }

    public T peek(  ) {
        if (!EstaVacia()) {
            System.out.println("Esta vacia");
            return null;
        } else {
            return datos.get(datos.size()-1);
        }
    }

    public void push(T valor) {
       if(limitador==0){
           datos.add(valor);
           
       }else{
         
           if(limitador>datos.size()){
              datos.add(valor);
           }else{
               System.out.println("Solo puedes agregar"+limitador+"datos");
           }
       }

    }
//no olvidar método tostring
    @Override
    public String toString() {  
        int i = 0;
        for (T dato : datos) {
            i++;
            System.out.println(datos.get((datos.size()) - i));
        }
        return "";
    }

}