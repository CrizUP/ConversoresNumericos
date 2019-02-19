/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionsegura;

import conversorromanos.UtileriaRomanos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CrizUP
 */
public class UtileriasRomanosTest {
    
    public UtileriasRomanosTest() {
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
     * Test of covertirRomanos method, of class Utilerias.
     */
    @Test
    public void testCovertirRomanos() {
        int numero = 0;
        String expResult = UtileriaRomanos.MENSAJE;
        String result = UtileriaRomanos.covertirRomanos(numero);
        assertEquals(expResult, result);
    }
    @Test
    public void testCovertirRomanosNumeroNegativo() {
        int numero = -10;
        String expResult = UtileriaRomanos.MENSAJE;
        String result = UtileriaRomanos.covertirRomanos(numero);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCovertirRomanosMuyGrande() {
        int numero = 22000;
        String expResult = UtileriaRomanos.MENSAJE;
        String result = UtileriaRomanos.covertirRomanos(numero);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCovertirLimite() {
        int numero = 3999;
        String expResult = "MMMCMXCIX";
        String result = UtileriaRomanos.covertirRomanos(numero);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCovertirDecenas() {
        int numero = 30;
        String expResult = "XXX";
        String result = UtileriaRomanos.covertirRomanos(numero);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCovertirCentenas() {
        int numero = 400;
        String expResult = "CD";
        String result = UtileriaRomanos.covertirRomanos(numero);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCovertirMiles() {
        int numero = 2000;
        String expResult = "MM";
        String result = UtileriaRomanos.covertirRomanos(numero);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCovertirDigitos() {
        int numero = 6;
        String expResult = "VI";
        String result = UtileriaRomanos.covertirRomanos(numero);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCovertirCombinados() {
        int numero = 1496;
        String expResult = "MCDXCVI";
        String result = UtileriaRomanos.covertirRomanos(numero);
        assertEquals(expResult, result);
    }
}
