package com.mycompany.tarea3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Ana
 */
public class Nomina {
     public static void main(String[] args) {
       String archivo = "C:\\Tarea3\\src\\main\\java\\com\\mycompany\\tarea3\\junio.dat";
  BufferedReader lector = null;
  String texto = "";
  
  try {
   lector = new BufferedReader(new FileReader(archivo));
   while((texto = lector.readLine()) != null) {  
    String[] row = texto.split(",(?=([^\"]\"[^\"]\")[^\"]$)"); 
    for(String index : row) {
     System.out.printf("%-10s", index);
    }
    System.out.println();
   }
  }
  catch(Exception e) {
   e.printStackTrace();
  }
 finally {
   try {
    lector.close();
   } catch (IOException e) {
    e.printStackTrace();
   } 
  }
  
  
    }
}

