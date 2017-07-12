/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Scanner;
/**
 *
 * @author fabienrouillon
 */
public class Joueur {
    
    private Personnage perso;

    public Personnage getPerso() {
        return perso;
    }

    public void setPerso(Personnage perso) {
        this.perso = perso;
    }
    
    
    public void choixPerso(){
        Scanner sc = new Scanner(System.in);
        String choix = "";
        do
        {   System.out.println("Choisissez la classe de votre Personnage");
            choix = sc.nextLine();
        }while(!choix.equals("Archer") && !choix.equals("Guerrier") && !choix.equals("Mage"));
            
        switch(choix)
        {
            case "Archer":
                perso= new Archer();
                break;
            case "Guerrier":
                perso= new Guerrier();
                break;
            default:
                perso= new Mage();
        }
    
        String choixNom;
        System.out.println("Choisissez le nom de votre Personnage");
        choixNom = sc.nextLine();
        perso.setNom(choixNom);
        
    }
}
