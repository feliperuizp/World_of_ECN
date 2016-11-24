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
public class Nourriture extends Objet {
    
    private int compteur;
    private int valeur_bonus_malus;
    
    public Nourriture(Point2D pos) {
        super(pos);
        this.compteur=3;
        this.valeur_bonus_malus=0;
        
    }
   
    public Nourriture(Point2D pos, int cnt, boolean bool,int bon) {
        super(pos);
        this.compteur=cnt;
        this.valeur_bonus_malus=bon;
        
    }
    
    public Nourriture(Point2D pos, int cnt, int val) {
        super(pos);
        this.compteur=cnt;
        this.valeur_bonus_malus=val;
    }
    
    /**
     *
     * @param n
     */
    public Nourriture(Nourriture n) {
       super(n);
    }
   
    
    public Nourriture() {
        super();
        this.compteur=3;
        this.valeur_bonus_malus=0;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public int getValeur_bonus_malus() {
        return valeur_bonus_malus;
    }

    public void setValeur_bonus_malus(int valeur_bonus_malus) {
        this.valeur_bonus_malus = valeur_bonus_malus;
    }
    
    
    
}
