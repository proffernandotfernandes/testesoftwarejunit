/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.testesoftware.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrizDeInteirosTest {
    
    public MatrizDeInteirosTest() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Inicializando...");
    }
    
    @After
    public void tearDown() {
        System.out.println("Teste Finalizado!");
    }

    @Test
    public void testarMaximoInteirosPositivos(){

        int matriz1[][];
        matriz1 = new int[3][3];
        int numero = 0;
        
        //Crio uma matriz de inteiros positivos de 0 a 8
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = numero++;
            }
        }

        //Exibo o conteúdo da matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + "\t") ;
            }
            System.out.println("\n");
        }
      
        //Confiro se o valor esperador está correto 8
        assertEquals(8, MatrizDeInteiros.maximo(matriz1));
        

    }

    @Test
    public void testarMaximoInteirosNegativos(){

        int matriz1[][];
        matriz1 = new int[3][3];
        int numero = 0;
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = numero--;
            }
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + "\t") ;
            }
            System.out.println("\n");
        }
      
        assertEquals(-1, MatrizDeInteiros.maximo(matriz1));

    }
    
}
