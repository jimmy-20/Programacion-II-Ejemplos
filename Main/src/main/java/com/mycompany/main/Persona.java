/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class Persona {
    private String nombre;
    private int password = 0;
    
    private PropertyChangeSupport propertyChangeSupport;

    public Persona(String nombre, int password) {
        this.nombre = nombre;
        this.password = password;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        propertyChangeSupport = new PropertyChangeSupport(this);
    }
    
    public void addPropertyChangeSupport(PropertyChangeListener pcl){
        propertyChangeSupport.addPropertyChangeListener(pcl);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        int old = this.password;
        this.password = password;
        propertyChangeSupport.firePropertyChange("password",old,password);
    }
}
