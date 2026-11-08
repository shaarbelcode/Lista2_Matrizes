//Ler uma matriz 3x3 de números inteiros e mostrar o maior valor digitado
package org.matrizes;

public class lista2_ex3 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int maiorValor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("Favor digitar posição [" + i + "] [" + j + "]"));

            }
        }
            for (int[] linha : matriz) {
                for (int coluna : linha) {
                    IO.print(coluna);
                    if (coluna > maiorValor) {
                        maiorValor = coluna;
                    }
                }
                IO.println();
            }IO.print("O maior numero digitado foi : " + maiorValor);
        }
    }