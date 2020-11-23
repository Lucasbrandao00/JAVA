package com.company;

public class Arvore {
    public NoArvore raiz_P;

    public Arvore() {
        this.raiz_P = null;
    }
    
    public void inserir(int valor) {
        raiz_P = inserirRecur(raiz_P, valor);
    }

    private NoArvore inserirRecur(NoArvore nova_raiz, int valor) {

        if (nova_raiz == null) {
            return new NoArvore(valor);
        } else {
            if (valor < nova_raiz.valor) {
                nova_raiz.esquerda = inserirRecur(nova_raiz.esquerda, valor);
            } else {
                nova_raiz.direita = inserirRecur(nova_raiz.direita, valor);
            }
        }
        return nova_raiz;
    }
    

    
    public void alocandoNO(int valor) {
        if (raiz_P == null) {
            raiz_P = new NoArvore(valor);
        } else {

            NoArvore nova_raiz = raiz_P;
            
            while (true) {

                if (valor < nova_raiz.valor) {
                    if (nova_raiz.esquerda == null) {
                        nova_raiz.esquerda = new NoArvore(valor);
                        return;
                    } else {
                        nova_raiz = nova_raiz.esquerda;
                    }
                } else
                    if (nova_raiz.direita == null) {
                        nova_raiz.direita = new NoArvore(valor);
                        return;
                    } else {
                        nova_raiz = nova_raiz.direita;
                    }
            }
        }
    }
    
    public void mostrar() {
        mostrarArvore(raiz_P, 0);
    }

    private void mostrarArvore(NoArvore novo_raiz, int cont) {

        if (novo_raiz != null) {
            mostrarArvore(novo_raiz.direita, cont + 1);

            for (int i = 0; i < cont; i++) {
                System.out.print(" ");
            }

            System.out.println(novo_raiz.valor);
            mostrarArvore(novo_raiz.esquerda, cont + 1);
        }
    }

  
    public void remover(int valor) {
        NoArvore ecoNO = raiz_P;
        NoArvore princinpalNO = raiz_P;
        boolean descendenteEsquerda = true;

        while (ecoNO.valor != valor) {
            princinpalNO = ecoNO;
            if (valor < ecoNO.valor) {
                descendenteEsquerda = true;
                ecoNO = ecoNO.esquerda;
            } else {
                descendenteEsquerda = false;
                ecoNO = ecoNO.direita;
            }
            if (ecoNO == null)
                return;
        }

        if (ecoNO.esquerda == null && ecoNO.direita == null) {
            if (ecoNO == raiz_P)
                raiz_P = null;
            else if (descendenteEsquerda)
                princinpalNO.esquerda = null;
            else
                princinpalNO.direita = null;
        } else if (ecoNO.direita == null)
            if (ecoNO == raiz_P)
                raiz_P = ecoNO.esquerda;
            else if (descendenteEsquerda)
                princinpalNO.esquerda = ecoNO.esquerda;
            else
                princinpalNO.direita = ecoNO.esquerda;

        else if (ecoNO.esquerda == null)
            if (ecoNO == raiz_P)
                raiz_P = ecoNO.direita;
            else if (descendenteEsquerda)
                princinpalNO.esquerda = ecoNO.direita;
            else
                princinpalNO.direita = ecoNO.direita;

        else {
            NoArvore posterior = getSuccessor(ecoNO);
            if (ecoNO == raiz_P)
                raiz_P = posterior;
            else if (descendenteEsquerda)
                princinpalNO.esquerda = posterior;
            else
                princinpalNO.direita = posterior;

            posterior.esquerda = ecoNO.esquerda;
        }
    }

    public NoArvore getSuccessor(NoArvore del) {
        NoArvore posteriorPai = del;
        NoArvore successor = del;
        NoArvore current = del.direita;

        while (current != null) {
            posteriorPai = successor;
            successor = current;
            current = current.esquerda;
        }
        if (successor != del.direita) {
            posteriorPai.esquerda = successor.direita;
            successor.direita = del.direita;
        }
        return successor;
    }
}