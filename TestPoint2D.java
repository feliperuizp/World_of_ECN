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
public class TestPoint2D {

    
    public static void main(String[] args) {
        
        Point2D test1 = new Point2D();
        Point2D test2 = new Point2D(5,4);
        Point2D test3 = new Point2D(test2);

        System.out.println("On affiche test1 = Point2D()");
        test1.affiche();
        System.out.println("On affiche test2 = Point2D(5,4)");
        test2.affiche();
        System.out.println("On affiche test3 = Point2D(test2)");
        test3.affiche();
        

        test1.translate(5, 10);
        test2.translate(5 , 10);
        test3.translate(4, 3);
        
        System.out.println("On affiche test1 translate(5, 10)");
        test1.affiche();
        System.out.println("On affiche test2 translate(5, 10)");
        test2.affiche();
        System.out.println("On affiche test3 translate(4,3)");
        test3.affiche();
        
        test1.setPosition(2,2);
        test2.setPosition(2,2);
        test3.setPosition(4,4);
        
        System.out.println("On affiche test1 setPosition(2,2)");
        test1.affiche();
        System.out.println("On affiche test2 setPosition(2,2)");
        test2.affiche();
        System.out.println("On affiche test3 setPosition(4,4)");
        test3.affiche();     
        
        
    }
    
}
