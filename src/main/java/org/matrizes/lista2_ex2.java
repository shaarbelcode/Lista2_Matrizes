//Ler uma matriz 3x3 de números inteiros e mostrar a soma de todos os
//elementos.
package org.matrizes;

public class lista2_ex2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        double soma = 0;

        for(int i = 0; i < matriz.length; i++) {
            for(int j=0;j<matriz.length;j++){
            matriz[i][j]=Integer.parseInt(IO.readln("Digite os numeros da sequência : [" +i+ "] [" +j+ "]: "));
            }
        }
        for(int[] linha : matriz){
            for(int coluna : linha){
                soma+=coluna;
                IO.print(coluna);
            }
            IO.println();
        }
            IO.println("A soma da matriz é : " + soma);
    }
}



