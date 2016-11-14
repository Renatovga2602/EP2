/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import model.ModelBebida;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renato
 */
public class ControleBebidaTest {
    
    public ControleBebidaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Salvar method, of class ControleBebida.
     */
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        ModelBebida mod = null;
        ControleBebida instance = new ControleBebida();
        instance.Salvar(mod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Alterar method, of class ControleBebida.
     */
    @Test
    public void testAlterar() {
        System.out.println("Alterar");
        ModelBebida mod = null;
        ControleBebida instance = new ControleBebida();
        instance.Alterar(mod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Excluir method, of class ControleBebida.
     */
    @Test
    public void testExcluir() {
        System.out.println("Excluir");
        ModelBebida mod = null;
        ControleBebida instance = new ControleBebida();
        instance.Excluir(mod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaBebida method, of class ControleBebida.
     */
    @Test
    public void testBuscaBebida() {
        System.out.println("buscaBebida");
        ModelBebida mod = null;
        ControleBebida instance = new ControleBebida();
        ModelBebida expResult = null;
        ModelBebida result = instance.buscaBebida(mod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
