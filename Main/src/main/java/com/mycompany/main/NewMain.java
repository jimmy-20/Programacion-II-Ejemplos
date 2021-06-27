/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import Factory.Fabrica;
import Interfaces.IConexion;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fabrica fabrica = new Fabrica();
        
        IConexion cx1 = Fabrica.getConexion("Oracle");
        cx1.conectar();
        cx1.desconectar();
        
        System.out.println("");
        
        IConexion cx2 = Fabrica.getConexion("MySQL");
        cx2.conectar();
        cx2.desconectar();
    }
    
}
