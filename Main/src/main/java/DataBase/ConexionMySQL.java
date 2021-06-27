/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Interfaces.IConexion;

/**
 *
 * @author Jimmy-Soza
 */
public class ConexionMySQL implements IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionMySQL() {
        this.host = "123";
        this.puerto = "ABC";
        this.usuario = "MySQL";
        this.contrasena = "MySQL123";
    }

    @Override
    public void conectar() {
        System.out.println("Se conecto a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto MySQL");
    }
    
    
}
