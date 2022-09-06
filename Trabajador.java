package com.mycompany.tarea3;
/**
 *
 * @author Ana
 */
//atributos
public class Trabajador {
  private int Ntrabajador;
  private String nombre;
  private String paterno; 
  private String materno;
  private  double horasExtra;
  private int sueldoBase;
  private double salarioF;
  private int anioIngreso; 
  private int antiguedad;
  
  //constructor

    public Trabajador(int Ntrabajador, String nombre, String paterno, String materno, 
            double horasExtra, int sueldoBase, double salarioF, int anioIngreso) {
        this.Ntrabajador = Ntrabajador;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.salarioF = salarioF;
        this.anioIngreso = anioIngreso;
         }
  
  // gets y sets 

    public int getNtrabajador() {
        return Ntrabajador;
    }

    public void setNtrabajador(int Ntrabajador) {
        this.Ntrabajador = Ntrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getSalarioF() {
        salarioF=(sueldoBase+(sueldoBase*0.3))+horasExtra*276.5;
        return salarioF;
    }

    public void setSalarioF(double salarioF) {
        this.salarioF = salarioF;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getAntiguedad() {
        antiguedad= 2022-anioIngreso;
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    //métodos
    public String toString() {
        return "Trabajador{" + "Ntrabajador=" + Ntrabajador + 
                ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", horasExtra=" +
                horasExtra + ", sueldoBase=" + sueldoBase + ", añoIngreso=" + anioIngreso + '}';
    }
}
