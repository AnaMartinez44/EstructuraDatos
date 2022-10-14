package laberinto_ndos;
/**
 *
 * @author Ana
 */

import java.io.FileNotFoundException;


public class EjecutarLaberinto {

  
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("");
       Tablero tab1=new Tablero("C:\\EstructuraDatos\\src\\main\\java\\laberinto_ndos\\TableroE.txt");
       
        BackTracking juego=new BackTracking(tab1.getTablero());
            juego.play();
    
    
    }
    
}
