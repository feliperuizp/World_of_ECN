/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author Ruizo  
 * 
 */

import java.util.Random;
//import java.util.Scanner;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Ruizo
 */



public class World {

// Constantes    
final int TAILLEMONDE=20;
// 0 si vide, 1 pour une créature, 2 pour Soin, 3 pour Mana, 4 pour la nourriture bonus, 5 pour la nourriture malus
final int mat[][] = new int[TAILLEMONDE][TAILLEMONDE];

private boolean jeu=true;

    
// Attributs de World
private Joueur Joueur1;
private LinkedList<Nourriture> liste_nourriture;
private LinkedList<Creature> liste_creatures;
private LinkedList<Objet> liste_objets; 
private LinkedList<Archer> liste_archers;
private LinkedList<Paysan> liste_paysans;
private LinkedList<Lapin> liste_lapins;
private LinkedList<Guerrier> liste_guerriers;
private LinkedList<Loup> liste_loups;
private LinkedList<Mage> liste_mages;
private LinkedList<Soin> liste_potionsSoin;
private LinkedList<Mana> liste_potionsMana;
private LinkedList<NuageToxique> liste_nuages;

//Constructeur

    /**
     * Création de trois personnages, on leur donne des caractéristiques
     */
    public World(){
        liste_creatures = new LinkedList<>();
        liste_nourriture = new LinkedList<>();
        liste_objets = new LinkedList<>();
        liste_archers = new LinkedList<>();
        liste_paysans = new LinkedList<>();
        liste_lapins = new LinkedList<>();
        liste_guerriers = new LinkedList<>();
        liste_loups = new LinkedList<>();
        liste_mages = new LinkedList<>();
        liste_potionsSoin = new LinkedList<>();
        liste_potionsMana = new LinkedList<>();
        liste_nuages = new LinkedList<>();
        final int NB_GENERE;
        NB_GENERE = 60;
        Random alea = new Random();
        for(int i = 0; i < NB_GENERE; i++){
            int t = alea.nextInt(11);
            switch(t){
                case 0:
                    Archer ar = new Archer();
                    liste_archers.add(ar);
                    liste_creatures.add(ar);
                    break;
                case 1:
                    Paysan pa = new Paysan();
                    liste_paysans.add(pa);
                    liste_creatures.add(pa);
                    break;
                case 2:
                    Lapin la = new Lapin();
                    liste_lapins.add(la);
                    liste_creatures.add(la);
                    break;
                case 3:
                    Guerrier gu = new Guerrier();
                    liste_guerriers.add(gu);
                    liste_creatures.add(gu);
                    break;        
                case 4:
                    Loup lo = new Loup();
                    liste_loups.add(lo);
                    liste_creatures.add(lo);
                    break;
                case 5:
                    Mage mag = new Mage();
                    liste_mages.add(mag);
                    liste_creatures.add(mag);
                    break;
                case 6:
                    Soin so = new Soin();
                    liste_potionsSoin.add(so);
                    liste_objets.add(so);
                    break;
                case 7:
                    Mana man = new Mana();
                    liste_potionsMana.add(man);
                    liste_objets.add(man);
                case 8:
                    NuageToxique nu = new NuageToxique();
                    liste_nuages.add(nu);
                    liste_objets.add(nu);    
                case 9:
                    Pizza pi = new Pizza();
                    liste_nourriture.add(pi);
                default:
                    Andive an = new Andive();
                    liste_nourriture.add(an);
                }   
        }
    } 
        
    public LinkedList<Creature> getListe_creatures() {
        return liste_creatures;
    }

    public LinkedList<Archer> getListe_archers() {
        return liste_archers;
    }

    public LinkedList<Paysan> getListe_paysans() {
        return liste_paysans;
    }

    public LinkedList<Lapin> getListe_lapins() {
        return liste_lapins;
    }

    public LinkedList<Guerrier> getListe_guerriers() {
        return liste_guerriers;
    }

    public LinkedList<Loup> getListe_loups() {
        return liste_loups;
    }

    public LinkedList<Mage> getListe_mages() {
        return liste_mages;
    }

    public LinkedList<Soin> getListe_potionsSoin() {
        return liste_potionsSoin;
    }

