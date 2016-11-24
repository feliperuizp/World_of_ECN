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
public class NuageToxique extends Objet implements Deplacable, Combattant {
    private int toxicite;
    

    public NuageToxique(){
        super();
        Random alea = new Random();
        int t = alea.nextInt(21);
        toxicite=10+t;
    }
    public NuageToxique(Point2D pos, int toxicite) {
        super(pos);
        this.toxicite=toxicite;
    }

    @Override
    public void deplace(){
        Random alea = new Random();
        int t = alea.nextInt(8);
        switch(t)
        {
            case 0:
                this.getPos().translate(0,1);
                break;
            case 1:
                this.getPos().translate(0, -1);
                break;
            case 2:
                this.getPos().translate(1,0);
                break;
            case 3:
                this.getPos().translate(-1,0);
                break;
            case 4:
                this.getPos().translate(1,1);
                break;
            case 5:
                this.getPos().translate(1,-1);
                break;
            case 6:
                this.getPos().translate(-1,1);
                break;
            default:
                this.getPos().translate(-1,-1);
                break;}
    }
    
    @Override
    public boolean combattre(Creature c) {
        c.setPtVie(c.getPtVie() - toxicite);
        return true;
    }

    public int getToxicite() {
        return toxicite;
    }

    public void setToxicite(int toxicite) {
        this.toxicite = toxicite;
    }
    
    
        
}

