package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m = 3, n = 3;
        int menor = 999999999;

        int [][] matriz1 = new  int[m][n];
        //declarando uma matriz sem inicialização//
        //matriz1[0][0] = 20;
        // matriz1[0][0] = 30;
        //declarando uma matriz com inicialização//
        //int[][] matriz2 = {{10,20,30}, {50,60,70}, {100,200,300}};
        
        Scanner entr = new Scanner(System.in);
        int valor;

        //preenchendo uma matriz com ciclos repetitivos//
        for (int i =0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.println("Digite um valor inteiro para a posição" + i +"," + j);
                matriz1[i][j] = entr.nextInt();
            }
        }

        //imprimidno a matriz
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matriz1[i][j]+ " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < m; i++){
            for (int j =0; j < n; j++){
                if (matriz1[i][j] < menor){
                    menor = matriz1[i][j];
                }
            }
        }
        System.out.println("O menor valor da matriz é: " + menor);
        System.out.println("fila: " + matriz1.length);
        System.out.println("Colunas: " + matriz1[0].length);

    }
}
