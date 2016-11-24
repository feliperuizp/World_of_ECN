/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author fabienrouillon
 */
public class ElementDeJeu {
private Point2D pos;
    
    public ElementDeJeu( Point2D pos) {
        this.pos = pos;
    }
   
    /**
     *
     * @param e
     */
    public ElementDeJeu(ElementDeJeu e ) {
       this.pos = new Point2D(e.pos);
       
    }
   
    /**
     *
     */
    public ElementDeJeu() {
             }
    
    
    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }

    public void affiche() {
        System.out.println("Position: "+getPos().getX()+" "+getPos().getY());
    }
}
