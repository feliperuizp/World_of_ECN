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
public class Lapin extends Monstre{
    
    public Lapin(int pV, int pA, int pP, int dA, Point2D pos, int ptPar){
        super(pV, pA,pP,dA,pos,ptPar);
}
    
    public Lapin(Lapin l){
        super((Monstre) l);
    }
    
    public Lapin(){
        super();
    }
}