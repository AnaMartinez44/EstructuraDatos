/**
 *
 * @author Ana
 */
public class Juego {
    public int[] recibir(int[] puntos, String[][] tablero) { //cambiar
 
        int n = 0;
                
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int vidas = 0;
 
                                 // rectificando los vecinos
                if (i + 1 < 4 && tablero[i + 1][j].equals("V")) {
                    vidas++;
                }
 
                if (i + 1 < 4 && j + 1 < 4 && tablero[i + 1][j + 1].equals("V")) {
                    vidas++;
                }
 
                if (i + 1 < 4 && j - 1 >= 0 && tablero[i + 1][j - 1].equals("V")) {
                    vidas++;
                }
 
                if (j + 1 < 4 && tablero[i][j + 1].equals("V")) {
                    vidas++;
                }
 
                if (j - 1 >= 0 && tablero[i][j - 1].equals("V")) {
                    vidas++;
                }
 
                if (i - 1 >= 0 && tablero[i - 1][j].equals("V")) {
                    vidas++;
                }
 
                if (i - 1 >= 0 && j + 1 < 4 && tablero[i - 1][j + 1].equals("V")) {
                    vidas++;
                }
 
                if (i - 1 >= 0 && j - 1 >= 0 && tablero[i - 1][j - 1].equals("V")) {
                    vidas++;
                }
 
                                 // Usando la matriz para registrar el estado de la siguiente gen 
                                 //1. próxima gen muerta, 2. próxima gen vive, 3.próxima gen resucita
                if (tablero[i][j].equals("V")) {
                    if (vidas == 1)
                        puntos[n] = 1;
                    else if (vidas == 2 || vidas == 3)
                        puntos[n] = 2;
                    else if (vidas >= 4)
                        puntos[n] = 1;
                } else {
                    if (vidas == 3)
                        puntos[n] = 3;
                }
                n++;
            }
        }
        return puntos;
    }
 
    public String[][] obtenerSiguiente(String[][] tablero, int[] puntos) {
 
        int n = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (puntos[n] == 1)
                 tablero[i][j] = "o";                    
                if (puntos[n] == 3)
                    {tablero[i][j] = "V";
                n++;
            }
        }
        }
        return tablero;
    }
    public void imprimirTablero1(String[][] tablero){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 9)
                    System.out.println(tablero[i][j] + " ");
                else
                    System.out.print(tablero[i][j] + " ");
            }
        }
    }
    public int vidasTab(String[][] tablero,int i,int j) {
    	String [][] tablerod = new String[10][10];
    	for(int k=0;k<10;k++)
    		for(int l=0;l<10;l++) {
    			tablerod[k][l]= tablero[k][l];
    		}
    	int vidas = 0;
                 // 1. rectificando posiciones de los lados otras vez
        if (i + 1 < 4 && tablerod[i + 1][j].equals("V")) {
            vidas++;
        }
 
        if (i + 1 < 4 && j + 1 < 4 && tablerod[i + 1][j + 1].equals("V")) {
            vidas++;
        }
 
                
        if (i + 1 < 4 && j - 1 >= 0 && tablerod[i + 1][j - 1].equals("V")) {
            vidas++;
        }
 
        if (j + 1 < 4 && tablerod[i][j + 1].equals("V")) {
            vidas++;
        }
 
        if (j - 1 >= 0 && tablerod[i][j - 1].equals("V")) {
            vidas++;
        }
 
        if (i - 1 >= 0 && tablerod[i - 1][j].equals("V")) {
            vidas++;
        }
      
        if (i - 1 >= 0 && j + 1 < 4 && tablerod[i - 1][j + 1].equals("V")) {
            vidas++;
        }
 
        if (i - 1 >= 0 && j - 1 >= 0 && tablerod[i - 1][j - 1].equals("V")) {
            vidas++;
        }
    
    	 return vidas;
    }
    public void imprimirTablero(String[][] tablero){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 9)
                    System.out.println(tablero[i][j] + " ");
                else
                    System.out.print(tablero[i][j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                                 //Cambiar Estado
                if (tablero[i][j]=="o")
                {System.out.print("[" +i+ "][" + j + "]:"+"muerte");
                System.out.print(":" + vidasTab(tablero,i,j) + "-->");
                System.out.println();
                }
    			else if(tablero[i][j] == "V")
                    {System.out.print("[" +i+ "][" + j + "]:"+"vida"); 
                    System.out.print(":" + vidasTab(tablero,i,j) + "-->");
                    System.out.println();}
                //recordar sobrepob
         
            }
        }
        

            }
    
}

    

