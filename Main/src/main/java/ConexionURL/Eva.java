/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionURL;

import Interfaces.IConexionRest;

/**
 *
 * @author Jimmy-Soza
 */
public class Eva implements IConexionRest{

    @Override
    public void leerURL(String url) {
        System.out.println("Conectandose a "+url);
    }
    
}
