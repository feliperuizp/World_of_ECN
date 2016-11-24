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
public class Mana extends Potion{
    private int ptMana;
    
    public Mana(){
        super();
        Random alea = new Random();
        int t = alea.nextInt(21);
        this.ptMana=t+10;
    }
    
    public Mana(int pt){
        this.ptMana=pt;
    }
    
    public Mana(int ptM, Point2D pos) {
        super(pos);
        this.ptMana = ptM;
          
    }
    
    public int getPtMana() {
        return ptMana;
    }

    public void setPtMana(int ptMana) {
        this.ptMana = ptMana;
    }
    
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Mana apporté: "+getPtMana());
    }
    
}
   
