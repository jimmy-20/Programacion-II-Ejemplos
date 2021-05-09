/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class NewMain {

    public static void main(String[] args) {
        Persona p = new Persona("Jimmy");
        Celular c = new Celular();
        
        p.addPropertyChangeSupport(c);
        
        p.setPassword(123);
        p.setPassword(9876);
        p.setPassword(1234);
    }
}
