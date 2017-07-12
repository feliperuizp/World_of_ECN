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
public class Point2D {

    /** Attributs de Point2D **/
    
    private int x;
    private int y;
            
    /**
     * Constructeur de Point2D sans paramètres
     */
    public Point2D (){
    }
    
    /**
     * Construceteur de Point2D avec deux paramètres
     * @param a c'est la position sur l'axe des abscisses
     * @param b c'est la position sur l'axe des ordonées
     */
    public Point2D (int a, int b){
        x = a;
        y = b;
    }
    
    /**
     * Constructeur de Point2D avec un paramètre de classe Point2D 
     * @param p2d
     */
    public Point2D (Point2D p2d){
        this.x = p2d.x ;
        this.y = p2d.y;
    }
        
    /**
     *Getter x
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     *Setter x
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *Getter y
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     *Setter y
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Changer la position de dx,dy
     * @param dx
     * @param dy
     */
    public void translate (int dx, int dy){
        x += dx;
        y += dy;
    }
    
    /**
     * Changer la position à la position [a,b]
     * @param a
     * @param b
     */
    public void setPosition(int a, int b){
        x = a;
        y = b;
    }
    
    /**
     * 
     */
    public void affiche(){
        System.out.println("["+x+";"+y+"]");
    }
    
    public double distance(Point2D P){
       return Math.sqrt((P.getX()-this.getX())*(P.getX()-this.getX())+(P.getY()-this.getY())*(P.getY()-this.getY()));
    }
    
    
}
