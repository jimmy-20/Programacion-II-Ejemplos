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
public class ConexionOracle implements IConexionDB{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionOracle() {
        this.host = "1234";
        this.puerto = "ABCD55";
        this.usuario = "Oracle";
        this.contrasena = "Oracle1234";
    }

    @Override
    public void conectar() {
        System.out.println("Se conecto a Oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto Oracle");
    }
    
    
}
