/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class Celular implements PropertyChangeListener{
    private final int password = 1234;  
    
    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        if ( (Integer) pce.getNewValue() == password){
            System.out.println("El usuario a ingresado bien la contraseña");
            System.out.println(pce.getNewValue());
        }else{
            System.out.println("Vuelva a ingresar la contraseña");
        }
    }  
}
