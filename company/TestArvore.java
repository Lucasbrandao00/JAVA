package com.company;

public class TestArvore {
        public static void main(String[] args) {

            Arvore arvore1 = new Arvore();
            Arvore arvore2 = new Arvore();

            arvore1.alocandoNO(10);
            arvore1.alocandoNO(20);
            arvore1.alocandoNO(25);
            arvore1.alocandoNO(6);
            arvore1.alocandoNO(1);


            arvore2.inserir(10);
            arvore2.inserir(20);
            arvore2.inserir(25);
            arvore2.inserir(6);
            arvore2.inserir(1);

            arvore2.mostrar();

            System.out.println("=========================================");

            System.out.println("\nNO removido e substituido\n");

            arvore2.remover(10);

            arvore2.mostrar();


        }
    }