    public LinkedList<Mana> getListe_potionsMana() {
        return liste_potionsMana;
    }

    public LinkedList<Objet> getListe_objets() {
        return liste_objets;
    }

    public LinkedList<Nourriture> getListe_nourriture() {
        return liste_nourriture;
    }

    public LinkedList<NuageToxique> getListe_nuages() {
        return liste_nuages;
    }

    public boolean isJeu() {
        return jeu;
    }

    public void setJeu(boolean jeu) {
        this.jeu = jeu;
    }
    
    public void setListe_nuages(LinkedList<NuageToxique> liste_nuages) {
        this.liste_nuages = liste_nuages;
    }

    public void setListe_nourriture(LinkedList<Nourriture> liste_nourriture) {
        this.liste_nourriture = liste_nourriture;
    }
    
    public void setListe_objets(LinkedList<Objet> liste_objets) {
        this.liste_objets = liste_objets;
    }
    

    public void setListe_potionsSoin(LinkedList<Soin> liste_potionsSoin) {
        this.liste_potionsSoin = liste_potionsSoin;
    }

    public void setListe_potionsMana(LinkedList<Mana> liste_potionsMana) {
        this.liste_potionsMana = liste_potionsMana;
    }
    
    public void setListe_creatures(LinkedList<Creature> liste_creatures) {
        this.liste_creatures = liste_creatures;
    }

    public void setListe_archers(LinkedList<Archer> liste_archers) {
        this.liste_archers = liste_archers;
    }

    public void setListe_paysans(LinkedList<Paysan> liste_paysans) {
        this.liste_paysans = liste_paysans;
    }

    public void setListe_lapins(LinkedList<Lapin> liste_lapins) {
        this.liste_lapins = liste_lapins;
    }

    public void setListe_guerriers(LinkedList<Guerrier> liste_guerriers) {
        this.liste_guerriers = liste_guerriers;
    }

    public void setListe_loups(LinkedList<Loup> liste_loups) {
        this.liste_loups = liste_loups;
    }

    public void setListe_mages(LinkedList<Mage> liste_mages) {
        this.liste_mages = liste_mages;
    }

    public Joueur getJoueur1() {
        return Joueur1;
    }

    public void setJoueur1(Joueur Joueur1) {
        this.Joueur1 = Joueur1;
    }
    
    

    //Méthode monde aléatoire

    /**
     * Création de positions de personnages dans un monde de 50*50
     * Les personnages peuvent se déplacer hors de ces limites
     */
    
