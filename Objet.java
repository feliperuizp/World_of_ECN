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
public class Objet extends ElementDeJeu{
    
    public Objet(Point2D pos) {
        super(pos);
    }
   
    /**
     *
     * @param o
     */
    public Objet(Objet o ) {
       super(o);
       
    }
   
    /**
     *
     */
    public Objet() {
             }

}
