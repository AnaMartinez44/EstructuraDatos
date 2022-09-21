
/**
 *
 * @author Ana
 */
import java.util.Random;
import java.util.Scanner;
public class juegoEjectutable {

    public static void main(String[] args) {
        String[][] tablero = new String[10][10];
 
        Juego jugador = new Juego();
 
                 // Inicializando la entrada para las cuadrículas, muertas-0, activas-1
                 
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {
 
                int num = new Random().nextInt(2);// Generando vecinos random en cada ubicación
                if (num == 1)
                    tablero[i][j] = "V";
                else if (num == 0)
                    tablero[i][j] = "M";
            }
        }
 
                 // Imprimiendo el estado inicial de la cuadrícula
                 System.out.println ("El estado inicial es:");
        jugador.imprimirTablero1(tablero);
        System.out.println("===========");
 
        int n = 0;
                 int num = 0; // Registrando el número de cambios
        while (n == 0) {
 
                         // Matriz de puntos para registrar el estado de la siguiente ronda de la posición correspondiente, 1 la próxima 
                         //gen muerta, 2 la próxima gen vive y 3 gen resucita
            int[] puntos = jugador.recibir(new int[100], tablero);
 
                     
            tablero = jugador.obtenerSiguiente(tablero, puntos).clone();
 
                         System.out.println (" " + (++ num) + "cambio:");
 
            jugador.imprimirTablero(tablero);
            System.out.println("===========");
 
            //configurando que el usuario ponga hasta cuantas gen quiere seguir con el juego
                         System.out.println ("Ingrese 0 para continuar con la siguiente generación O ingrese" + "\n" + "otros números para salir.");
            n = new Scanner(System.in).nextInt();
        }

    }
    
}
