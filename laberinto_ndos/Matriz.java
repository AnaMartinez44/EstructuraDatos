package laberinto_ndos;
/**
 *
 * @author Ana
 */
public class Matriz<T> {

    private int numcolumnas;
    private Array filas;

    public Matriz(int numcolumnas, Array filas) {

        this.numcolumnas = numcolumnas;
        this.filas = filas;
        for (int i = 0; i < filas.getLongitud(); i++) {
            filas.setElemento(i, new Array<T>(numcolumnas));
        }
    }

    Matriz() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumcolumnas() {
        return numcolumnas;
    }

    public T dato(int fil, int columnas) {
        Array aux = (Array) filas.getElemento(fil);
        return (T) aux.getElemento(columnas);
    }

    public void clear(T dato) {
        for (int i = 0; i < filas.getLongitud(); i++) {
            Array aux = (Array) filas.getElemento(i);
            aux.limpiar(dato);
            filas.setElemento(i, aux);
        }
    }

    public int get_fila_tamaño() {
        return filas.getLongitud();
    }

    public int get_columna_tamaño() {

        Array aux = (Array) filas.getElemento(1);
        return aux.getLongitud();

    }

    public T get_item(int fil, int col) {
        Array aux = (Array) filas.getElemento(fil);
        return (T) aux.getElemento(col);
    }

    public void set_item(int fil, int col, T dato) {
        Array aux= (Array) filas.getElemento(fil);
        aux.setElemento(col, dato);
       filas.setElemento(fil, aux);
    }

    @Override
    public String toString() {
        return "Array2d{" + "numcolumnas=" + numcolumnas + ", filas=" + filas + '}';
    }
}