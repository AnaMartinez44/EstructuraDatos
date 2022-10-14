package laberinto_ndos;
/**
 *
 * @author Ana
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablero {
     private Matriz tablero;
     private String direccion;

    public Tablero( String direccion) throws FileNotFoundException {
        this.direccion = direccion;
        int filas=0,columnas = 0;
         String linea;

        
        try {
            BufferedReader bufer = new BufferedReader(new FileReader(this.direccion));
            linea = "";
           while (linea != null) {    
                linea = bufer.readLine();
                if (linea == null) {
                    break;
                }
                filas++;
                String datos[] = linea.split(",");
                columnas=datos.length;
            }
          
        } catch (FileNotFoundException ex) {

            System.err.print(ex);
        } catch (IOException ex) {

            Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.tablero =new Matriz(columnas, new Array(filas));
        filas=0;
           try {
            BufferedReader bufer = new BufferedReader(new FileReader(this.direccion));
            linea = "";
            while (linea != null) {
               linea = bufer.readLine();
                if (linea == null) {
                    break;
                }
                
                  String datos[] = linea.split(",");
                  
               for(int i=0;i<tablero.get_columna_tamaño();i++){
                   tablero.set_item(filas, i, datos[i]);
                   
               }
               filas++;
            }
            
          
        } catch (FileNotFoundException ex) {

            System.err.print(ex);
        } catch (IOException ex) {

            Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);

        }
        
    }
 
    public Matriz getTablero() {
        return tablero;
    }  
        }