    public void creeMondeAlea(){
        
        Random pos = new Random();
        for(int i=0; i<liste_archers.size(); i++){
            int x;
            int y;
            do{
            x = pos.nextInt(TAILLEMONDE);
            y = pos.nextInt(TAILLEMONDE);
            }while (mat[x][y]>0);
                    
            mat[x][y] = 1;
            liste_archers.get(i).setPos(new Point2D(x,y));
            }
        for(int i=0; i<liste_paysans.size(); i++){
            int x;
            int y;
            do{
            x = pos.nextInt(TAILLEMONDE);
            y = pos.nextInt(TAILLEMONDE);
            }while (mat[x][y]>0);
            mat[x][y] = 1;
            liste_paysans.get(i).setPos(new Point2D(x,y));
            }
        for(int i=0; i<liste_lapins.size(); i++){
            int x;
            int y;
            do{
            x = pos.nextInt(TAILLEMONDE);
            y = pos.nextInt(TAILLEMONDE);
            }while (mat[x][y]>0);
            mat[x][y] = 1;
            liste_lapins.get(i).setPos(new Point2D(x,y));
            }
        for(int i=0; i<liste_guerriers.size(); i++){
            int x;
            int y;
            do{
            x = pos.nextInt(TAILLEMONDE);
            y = pos.nextInt(TAILLEMONDE);
            }while (mat[x][y]>0);
            mat[x][y] = 1;
            liste_guerriers.get(i).setPos(new Point2D(x,y));
            }
        for(int i=0; i<liste_loups.size(); i++){
            int x;
            int y;
            do{
            x = pos.nextInt(TAILLEMONDE);
            y = pos.nextInt(TAILLEMONDE);
            }while (mat[x][y]>0);
            mat[x][y] = 1;
            liste_loups.get(i).setPos(new Point2D(x,y));
            }
        for(int i=0; i<liste_mages.size(); i++){
            int x;
            int y;
            do{
            x = pos.nextInt(TAILLEMONDE);
            y = pos.nextInt(TAILLEMONDE);
            }while (mat[x][y]>0);
            mat[x][y] = 1;
            liste_mages.get(i).setPos(new Point2D(x,y));
            }
        for(int i=0; i<liste_potionsSoin.size(); i++){
            int x;
            int y;
            do{
            x = pos.nextInt(TAILLEMONDE);
            y = pos.nextInt(TAILLEMONDE);
            }while (mat[x][y]>0);
            mat[x][y]=2;
            liste_potionsSoin.get(i).setPos(new Point2D(x,y));
            }
        for(int i=0; i<liste_potionsMana.size(); i++){
            int x;
            int y;
            do{
            x = pos.nextInt(TAILLEMONDE);
            y = pos.nextInt(TAILLEMONDE);
            }while (mat[x][y]>0);
            mat[x][y] = 3;
            liste_potionsMana.get(i).setPos(new Point2D(x,y));
            }
        for(int i=0; i<liste_nourriture.size(); i++){
            int x;
            int y;
            do{
            x = pos.nextInt(TAILLEMONDE);
            y = pos.nextInt(TAILLEMONDE);
            }while (mat[x][y]>0);
            mat[x][y] = 4;
            liste_nourriture.get(i).setPos(new Point2D(x,y));
            }
        for(int i=0; i<liste_nuages.size(); i++){
            int x;
            int y;
            do{
            x = pos.nextInt(TAILLEMONDE);
            y = pos.nextInt(TAILLEMONDE);
            }while (mat[x][y]>0);
            liste_nuages.get(i).setPos(new Point2D(x,y));
            }
    }
    
    public void creationJoueur(){
        Joueur1 = new Joueur();
        Joueur1.choixPerso();
        Joueur1.getPerso().setNourriture(new LinkedList<>());
        Random pos = new Random();
        int x;
        int y;
        do
        {   x = pos.nextInt(TAILLEMONDE);
            y = pos.nextInt(TAILLEMONDE);
            }while ((mat[x][y] == 1)||(mat[x][y] == 2)||(mat[x][y] == 3)||(mat[x][y] == 4)||(mat[x][y] == 5));
        mat[x][y] = 9;
        Joueur1.getPerso().setPos(new Point2D(x,y));
        liste_creatures.add(Joueur1.getPerso());
    }
    
