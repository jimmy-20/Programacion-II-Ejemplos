/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class Producto extends Observable{
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;
    
    private Observer observer;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, float precio, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer obsrvr) {    
    this.observer = obsrvr;
    }

    @Override
    public void notifyObservers() {
        if (observer != null){
            observer.update(this, "stock");
        }
    }
    
    
    
    
    
    
    
    
}
