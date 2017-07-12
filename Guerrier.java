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
public class Guerrier extends Personnage implements Combattant {

    public Guerrier(String nom, int ptV, int ptM, int pA, int pP, int pM, int dA, int dM, int distMax, Point2D pos, int ptPar, LinkedList<Nourriture> nour) {
        super(nom, ptV, ptM, pA, pP, pM, dA, dM, distMax, pos, ptPar, nour);
    }

    public Guerrier(Guerrier a) {
        super((Personnage) a);
    }

    public Guerrier() {
        super();
        Random alea = new Random();
        this.setDegAtt(30 + alea.nextInt(6));
        this.setDistAttMax(1);
        this.setPourcentageAtt(70 + alea.nextInt(11));
    }

    @Override
    public boolean combattre(Creature c) {

        double distance = this.getPos().distance(c.getPos());

        if (distance == 1) {

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
