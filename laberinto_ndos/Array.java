package laberinto_ndos;
/**
 *
 * @author Ana
 */
import java.util.ArrayList;

public class Array<T> {

    //atributos del array
    int tamanio;
    ArrayList<T> datos;

    public Array(int tam) {
        this.tamanio = tam;
        datos = new ArrayList(this.tamanio);
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.add(null);
        }
    }

    public T getElemento(int indice) {
        if (comprobacion(indice)) {
            return this.datos.get(indice);
        } else {
            System.out.println("esta fuera del rango");
        }
        return null;
    }
    
    public void setElemento(int indice, T dato) {
        if (comprobacion(indice)) {
            this.datos.set(indice, dato);
        } else {
            System.out.println("esta fuera del rango");
        }
    }

     public int getLongitud() {
        return this.tamanio;
    }
    private boolean comprobacion(int indice) {
        return indice >= 0 && indice < this.tamanio;
    }

    public void limpiar(T dato) {
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.set(i, dato);
        }
    }

    public void agregar(T dato) { //recor
        this.datos.add(dato);
    }

    @Override
    public String toString() {
        String estado = "------------- " + this.tamanio + " -------------\n";
        for (T dato : datos) {
            if (dato != null) {
                estado += dato.toString() + "\n";
            }
        }
        return estado;
    }
    
}
