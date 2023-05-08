package com.mycompany.testesoftware.model;

public class Quadrado {
    
    private int base;
    private int altura;

    public Quadrado(){

    }

    public static int calcularArea(int base, int altura) throws Exception{
 
        if (base<0 || altura <0){
           throw new Exception("Não é permitido numeros negativos!");
          
        }

        return base*altura;
    }

}
