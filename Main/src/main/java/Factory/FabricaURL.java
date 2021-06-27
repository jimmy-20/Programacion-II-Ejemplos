/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import ConexionURL.Eva;
import ConexionURL.Sira;
import Interfaces.FabricaAbstracta;
import Interfaces.IConexionDB;
import Interfaces.IConexionRest;

/**
 *
 * @author Jimmy-Soza
 */
public class FabricaURL implements FabricaAbstracta{

    @Override
    public IConexionDB getDB(String motor) {
        return null;
    }

    @Override
    public IConexionRest getRest(String url) {
        switch(url){
            case "Eva":
                return new Eva();
            case "Sira":
                return new Sira();
        }
        
        return null;
    }
}
