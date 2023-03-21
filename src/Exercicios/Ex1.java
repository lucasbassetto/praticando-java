package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdPar = 0;
        int qtdImpar = 0;

        System.out.print("Digite a quantidade de numero: ");
        int qtdNum = sc.nextInt();

        for(int i = 0; i < qtdNum; i++) {
            System.out.print("Digite o numero: ");
            int num = sc.nextInt();

            if(num % 2 == 0) {
                System.out.println("O num é par.");
                qtdPar++;
            } else {
                System.out.println("O numero é impar.");
                qtdImpar++;
            }
        }

        System.out.println("Quantidade par: " + qtdPar);
        System.out.println("Quantidade impar: " + qtdImpar);
    }
}
