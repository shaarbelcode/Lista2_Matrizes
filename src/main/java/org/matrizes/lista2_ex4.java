//Ler uma matriz 2x3 (2 linhas e 3 colunas) de números inteiros e mostrar
//quantos números pares foram digitados.

package org.matrizes;

public class lista2_ex4 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int par = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("Me fale os numeros da posição : [" + i + "] [" + j + "]"));
            }
        }
            for (int[] linha : matriz) {
                for (int coluna : linha) {
                    IO.print(coluna);
                    if (coluna%2==0){
                        par++;
                    }
                }
                IO.println();
            }IO.println("Teve " +par+ " numeros pares na matriz");
        }
    }

