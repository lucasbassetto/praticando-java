package Vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++) {
            System.out.println("Digite a altura: ");
            double altura = sc.nextDouble();
            vect[i] = altura;
        }
        System.out.println(Arrays.toString(vect));

        double soma = 0;
        for(int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }

        double media = soma / n;

        System.out.println("Media: " + media);

//        int n = sc.nextInt();
//
//        double[] array = new double[n];
//
//        for(int i = 0; i < array.length; i++) {
//            array[i] = sc.nextDouble();
//        }
//
//        System.out.println("Vetor: " + Arrays.toString(array));
//
//        System.out.print("Vetor inverso: ");
//        for(int i = (array.length -1); i >= 0; i--) {
//            System.out.print(array[i] + ", ");
//        }

    }
}
