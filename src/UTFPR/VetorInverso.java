package UTFPR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VetorInverso {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.print("Digite o tamanho do vetor: ");
            int tamanho = Integer.parseInt(br.readLine());

            int[] vetor = new int[tamanho];

            System.out.println("Digite os valores do vetor: ");

            for(int i = 0; i < tamanho; i++) {
                System.out.print("Valor " + (i+1) + ": ");
                vetor[i] = Integer.parseInt(br.readLine());
            }

            System.out.print("Vetor inverso: ");
            for(int i = (vetor.length - 1); i >=0; i--) {
                System.out.print(vetor[i] + ", ");
            }

        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }
    }
}
