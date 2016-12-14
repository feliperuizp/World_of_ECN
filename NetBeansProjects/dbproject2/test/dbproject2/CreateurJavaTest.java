/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject2;

import java.util.LinkedList;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ruizo
 */
public class CreateurJavaTest {
    
    public CreateurJavaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getEntites method, of class CreateurJava.
     */
    @Test
    public void testGetEntites() {
        System.out.println("getEntites");
        CreateurJava instance = null;
        LinkedList<EntiteJava> expResult = null;
        LinkedList<EntiteJava> result = instance.getEntites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntites method, of class CreateurJava.
     */
    @Test
    public void testSetEntites() {
        System.out.println("setEntites");
        LinkedList<EntiteJava> entites = null;
        CreateurJava instance = null;
        instance.setEntites(entites);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRelations method, of class CreateurJava.
     */
    @Test
    public void testGetRelations() {
        System.out.println("getRelations");
        CreateurJava instance = null;
        LinkedList<RelationJava> expResult = null;
        LinkedList<RelationJava> result = instance.getRelations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRelations method, of class CreateurJava.
     */
    @Test
    public void testSetRelations() {
        System.out.println("setRelations");
        LinkedList<RelationJava> relations = null;
        CreateurJava instance = null;
        instance.setRelations(relations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scan method, of class CreateurJava.
     */
    @Test
    public void testScan() {
        System.out.println("scan");
        Scanner s = null;
        int n = 0;
        CreateurJava instance = null;
        String[] expResult = null;
        String[] result = instance.scan(s, n);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lectureFichierXML method, of class CreateurJava.
     */
    @Test
    public void testLectureFichierXML() throws Exception {
        System.out.println("lectureFichierXML");
        CreateurJava instance = null;
        instance.lectureFichierXML();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creationFichiers method, of class CreateurJava.
     */
    @Test
    public void testCreationFichiers() throws Exception {
        System.out.println("creationFichiers");
        CreateurJava instance = null;
        instance.creationFichiers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
