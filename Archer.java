/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;
import java.util.LinkedList;

/**
 *
 * @author Ruizo
 */


public class Archer extends Personnage implements Combattant{
    
    private int nbFleches;
    
    
    public Archer(String nom,int ptV,int ptM, int pA, int pP, int pM, int dA, int dM, int distMax, Point2D pos, int nbF, int ptPar, LinkedList<Nourriture> nour) {
        super(nom, ptV, ptM, pA, pP,  pM,  dA,  dM,  distMax, pos, ptPar, nour);
        this.nbFleches = nbF;
    }
    
    public Archer(Archer a) {
        super((Personnage) a);
        this.nbFleches = a.nbFleches;
    }
   
    public Archer() {
        super();
        Random alea = new Random();
        this.nbFleches=30+alea.nextInt(21);
        this.setDegAtt(5+alea.nextInt(6));
        this.setPourcentageAtt(50+alea.nextInt(6));
        this.setDistAttMax(15+alea.nextInt(6));
    }


    public int getNbFleches() {
        return nbFleches;
    }

    public void setNbFleches(int nbFleches) {
        this.nbFleches = nbFleches;
    }
  
     @Override
    public void affiche() {
        super.affiche();
        System.out.println("Le nombre de Fleches est: " + getNbFleches());
    }
  
    @Override
    public boolean combattre (Creature c) {
        
    
        double distance = this.getPos().distance(c.getPos());
        if (this.getNbFleches() < 1) {
            System.out.println("Plus de flêches disponibles");
            return false;
        } else if (this.getDistAttMax() < distance && distance > 1) {
            this.setNbFleches(this.getNbFleches()-1);
            Random att = new Random();
            int attaque = att.nextInt(100) + 1;

            if (attaque > this.getPourcentageAtt()) {
                System.out.println(this.getNom() + " :échec d'attaque ");
            } else {
                Random def = new Random();
                int defense = def.nextInt(100) + 1;

                if (defense > c.getPourcentagePar()) {
                    c.setPtVie((c.getPtVie() - this.getDegAtt()));
                    System.out.println(c.getClass() + " perd " + this.getDegAtt() + " points de vie");
                    System.out.println(c.getClass() + " a " + c.getPtVie() + " points de vie");
                } else {
                    c.setPtVie((c.getPtVie() - this.getDegAtt() + c.getPtPar()));
                    System.out.println(c.getClass() + " perd " + (this.getDegAtt() - c.getPtPar()) + " points de vie");
                    System.out.println(c.getClass() + " a " + c.getPtVie() + " points de vie");
                }

            }
            if (c.getPtVie() < 0) {
                        System.out.println(c.getClass() + " est mort");
                    }
            return true;

        } else {
            System.out.println("Personnage hors de portée");
            return false;
        }
    }

}
