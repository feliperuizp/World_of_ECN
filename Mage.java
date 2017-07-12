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
public class Mage extends Personnage implements Combattant {

    public Mage(String nom, int ptV, int ptM, int pA, int pP, int pM, int dA, int dM, int distMax, Point2D pos, int ptPar, LinkedList<Nourriture> nour) {
        super(nom, ptV, ptM, pA, pP, pM, dA, dM, distMax, pos, ptPar, nour);
    }

    public Mage(Mage a) {
        super((Personnage) a);
    }

    public Mage() {
        super();
        Random alea = new Random();
        this.setDegMag(10 + alea.nextInt(11));
        this.setDistAttMax(5 + alea.nextInt(6));
        this.setPourcentageMag(60 + alea.nextInt(6));
    }

    @Override
    public boolean combattre(Creature c) {

        double distance = this.getPos().distance(c.getPos());
        if (this.getDistAttMax() >= distance && distance > 0) {

            Random att = new Random();
            int attaque = att.nextInt(100) + 1;

            if (attaque > this.getPourcentageMag()) {
                System.out.println(this.getNom() + " :échec d'attaque ");
                this.setDegMag(this.getDegMag() - 1);
            } else {
                Random def = new Random();
                int defense = def.nextInt(100) + 1;

                if (defense > c.getPourcentagePar()) {
                    c.setPtVie((c.getPtVie() - this.getDegMag()));
                    System.out.println(c.getClass() + " perd " + this.getDegMag() + " points de vie");
                    System.out.println(c.getClass() + " a " + c.getPtVie() + " points de vie");
                } else {
                    c.setPtVie((c.getPtVie() - this.getDegMag() + c.getPtPar()));
                    System.out.println(c.getClass() + " perd " + (this.getDegMag() - c.getPtPar()) + " points de vie");
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
