/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 *
 * @author fabienrouillon
 */
public class Soin extends Potion{
    private int ptVie;
    
    public Soin(){
        super();
        Random alea = new Random();
        int t = alea.nextInt(41);
        this.ptVie=t+10;
    }
    
    public Soin(int pt){
        this.ptVie=pt;
    }
    
    public Soin(int ptv, Point2D pos) {
        super(pos);
        this.ptVie = ptv;
    }
    
    public int getPtVie() {
        return ptVie;
    }

    public void setPtVie(int PtVie) {
        this.ptVie = PtVie;
        
    }
    
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Soin apporté: "+getPtVie());
    }
}
   
    
   