/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Ruizo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({dbproject2.EntiteJavaTest.class, dbproject2.CreateurJavaTest.class, dbproject2.RelationJavaTest.class, dbproject2.ProjetApplicationTest.class})
public class Dbproject2Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
