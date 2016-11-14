/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import model.ModelUsuario;
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
public class ControleUsuarioTest {
    
    public ControleUsuarioTest() {
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
     * Test of Salvar method, of class ControleUsuario.
     */
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        ModelUsuario mod = null;
        ControleUsuario instance = new ControleUsuario();
        instance.Salvar(mod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaUsuario method, of class ControleUsuario.
     */
    @Test
    public void testBuscaUsuario() {
        System.out.println("buscaUsuario");
        ModelUsuario mod = null;
        ControleUsuario instance = new ControleUsuario();
        ModelUsuario expResult = null;
        ModelUsuario result = instance.buscaUsuario(mod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Alterar method, of class ControleUsuario.
     */
    @Test
    public void testAlterar() {
        System.out.println("Alterar");
        ModelUsuario mod = null;
        ControleUsuario instance = new ControleUsuario();
        instance.Alterar(mod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Excluir method, of class ControleUsuario.
     */
    @Test
    public void testExcluir() {
        System.out.println("Excluir");
        ModelUsuario mod = null;
        ControleUsuario instance = new ControleUsuario();
        instance.Excluir(mod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