    public void tourDeJeu(){
        Scanner sc = new Scanner(System.in);
        String choixAction;
        for (int i=0; i<liste_creatures.size(); i++) {
            if (liste_creatures.get(i).getPtVie()<1) {
                mat[liste_creatures.get(i).getPos().getX()][liste_creatures.get(i).getPos().getY()]=0;
                liste_creatures.remove(i);
            }
        }
        
        if (!Joueur1.getPerso().getNourriture().isEmpty()) {
        for (int i=0; i<Joueur1.getPerso().getNourriture().size(); i++) {
            if (Joueur1.getPerso().getNourriture().get(i).getCompteur()==1) {
                if (Joueur1.getPerso() instanceof Mage) {
                    Joueur1.getPerso().setPourcentageMag(Joueur1.getPerso().getPourcentageMag()-Joueur1.getPerso().getNourriture().get(i).getValeur_bonus_malus());
                } else {
                    Joueur1.getPerso().setPourcentageAtt(Joueur1.getPerso().getPourcentageAtt()-Joueur1.getPerso().getNourriture().get(i).getValeur_bonus_malus());
                }
                Joueur1.getPerso().getNourriture().remove(i);
            }
            else {
                Joueur1.getPerso().getNourriture().get(i).setCompteur(Joueur1.getPerso().getNourriture().get(i).getCompteur()-1);
            }
        }
        }
            
        do
        {   System.out.println("Taper d pour vous déplacer, c pour combattre, t pour terminer la partie");
            choixAction = sc.nextLine();
        }while(!choixAction.equals("d") && !choixAction.equals("c") && !choixAction.equals("t"));
    switch (choixAction) {
        case "t":
            jeu=false;
            break;
        case "d":
            Point2D posInitiale= new Point2D(Joueur1.getPerso().getPos());
            while ((mat[Joueur1.getPerso().getPos().getX()][Joueur1.getPerso().getPos().getY()]==9) || (mat[Joueur1.getPerso().getPos().getX()][Joueur1.getPerso().getPos().getY()]==1)) {
                System.out.println("Choisir une position valide");
                Joueur1.getPerso().deplace();
                if ( (mat[Joueur1.getPerso().getPos().getX()][Joueur1.getPerso().getPos().getY()]==1) || (Joueur1.getPerso().getPos().getX()<0) || (Joueur1.getPerso().getPos().getX()>TAILLEMONDE-1) || (Joueur1.getPerso().getPos().getY()<0) || (Joueur1.getPerso().getPos().getY()>TAILLEMONDE-1) ) {
                    Joueur1.getPerso().setPos(posInitiale);
                }
            }
            switch (mat[Joueur1.getPerso().getPos().getX()][Joueur1.getPerso().getPos().getY()]) {
                case 2:
                {
                    int i=0;
                    while (((liste_potionsSoin.get(i).getPos().getX()) != (Joueur1.getPerso().getPos().getX())) || ((liste_potionsSoin.get(i).getPos().getY()) != (Joueur1.getPerso().getPos().getY()))) {
                        i++;
                    }       Joueur1.getPerso().setPtVie(Joueur1.getPerso().getPtVie()+liste_potionsSoin.get(i).getPtVie());
                    liste_potionsSoin.remove(i);
                    break;
                }
                case 3:
                {
                    int i=0;
                    while (((liste_potionsMana.get(i).getPos().getX()) != (Joueur1.getPerso().getPos().getX())) || ((liste_potionsMana.get(i).getPos().getY()) != (Joueur1.getPerso().getPos().getY()))) {
                        i++;
                    }       Joueur1.getPerso().setPtMana(Joueur1.getPerso().getPtMana()+liste_potionsMana.get(i).getPtMana());
                    liste_potionsMana.remove(i);
                    break;
                }
                case 4:
                {
                    int i=0;
                    while (((liste_nourriture.get(i).getPos().getX()) != (Joueur1.getPerso().getPos().getX())) || ((liste_nourriture.get(i).getPos().getY()) != (Joueur1.getPerso().getPos().getY()))) {
                        i++;
                    }       Joueur1.getPerso().getNourriture().add(liste_nourriture.get(i));
                    
                    
                    if (Joueur1.getPerso() instanceof Mage) {
                        Joueur1.getPerso().setPourcentageMag(Joueur1.getPerso().getPourcentageMag()+liste_nourriture.get(i).getValeur_bonus_malus());
                    } else {
                        Joueur1.getPerso().setPourcentageAtt(Joueur1.getPerso().getPourcentageAtt()+liste_nourriture.get(i).getValeur_bonus_malus());
                    }
                    liste_nourriture.remove(i);
                    break;
                }
                default:
                    break;
            }
            mat[Joueur1.getPerso().getPos().getX()][Joueur1.getPerso().getPos().getY()]=9;
            mat[posInitiale.getX()][posInitiale.getY()]=0;
            break;
        default:
            boolean combat;    
            do
            {   System.out.println("Veuillez choisir une position valide de créature à combattre");
            System.out.println("Taper l'absisse de la creature que vous souhaitez combattre");
            int x = sc.nextInt();
            System.out.println("Taper l'ordonnée de la creature que vous souhaitez combattre");
            int y = sc.nextInt();
            int j=0;
            while (((liste_creatures.get(j).getPos().getX())!=x) || ((liste_creatures.get(j).getPos().getY())!=(y))) {
                j++;
            }
            combat=((Combattant)(Joueur1.getPerso())).combattre(liste_creatures.get(j));
            }while(!combat);
            break;
    }
        Joueur1.getPerso().setPtMana(Joueur1.getPerso().getPtMana()-1);
        
        for (int i=0; i<liste_nuages.size(); i++) {
            for (int j=0; j<liste_creatures.size();j++) {
                if  ( (liste_creatures.get(j).getPos().getX()==liste_nuages.get(i).getPos().getX())&&(liste_creatures.get(j).getPos().getY()==liste_nuages.get(i).getPos().getY()) ) {
                    liste_nuages.get(i).combattre(liste_creatures.get(j));
                }
            }
            Point2D posInitiale = new Point2D(liste_nuages.get(i).getPos());
            liste_nuages.get(i).deplace();
            if ((liste_nuages.get(i).getPos().getX()<0) || (liste_nuages.get(i).getPos().getX()>TAILLEMONDE-1) || (liste_nuages.get(i).getPos().getY()<0) || (liste_nuages.get(i).getPos().getY()>TAILLEMONDE-1)) {
                    liste_nuages.get(i).setPos(posInitiale);
            }
            for (int j=0; j<liste_creatures.size();j++) {
                if  ( (liste_creatures.get(j).getPos().getX()==liste_nuages.get(i).getPos().getX())&&(liste_creatures.get(j).getPos().getY()==liste_nuages.get(i).getPos().getY()) ) {
                    liste_nuages.get(i).combattre(liste_creatures.get(j));
                }
            }

        }
        if (Joueur1.getPerso().getPtMana()<=0) {
            jeu=false;
            System.out.println(Joueur1.getPerso().getNom()+" n'a plus de points de mana");
        }
        if (Joueur1.getPerso().getPtVie()<=0) {
            jeu=false;
            System.out.println(Joueur1.getPerso().getNom()+" est mort");
        }
        for (int i=0; i<liste_creatures.size(); i++) {
            if (liste_creatures.get(i).getPtVie()<1) {
                mat[liste_creatures.get(i).getPos().getX()][liste_creatures.get(i).getPos().getY()]=0;
                liste_creatures.remove(i);
            }
        }
    }
    
