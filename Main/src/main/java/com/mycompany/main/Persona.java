/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class Persona implements Observer{
    private String codigo;
    private String nombre;
    private String apellidos;
    private String email;
    private Date fechadeNacimiento;

    public Persona() {
    }

    public Persona(String codigo, String nombre, String apellidos, String email, Date fechadeNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechadeNacimiento = fechadeNacimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(Date fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

    @Override
    public void update(Observable o, Object o1) {
        if (o1.equals("stock")){
            System.out.println("El stock a sido modificado ");
        }
    }
    
    
}
