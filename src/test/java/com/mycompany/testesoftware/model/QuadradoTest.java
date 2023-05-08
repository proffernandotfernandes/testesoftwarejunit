/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.testesoftware.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuadradoTest {
    
    public QuadradoTest() {
    }

    @Test
    public void testarArea(){
        int base = 10;
        int altura =20;
        try {
            Quadrado.calcularArea(base, altura);
        } catch (Exception e) {
        }
    }

    @Test
    public void testarAreaNegativa(){
        int base = -10;
        int altura = 20;
    }
    
}
