package Tablas_Hash;

import java.util.ArrayList;


public class ArrayADT <T>{
    int tamanio;
    ArrayList<T> datos;

    public ArrayADT(int tam) {
        this.tamanio = tam;
        datos = new ArrayList(this.tamanio+1);
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.add(null);
        }
    }

    public T getElemento(int indice) {
        if (comprobacion(indice)) {
            return this.datos.get(indice);
        } else {
        }
        return null;
    }

    private boolean comprobacion(int indice) {
        return indice >= 0 && indice < this.tamanio;
    }

    public void setElemento(int indice, T dato) {
        if (comprobacion(indice)) {
            this.datos.set(indice, dato);
        } else {
        }
    }

    public int getLongitud() {
        return this.tamanio;
    }

    public void limpiar(T dato) {
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.set(i, dato);
        }
    }
    public void agregar(T dato){
        this.datos.add(dato);
    }
    
    @Override
    public String toString(){
        String estado = "------------- "+this.tamanio+" -------------\n";
        for (T dato : datos) {
            if(dato != null){
                estado += dato.toString()+"\n";
            }
        }
        return estado;
    }
        }
