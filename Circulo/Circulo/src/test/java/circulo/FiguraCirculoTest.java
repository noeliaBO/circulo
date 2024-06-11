/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class FiguraCirculoTest {
    
    public FiguraCirculoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of establecerX method, of class Circulo.
     */
    @Test
    public void testEstablecerX() {
        System.out.println("establecerX");
        int valorX = 0;
        FiguraCirculo instance = new FiguraCirculo();
        instance.setCoordenadaX(valorX);

    }

    /**
     * Test of obtenerX method, of class Circulo.
     */
    @Test
    public void testObtenerX() {
        System.out.println("obtenerX");
        FiguraCirculo instance = new FiguraCirculo(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);

    }

    /**
     * Test of establecerY method, of class Circulo.
     */
    @Test
    public void testEstablecerY() {
        System.out.println("establecerY");
        int valorY = 0;
        FiguraCirculo instance = new FiguraCirculo();
        instance.setCoordenadaY(valorY);

    }

    /**
     * Test of obtenerY method, of class Circulo.
     */
    @Test
    public void testObtenerY() {
        System.out.println("obtenerY");
        FiguraCirculo instance = new FiguraCirculo(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);

    }

    /**
     * Test of establecerRadio method, of class Circulo.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("establecerRadio");
        FiguraCirculo instance = new FiguraCirculo();
        instance.setCoordenadaX(0);
        instance.setRadio(0.1);
    }

    /**
     * Test of obtenerRadio method, of class Circulo.
     */
    @Test
    public void testObtenerRadio() {
        System.out.println("obtenerRadio");
        FiguraCirculo instance = new FiguraCirculo(0,0,0.1);
        double expResult = 0.0;
        double result = instance.getRadio();
        assertEquals(0.1, result, 1e-6);

        instance.setRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,1e-6);
    }

    /**
     * Test of obtenerDiametro method, of class Circulo.
     */
    @Test
    public void testObtenerDiametro() {
        System.out.println("obtenerDiametro");
        FiguraCirculo instance = new FiguraCirculo(0,0,0.1);
        double expResult = 0.0;
        double result = instance.obtenerDiametro();
        assertEquals(0.2, result,1e-6);

    }

    /**
     * Test of obtenerCircunferencia method, of class Circulo.
     */
    @Test
    public void testObtenerCircunferencia() {
        System.out.println("obtenerCircunferencia");
        FiguraCirculo instance = new FiguraCirculo(0,0,0.1);
        double expResult = 0.6283185;;
        double result = instance.obtenerCircunferencia();
        assertEquals(expResult, result, 1e-6);

    }

    /**
     * Test of obtenerArea method, of class Circulo.
     */
    @Test
    public void testAreaFiguraCirculo() {
        System.out.println("obtenerArea");
        FiguraCirculo instance = new FiguraCirculo(0,0,0.1);
        double expResult =  0.0314159;
        double result = instance.obtenerArea();
        assertEquals(expResult, result, 1e-6);

    }


    /**
     * Test of trasladarCentro method, of class Circulo.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
  FiguraCirculo instance = new FiguraCirculo();
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro(5,5);
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+5, resultny);

    }
    
}
