/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.testesoftware.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ftfer
 */
public class CirculoTest {
    
    public CirculoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalcularArea() {
        
        double area = Circulo.calcularArea();
        System.out.println(area);
        
    }
    
    @Test
    public void testCalcularAreaComParametros() {
        
        double area = Circulo.calcularArea(5);
        System.out.println(area);
        
    }
    
}
