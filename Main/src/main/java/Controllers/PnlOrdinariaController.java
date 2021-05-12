/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Panels.PnlOrdinaria;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class PnlOrdinariaController {
    private PnlOrdinaria pnlOrdinaria;
    private DecimalFormat ft;
    public PnlOrdinariaController(PnlOrdinaria pnlOrdinaria) {
        this.pnlOrdinaria = pnlOrdinaria;
        ft = new DecimalFormat(".##");
        initComponents();
    }

    private void initComponents() {
        pnlOrdinaria.getBtnCalcular().addActionListener(((e) -> {
            btnCalcularActionPerformed(e);
        }));
        
        pnlOrdinaria.getBtnLimpiar().addActionListener(((e) -> {
            btnLimpiarActionPerformed(e);
        }));
    }

    private void btnCalcularActionPerformed(ActionEvent e) {
        float presente = Float.parseFloat(pnlOrdinaria.getTxtValorPresente().getText());
        float tasa = Float.parseFloat(pnlOrdinaria.getTxtTasa().getText()) / 100;
        float periodo = Float.parseFloat(pnlOrdinaria.getTxtPeriodo().getText());
        
        float termino = (float) Math.pow(1+tasa, periodo);
        
        float anualidad = (float) (presente * ((tasa*termino) / (termino-1)));
        
        pnlOrdinaria.getLblResultado().setText("Anualidad: "+ ft.format(anualidad));
        
        System.out.println("Presente: " +presente);
        System.out.println("Tasa: "+tasa);
        System.out.println("Periodo: "+periodo);
        System.out.println("Termino: "+termino);
    }

    private void btnLimpiarActionPerformed(ActionEvent e) {
        pnlOrdinaria.getTxtValorPresente().setText("");
        pnlOrdinaria.getTxtTasa().setText("");
        pnlOrdinaria.getTxtPeriodo().setText("");
        pnlOrdinaria.getLblResultado().setText("Anualidad: ");

    }
    
    
}
