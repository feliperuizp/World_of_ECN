/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject2;

import java.util.LinkedList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ruizo
 */
public class EntiteJavaTest {
    
    public EntiteJavaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNom method, of class EntiteJava.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        EntiteJava instance = new EntiteJava();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class EntiteJava.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        EntiteJava instance = new EntiteJava();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeAttributs method, of class EntiteJava.
     */
    @Test
    public void testGetListeAttributs() {
        System.out.println("getListeAttributs");
        EntiteJava instance = new EntiteJava();
        LinkedList<String> expResult = null;
        LinkedList<String> result = instance.getListeAttributs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListeAttributs method, of class EntiteJava.
     */
    @Test
    public void testSetListeAttributs() {
        System.out.println("setListeAttributs");
        LinkedList<String> listeAttributs = null;
        EntiteJava instance = new EntiteJava();
        instance.setListeAttributs(listeAttributs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeAttributs method, of class EntiteJava.
     */
    @Test
    public void testGetTypeAttributs() {
        System.out.println("getTypeAttributs");
        EntiteJava instance = new EntiteJava();
        LinkedList<String> expResult = null;
        LinkedList<String> result = instance.getTypeAttributs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTypeAttributs method, of class EntiteJava.
     */
    @Test
    public void testSetTypeAttributs() {
        System.out.println("setTypeAttributs");
        LinkedList<String> typeAttributs = null;
        EntiteJava instance = new EntiteJava();
        instance.setTypeAttributs(typeAttributs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
