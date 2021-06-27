/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import Factory.GenerateFactory;
import Interfaces.FabricaAbstracta;
import Interfaces.IConexionDB;
import Interfaces.IConexionRest;


/**
 *
 * @author FAMILIASOZAORTIZ
 */

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        FabricaAbstracta fa = GenerateFactory.getFactory("DB");
        
        IConexionDB db = fa.getDB("Oracle");
        db.conectar();
        
        FabricaAbstracta fu = GenerateFactory.getFactory("URL");
        
        IConexionRest rest = fu.getRest("Eva");
        rest.leerURL("eva.uni.edu.ni");
    }
    
}
