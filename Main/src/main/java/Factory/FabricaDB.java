/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import DataBase.ConexionMySQL;
import DataBase.ConexionOracle;
import DataBase.ConexionVacia;
import Interfaces.FabricaAbstracta;
import Interfaces.IConexionDB;
import Interfaces.IConexionRest;

/**
 *
 * @author Jimmy-Soza
 */
public class FabricaDB implements FabricaAbstracta{

    @Override
    public IConexionDB getDB(String motor) {
        if (motor == null || motor.isEmpty()){
            return new ConexionVacia();
        }
        
        switch(motor){
            case "MySQL":
                return new ConexionMySQL();
                
            case "Oracle":
                return new ConexionOracle();
        }
        return new ConexionVacia();
    }

    @Override
    public IConexionRest getRest(String url) {
        return null;
    }
}
