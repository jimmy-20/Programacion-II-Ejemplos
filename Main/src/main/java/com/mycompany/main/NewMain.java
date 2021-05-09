/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import java.util.GregorianCalendar;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto = new Producto("Coca", "Retornable", 35, 1234);
        Persona cliente = new Persona("27", "Jimmy", "Soza", "jasocanal@gmail.com", new GregorianCalendar().getTime());
        
        producto.addObserver(cliente);
        producto.setStock(12345);
    }
    
}
