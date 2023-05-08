package com.mycompany.testesoftware.model;

import java.util.Scanner;

public class MatrizDeInteiros {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Informe o número de linhas da matriz: ");
        int n = entrada.nextInt();
        
        System.out.println("Informe o número de colunas da matriz: ");
        int m = entrada.nextInt();
        int matriz[][] = new int[n][m];
        
        leitura(matriz);
        
        System.out.println("\nO maior valor na matriz é: " + maximo(matriz));
        
        impressao(matriz);
        System.out.println(maximo(matriz));

    }

    private static void leitura(int[][] matriz2D) {
        for (int i = 0; i < matriz2D.length; i++) {
            for (int j = 0; j < matriz2D[0].length; j++) {
                System.out.println("Digite o valor de [" + i + "][" + j + "]: ");
                matriz2D[i][j] = entrada.nextInt();
            }
        }
    }

    public static int maximo(int[][] matriz2D) {
        int max = 0;
        
        for (int[] vetor : matriz2D) {
            for(int item: vetor){
                if(item > max)
                    max = item;
                }
        }
    return max;
}
    private static void impressao(int[][] matriz2D) {
        System.out.println("\nValores informados...");
        for (int[] vetor : matriz2D) {
            for (int item : vetor) {
                System.out.print(item + "\t");
            }
                System.out.println();
        }
    }
}