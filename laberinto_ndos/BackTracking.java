package laberinto_ndos;
/**
 *
 * @author Ana
 */
public class BackTracking {
    private Matriz casillas;
    private Pila anteriores;
    private Pila posiciones;
    private Pila direcciones;
    private Posiciones inicio, fin, actual, anterior;

    public BackTracking(Matriz casillas) {
        this.casillas = casillas;
        this.actual = new Posiciones(-1, -1);
        this.anterior = new Posiciones(-1, -1);
        this.posiciones = new Pila();
        this.anteriores = new Pila();
        this.direcciones=new Pila();
        anteriores.push(new Posiciones(-1, -1));

        for (int i = 0; i < casillas.get_fila_tamaño(); i++) {
            for (int j = 0; j < casillas.getNumcolumnas(); j++) {
                if (casillas.get_item(i, j).equals("E")) {
                    inicio = new Posiciones(i, j);
                    this.posiciones.push(inicio);
                }
                if (casillas.get_item(i, j).equals("S")) {
                    this.fin = new Posiciones(i, j);
                }
            }
        }
        imprimir();
        System.out.println("");
        casillas.set_item(fin.getX(), fin.getY(), "0");
    }
    boolean accion;

    public void movimiento() {
        actual = (Posiciones) posiciones.peek();
        anterior = (Posiciones) anteriores.peek();
        accion = true;
        if (validacion(actual.getX() - 1, actual.getY()) && accion) {
            if (casillas.get_item(actual.getX() - 1, actual.getY()).equals("0")) {
                Posiciones auxil = new Posiciones(actual.getX() - 1, actual.getY());
                  if (auxil.getX() == anterior.getX() && auxil.getY() == anterior.getY()) {
                    } else {
                        posiciones.push(auxil);
                        anteriores.push(actual);
                        accion = false;
                            }
                              }
                                }

        if (validacion(actual.getX(), actual.getY() + 1) && accion) {
            if (casillas.get_item(actual.getX(), actual.getY() + 1).equals("0")) {
                Posiciones auxil = new Posiciones(actual.getX(), actual.getY() + 1);
                if (auxil.getX() == anterior.getX() && auxil.getY() == anterior.getY()) {
                    } else {
                    posiciones.push(auxil);
                    anteriores.push(actual);
                    accion = false;
                        }
                          }
                            }
        
        if (validacion(actual.getX() + 1, actual.getY()) && accion) {
            if (casillas.get_item(actual.getX() + 1, actual.getY()).equals("0")) {
                Posiciones auxil = new Posiciones(actual.getX() + 1, actual.getY());
                if (auxil.getX() == anterior.getX() && auxil.getY() == anterior.getY()) {
                    } else {
                    posiciones.push(auxil);
                    anteriores.push(actual);
                    accion = false;
                        }
                          }
                            }
        
        if (validacion(actual.getX(), actual.getY() - 1) && accion) {
            if (casillas.get_item(actual.getX(), actual.getY() - 1).equals("0")) { 
                Posiciones auxil = new Posiciones(actual.getX(), actual.getY() - 1);
                    if (auxil.getX() == anterior.getX() && auxil.getY() == anterior.getY()) {
                          } else {
                    posiciones.push(auxil);
                    anteriores.push(actual);
                    accion = false;
                }

            }

        }
        if (accion) { 
            casillas.set_item(actual.getX(), actual.getY(), "*");
            anteriores.pop();
            posiciones.pop();
                        }
        actual = (Posiciones) posiciones.peek();
        
                                  }

    public void play() {
        Posiciones aux = (Posiciones) posiciones.peek();
        while (actual.getX() != fin.getX() || actual.getY() != fin.getY()) {
            movimiento();
                            }   
        casillas.set_item(fin.getX(), fin.getY(), "S");
        System.out.println(posiciones);
        imprimir();
                            }

    public boolean validacion(int filas, int columnas) {
        return !(filas < 0 || filas >= casillas.get_fila_tamaño() || columnas < 0 || columnas >= casillas.get_columna_tamaño());
    }

    public void imprimir() {
        for (int i = 0; i < casillas.get_fila_tamaño(); i++) {
            for (int j = 0; j < casillas.getNumcolumnas(); j++) {
                System.out.print("{" + casillas.get_item(i, j) + "]");
                    }
            System.out.println();
            }
                }
 
                          
}