    /**public void afficheWorld() {
        System.out.println("Le monde contient les éléments suivant:");
        for (Creature c : liste_creatures) {
            c.affiche();
            System.out.println("");
        }
        for (Objet o : liste_objets) {
            o.affiche();
            System.out.println("");
        }
    }*/
    
    
    
    public void afficheWorld() {
        System.out.println("Le monde contient les éléments suivant:");
        for (int y = 0; y < mat.length; y++) {
            System.out.print("|");
            for (int x = 0; x < mat.length; x++) {
                 
                boolean cloud = false;
                for (int i = 0; i < liste_nuages.size(); i++) {
                    if ((liste_nuages.get(i).getPos().getX() == x) && (liste_nuages.get(i).getPos().getY() == mat.length - y - 1)) {
                        cloud = true;
                    }
                }
                if (cloud) {
                    switch (mat[x][mat.length - y - 1]) {
                        case 0:
                            System.out.print((char) 27 + "[31m0" + (char) 27 + "[30m");
                            break;
                        case 1:
                            System.out.print((char) 27 + "[31m1" + (char) 27 + "[30m");
                            break;
                        case 2:
                            System.out.print((char) 27 + "[31m2" + (char) 27 + "[30m");
                            break;
                        case 3:
                            System.out.print((char) 27 + "[31m3" + (char) 27 + "[30m");
                            break;
                        case 4:
                            System.out.print((char) 27 + "[31m4" + (char) 27 + "[30m");
                            break;
                        case 9:
                            System.out.print((char) 27 + "[31mX" + (char) 27 + "[30m");
                    }
                }
                else {
                    if (mat[x][mat.length - y - 1] == 9) {
                    System.out.print((char) 27 + "[34mX" + (char) 27 + "[30m");
                    }
                    else {
                    System.out.print(mat[x][mat.length - y - 1]);
                    }
                }

                
                if (x != mat.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        System.out.println("");
        System.out.println("Points de vie du personnage: " + Joueur1.getPerso().getPtVie());
        System.out.println("Points de mana du personnage: " + Joueur1.getPerso().getPtMana());
        if (Joueur1.getPerso() instanceof Mage) {
            System.out.println("Pourcentage de magie du personnage: " + Joueur1.getPerso().getPourcentageMag());
        }
        else {
        System.out.println("Pourcentage d'attaque du personnage: " + Joueur1.getPerso().getPourcentageAtt());
        }
    }
    
        
}    
   

    
