/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Scanner;

/**
 *
 * @author Ruizo
 */
public abstract class Creature extends ElementDeJeu implements Deplacable {
    
    private int ptVie;
    private int pourcentageAtt;
    private int degAtt;
    private int pourcentagePar;
    private int ptPar;

   public Creature(int pV, int pA, int dA, int pP, Point2D pos,int ptPar) {
        super(pos);
        this.ptVie = pV;
        this.pourcentageAtt = pA;
        this.degAtt = dA;
        this.pourcentagePar = pP;
        this.ptPar=ptPar;
    }
   
    /**
     *
     * @param c
     */
    public Creature(Creature c ) {
       this.ptVie =  c.ptVie;
       this.pourcentageAtt = c.pourcentageAtt;
       this.degAtt = c.degAtt;
       this.pourcentagePar = c.pourcentagePar;
       this.ptPar = c.ptPar;
       this.setPos(new Point2D(c.getPos()));
    }
   
    /**
     *
     */
    public Creature() {
    }
    
    public int getPtVie() {
        return ptVie;
    }

    public void setPtVie(int PtVie) {
        this.ptVie = PtVie;
    }

    public int getPourcentageAtt() {
        return pourcentageAtt;
    }

    public void setPourcentageAtt(int PourcentageAtt) {
        this.pourcentageAtt = PourcentageAtt;
    }

    public int getDegAtt() {
        return degAtt;
    }

    public void setDegAtt(int DegAtt) {
        this.degAtt = DegAtt;
    }
    
    /**
     *
     * @return
     */
    public int getPourcentagePar() {
        return pourcentagePar;
    }

    /**
     *
     * @param pourcentagePar
     */
    public void setPourcentagePar(int pourcentagePar) {
        this.pourcentagePar = pourcentagePar;
    }

    public int getPtPar() {
        return ptPar;
    }

    public void setPtPar(int ptPar) {
        this.ptPar = ptPar;
    }
    
    

    @Override
    public void deplace() {
    Scanner sc = new Scanner(System.in);
        String dep = "";
        do
        {   System.out.println("Chosissez la direction de deplacement pour ce personnage");
            dep = sc.nextLine();
        }while(!dep.equals("s") && !dep.equals("a") && !dep.equals("d") && 
                !dep.equals("w") && !dep.equals("wd") && !dep.equals("dw") &&
                !dep.equals("aw") && !dep.equals("wa") &&
                !dep.equals("sa") && !dep.equals("as") &&
                !dep.equals("sd") && !dep.equals("ds"));
            
        switch(dep)
        {
            case "a":
                this.getPos().translate(-1,0);
                break;
            case "s":
                this.getPos().translate(0, -1);
                break;
            case "d":
                this.getPos().translate(1,0);
                break;
            case "w":
                this.getPos().translate(0,1);
                break;
            case "wd":
                this.getPos().translate(1,1);
                break;
            case "dw":
                this.getPos().translate(1,1);
                break;
            case "aw":
                this.getPos().translate(-1,1);
                break;
            case "wa":
                this.getPos().translate(-1,1);
                break;
            case "sa":
                this.getPos().translate(-1,-1);
                break;
            case "as":
                this.getPos().translate(-1,-1);
                break;
            case "sd":
                this.getPos().translate(1,-1);
                break;
            default:
                this.getPos().translate(1,-1);
                break;}
    }
    
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Point de vie: "+ getPtVie());

    }

}
