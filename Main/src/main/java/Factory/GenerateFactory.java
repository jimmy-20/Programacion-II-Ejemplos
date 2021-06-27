/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Interfaces.FabricaAbstracta;

/**
 *
 * @author Jimmy-Soza
 */
public class GenerateFactory {
    public static FabricaAbstracta getFactory(String option){
        switch(option){
            case "DB":
                return new FabricaDB();
            case "URL":
                return new FabricaURL();
        }
        return null;
    }
}
