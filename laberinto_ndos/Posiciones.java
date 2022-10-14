package laberinto_ndos;
/**
 *
 * @author Ana
 */
public class Posiciones {
    private int X,Y;

    public Posiciones(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public int getX() { //obteniendo y colocando posiciones
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    @Override
    public String toString() {
        return "La posición{" + "X=" + X + ", Y=" + Y + '}';
    }   
        }
