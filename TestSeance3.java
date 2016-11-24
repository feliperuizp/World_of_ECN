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
 * Main
 */
public class TestSeance3 {
    
        public static void main(String[] args) {
            long debutN = System.nanoTime();
            
            World map = new World();
            
            map.creeMondeAlea();
            
            /*
            for(int i=0; i<map.getListe_archers().size(); i++){
                System.out.println("On affiche ce archer:");
                map.getListe_archers().get(i).affiche();
                }

            for(int i=0; i<map.getListe_lapins().size(); i++){
                System.out.println("On affiche ce lapin:");
                map.getListe_lapins().get(i).affiche();
                }

            for(int i=0; i<map.getListe_guerriers().size(); i++){
                System.out.println("On affiche ce guerrier:");
                map.getListe_guerriers().get(i).affiche();
                }

            for(int i=0; i<map.getListe_loups().size(); i++){
                System.out.println("On affiche ce loups:");
                map.getListe_loups().get(i).affiche();
                }

            for(int i=0; i<map.getListe_paysans().size(); i++){
                System.out.println("On affiche ce paysan:");
                map.getListe_paysans().get(i).affiche();
                }   */         
            
            /*
            Iterator<Archer> listItArcher = MondeMul.getListeArcher().iterator();
    
            while(listItArcher.hasNext()) { 

                Archer arquero = listItArcher.next();

                X+=ar.getPos().getX();
                Y+=ar.getPos().getY();


            }

            X/=100;
            Y/=100;
            */
            
            // BARICENTRE
            int X=0;
            int Y=0;
            
            for(int i=0; i<map.getListe_archers().size(); i++){
                X+=map.getListe_archers().get(i).getPos().getX();
                Y+=map.getListe_archers().get(i).getPos().getY();
                }

            for(int i=0; i<map.getListe_lapins().size(); i++){
                X+=map.getListe_lapins().get(i).getPos().getX();
                Y+=map.getListe_lapins().get(i).getPos().getY();
                }

            for(int i=0; i<map.getListe_guerriers().size(); i++){
                X+=map.getListe_guerriers().get(i).getPos().getX();
                Y+=map.getListe_guerriers().get(i).getPos().getY();
                }

            for(int i=0; i<map.getListe_loups().size(); i++){
                X+=map.getListe_loups().get(i).getPos().getX();
                Y+=map.getListe_loups().get(i).getPos().getY();
                }

            for(int i=0; i<map.getListe_paysans().size(); i++){
                X+=map.getListe_paysans().get(i).getPos().getX();
                Y+=map.getListe_paysans().get(i).getPos().getY();
                }     
            
            X /= 100;
            Y /= 100;
            
            System.out.println("Le baricentre est ["+X+","+Y+"]");
            
            long finN = System.nanoTime();
            System.out.println("Temps ecoulé en ns :" + (finN-debutN));
            
    }
}

