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

public abstract class Personnage extends Creature {
    
//On écrit les attributs de la classe Personnage

    private String nom;
    private int ptMana;
    private int degMag;
    private int pourcentageMag;
    private int distAttMax;
    private LinkedList<Nourriture> nourriture;


    // On écrits les constructeurs de la classe Personnage   

    /**
     *
     * @param nom 
     * @param pV 
     * @param ptM
     * @param pA
     * @param pP
     * @param pM
     * @param rM
     * @param dA
     * @param dM
     * @param distMax
     * @param pos
     * @param ptPar
     * @param nourriture
     */
    public Personnage(String nom, int pV, int ptM, int pA, int pP,  int pM, int dA, int dM, int distMax, Point2D pos, int ptPar, LinkedList<Nourriture> nourriture) {
        super(pV,pA,dA,pP,pos,ptPar);
        this.nom = nom;
        this.ptMana = ptM;
        this.pourcentageMag = pM;
        this.degMag = dM;
        this.distAttMax = distMax;
        this.nourriture=nourriture;
        }

    
    /**
     *
     * @param perso
     */
    public Personnage(Personnage perso) {
        super((Creature) perso);
        this.nom = perso.nom;
        this.ptMana = perso.ptMana;
        this.pourcentageMag = perso.pourcentageMag;
        this.distAttMax = perso.distAttMax;
        this.nourriture=perso.nourriture;
        this.setDegAtt(perso.getDegAtt());
    }
   
    /**
     *
     */
    public Personnage() {
        super();
        this.ptMana=50;
        this.setPtVie(100);
        this.setPourcentagePar(50);
        this.setPtPar(5);
    }
    
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Nom: "+getNom());
        System.out.println("Point de mana: "+getPtMana());
        
    }
    
    // On écrit fonctions getters and setters

    /**
     *
     * @return
     */
    
    public String getNom(){
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     *
     * @return
     */
    public int getPtMana() {
        return ptMana;
    }

    /**
     *
     * @param ptMana
     */
    public void setPtMana(int ptMana) {
        this.ptMana = ptMana;
    }



    /**
     *
     * @return
     */
    public int getPourcentageMag() {
        return pourcentageMag;
    }

    /**
     *
     * @param pourcentageMag
     */
    public void setPourcentageMag(int pourcentageMag) {
        this.pourcentageMag = pourcentageMag;
    }


    /**
     *
     * @return
     */
    public int getDegMag() {
        return degMag;
    }

    /**
     *
     * @param degMag
     */
    public void setDegMag(int degMag) {
        this.degMag = degMag;
    }
    
    /**
     *
     * @return
     */
    public int getDistAttMax() {
        return distAttMax;
    }

    /**
     *
     * @param distAttMax
     */
    public void setDistAttMax(int distAttMax) {
        this.distAttMax = distAttMax;
    }

    public LinkedList<Nourriture> getNourriture() {
        return nourriture;
    }

    public void setNourriture(LinkedList<Nourriture> nourriture) {
        this.nourriture = nourriture;
    }
    

    
}
