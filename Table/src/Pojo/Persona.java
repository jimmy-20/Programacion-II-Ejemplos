/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String carnet;
    private Carrera carrera;
    
    public enum Carrera{
        Sistemas,Civil,Mecanica;
        
        
    }

    public Persona(String nombre, String apellido, int edad, String carnet, Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carnet = carnet;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    public Object[] toArray(){
        Object[] obj = new Object[5];
        
        obj[0] = nombre;
        obj[1] = apellido;
        obj[2] = edad;
        obj[3] = carnet;
        obj[4] = carrera;
        
        return obj;
    }
    
}
