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
public class RelationJavaTest {
    
    public RelationJavaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNom method, of class RelationJava.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        RelationJava instance = new RelationJava();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class RelationJava.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        RelationJava instance = new RelationJava();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeAttributs method, of class RelationJava.
     */
    @Test
    public void testGetTypeAttributs() {
        System.out.println("getTypeAttributs");
        RelationJava instance = new RelationJava();
        LinkedList<String> expResult = null;
        LinkedList<String> result = instance.getTypeAttributs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTypeAttributs method, of class RelationJava.
     */
    @Test
    public void testSetTypeAttributs() {
        System.out.println("setTypeAttributs");
        LinkedList<String> typeAttributs = null;
        RelationJava instance = new RelationJava();
        instance.setTypeAttributs(typeAttributs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeAttributs method, of class RelationJava.
     */
    @Test
    public void testGetListeAttributs() {
        System.out.println("getListeAttributs");
        RelationJava instance = new RelationJava();
        LinkedList<String> expResult = null;
        LinkedList<String> result = instance.getListeAttributs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListeAttributs method, of class RelationJava.
     */
    @Test
    public void testSetListeAttributs() {
        System.out.println("setListeAttributs");
        LinkedList<String> listeAttributs = null;
        RelationJava instance = new RelationJava();
        instance.setListeAttributs(listeAttributs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeEntites method, of class RelationJava.
     */
    @Test
    public void testGetListeEntites() {
        System.out.println("getListeEntites");
        RelationJava instance = new RelationJava();
        LinkedList<EntiteJava> expResult = null;
        LinkedList<EntiteJava> result = instance.getListeEntites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListeEntites method, of class RelationJava.
     */
    @Test
    public void testSetListeEntites() {
        System.out.println("setListeEntites");
        LinkedList<EntiteJava> listeEntites = null;
        RelationJava instance = new RelationJava();
        instance.setListeEntites(listeEntites);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeCardinalites method, of class RelationJava.
     */
    @Test
    public void testGetListeCardinalites() {
        System.out.println("getListeCardinalites");
        RelationJava instance = new RelationJava();
        LinkedList<String> expResult = null;
        LinkedList<String> result = instance.getListeCardinalites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListeCardinalites method, of class RelationJava.
     */
    @Test
    public void testSetListeCardinalites() {
        System.out.println("setListeCardinalites");
        LinkedList<String> listeCardinalites = null;
        RelationJava instance = new RelationJava();
        instance.setListeCardinalites(listeCardinalites);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
