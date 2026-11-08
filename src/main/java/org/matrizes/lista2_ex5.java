//Ler uma matriz 3x3 de números inteiros e mostrar os elementos da
//diagonal principal, que são as posições em que a linha é igual à coluna: [0][0], [1][1] e [2][2].

package org.matrizes;

public class lista2_ex5 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("Me fale o numero da posição : [" + i + "] [" + j + "]"));
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    IO.println(matriz[i][j]);
                }
            }
        }
    }
}
