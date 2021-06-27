/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Interfaces.IConexionDB;

/**
 *
 * @author Jimmy-Soza
 */
public class ConexionVacia implements IConexionDB{

    @Override
    public void conectar() {
        System.out.println("NONE");
    }

    @Override
    public void desconectar() {
        System.out.println("NONE");
    }
    
}
