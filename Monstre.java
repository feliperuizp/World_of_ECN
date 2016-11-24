/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author Ruizo
 */
public abstract class Monstre extends Creature {
   
// Constructeurs de la classe Monstre

    /**
     *
     * @param pV
     * @param pA
     * @param pP
     * @param dA
     * @param pos
     * @param ptPar
     */
   
   public Monstre(int pV, int pA, int pP, int dA, Point2D pos,int ptPar) {
        super(pV,pA,pP,dA,pos,ptPar);
    }
   
    /**
     *
     * @param m
     */
    public Monstre(Monstre m ) {
       super(m);
    }
   
    /**
     *
     */
    public Monstre() {
        super();
        this.setPtVie(50);
        this.setPourcentagePar(80);
        this.setPtPar(5);
             }
  
    
}
