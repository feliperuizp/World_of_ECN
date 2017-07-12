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
public class Potion extends Objet{
    
    public Potion(Point2D pos) {
        super(pos);
        
    }
   
    /**
     *
     * @param p
     */
    public Potion(Potion p) {
       super(p);
    }
   
    
    public Potion() {
        super();
    }
}
