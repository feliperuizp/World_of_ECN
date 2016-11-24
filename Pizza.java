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
public class Pizza extends Nourriture{

    
    public Pizza(Point2D pos, int cnt, int val) {
        super(pos,cnt,val);
    }
   
    /**
     *
     * @param p
     */
    public Pizza(Pizza p) {
       super(p);
    }
   
    
    public Pizza(){
        super();
        Random alea = new Random();
        int t = alea.nextInt(11);
        this.setValeur_bonus_malus(t+30);
    }
    
    public Pizza(int pt){
        super();
        this.setValeur_bonus_malus(pt);
    }

    
    
}
