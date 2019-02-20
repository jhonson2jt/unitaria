/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cpe
 */
public class metodosTest {
    
    public metodosTest() {
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
     * Test of llenarVectores method, of class metodos.
     */
    @Test
    public void testLlenarVectores() {
        System.out.println("llenarVectores");
        int n = 0;
        int[] codigo = null;
        float[] nota1 = null;
        float[] nota2 = null;
        float[] nota3 = null;
        metodos instance = new metodos();
        instance.llenarVectores(n, codigo, nota1, nota2, nota3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of promedio method, of class metodos.
     */
    @Test
    public void testPromedio() {
        System.out.println("promedio");
        float[] nota1 = null;
        float[] nota2 = null;
        float[] nota3 = null;
        float[] definitiva = null;
        metodos instance = new metodos();
        instance.promedio(nota1, nota2, nota3, definitiva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class metodos.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        int x = 0;
        int[] codigo = null;
        float[] nota1 = null;
        float[] nota2 = null;
        float[] nota3 = null;
        float[] definitiva = null;
        metodos instance = new metodos();
        instance.imprimir(x, codigo, nota1, nota2, nota3, definitiva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarNota method, of class metodos.
     */
    @Test
    public void testValidarNota() {
        System.out.println("validarNota");
        float x = 3.5F;
        metodos instance = new metodos();
        boolean expResult = true;
        boolean result = instance.validarNota(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
              if(result !=expResult){
        fail("The test case is a prototype.");
    }
    }
    /**
     * Test of buscarPosicion method, of class metodos.
     */
    @Test
    public void testBuscarPosicion() {
        System.out.println("buscarPosicion");
        int x = 4;
        int[] codigo = {1,2,3,4,5};
        metodos instance = new metodos();
        int expResult = 3;
        int result = instance.buscarPosicion(x, codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
                      if(result !=expResult){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of validarCodigoEstudiante method, of class metodos.
     */
    @Test
    public void testValidarCodigoEstudiante() {
        System.out.println("validarCodigoEstudiante");
        int x = 0;
        int[] codigo = null;
        metodos instance = new metodos();
        boolean expResult = false;
        boolean result = instance.validarCodigoEstudiante(x, codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mayorNota method, of class metodos.
     */
    @Test
    public void testMayorNota() {
        System.out.println("mayorNota");
        int[] codigo = null;
        float[] definitiva = null;
        metodos instance = new metodos();
        instance.mayorNota(codigo, definitiva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menorNota method, of class metodos.
     */
    @Test
    public void testMenorNota() {
        System.out.println("menorNota");
        int[] codigo = null;
        float[] definitiva = null;
        metodos instance = new metodos();
        instance.menorNota(codigo, definitiva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
