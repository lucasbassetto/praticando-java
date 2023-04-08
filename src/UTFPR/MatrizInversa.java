package UTFPR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatrizInversa {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Digite o número de linhas da matriz: ");
            int linhas = Integer.parseInt(br.readLine());

            System.out.print("Digite o número de colunas da matriz: ");
            int colunas = Integer.parseInt(br.readLine());

            int[][] matriz = new int[linhas][colunas];

            System.out.println("Digite os valores: ");

            for(int i = 0; i < linhas; i++) {
                for(int j = 0; j < colunas; j++) {
                    System.out.print("Valor [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = Integer.parseInt(br.readLine());
                }
            }

            System.out.println("\nMatriz digitada:");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nMatriz inversa: ");

            for (int i = linhas - 1; i >= 0; i--) {
                for (int j = colunas - 1; j >= 0; j--) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }

        catch(IOException e){
            System.out.println("Erro de entrada");
        }
    }
}
