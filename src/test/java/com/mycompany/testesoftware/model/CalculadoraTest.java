/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.testesoftware.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ftfer
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando os testes da classe calculadora...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando os testes da classe calculadora...");
    }
    
    @Before
    public void setUp() {
        System.out.println("Iniciando os testes de um método...");
    }
    
    @After
    public void tearDown() {
        System.out.println("Finalizando os testes de um método...");
    }

    @Test
    public void testAdicionar() {
        System.out.println("adicionar");
        int a = 5;
        int b = 3;
        
        Calculadora instance = new Calculadora();
        int expResult = 8;
        int result = instance.adicionar(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int a = 5;
        int b = 3;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        int result = instance.subtrair(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
