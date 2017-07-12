/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.LinkedList;

/**
 *
 * @author Ruizo
 */
public class Paysan extends Personnage {
    public Paysan(String nom,int ptV,int ptM, int pA, int pP, int pM, int dA, int dM, int distMax, Point2D pos, int ptPar, LinkedList<Nourriture> nour) {
    super(nom, ptV, ptM, pA, pP,  pM,  dA,  dM,  distMax, pos, ptPar, nour);
    }
    
    public Paysan(Paysan p) {
        super((Personnage) p);
    }
   
    public Paysan() {
        super(); 
    }
    
}
