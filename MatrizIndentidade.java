package com.company;

public class MatrizIndentidade {
        public static void main(String[] args) {
            int[][] ID = new int[5][5];

            for (int L = 0; L < ID.length; L++) {
                for (int coluna = 0; coluna < ID[L].length; coluna++) {
                    if(L == coluna ){
                        ID[L][coluna] = 1;
                    } else {
                        ID[L][coluna] = 0;
                    }
                }
            }
            for (int L = 0; L < ID.length; L++) {
                for (int coluna = 0; coluna < ID[L].length; coluna++) {
                    System.out.print(ID[L][coluna] + " ");
                }
                System.out.println("");
            }
        }
    }



