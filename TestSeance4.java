/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

//import java.util.Scanner;

/**
 *
 * @author Ruizo
 * Main
 */

public class TestSeance4 {
    
        public static void main(String[] args) {
            
            World map = new World();
            map.creeMondeAlea();
            map.creationJoueur();
            while (map.isJeu()) {
            map.afficheWorld();
            map.tourDeJeu();
            }
            System.out.println("Partie finie");
    }
}
