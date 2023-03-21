package ControleDeFluxo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        double salarioMensal = 1500;
//        double medioSalario = 3000;
//
//        int qtdDependentes = 4;
//        int mediaDependentes = 2;
//
//
//        boolean salarioBaixo = salarioMensal < medioSalario;
//        boolean muitosDependentes = qtdDependentes >= mediaDependentes;
//
//        if((salarioBaixo) && (muitosDependentes)) {
//            System.out.println("Funcionario deve receber auxiolio");
//        }

        int numero = sc.nextInt();

        switch(numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("ERRADO");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }

    }
}
