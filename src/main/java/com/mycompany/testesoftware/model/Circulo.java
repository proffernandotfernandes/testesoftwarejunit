/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testesoftware.model;

/**
 *
 * @author ftfer
 */
public class Circulo {
    
    static int raio = 10;
    
    public static double calcularArea(){
    
        return Math.PI * (raio * raio);
    }
    
    public static double calcularArea(double novoRaio){
    
        return Math.PI * (novoRaio * novoRaio);
    }
    
}
