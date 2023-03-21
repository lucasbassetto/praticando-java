package com.lucas.cadastroaluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opc, qtdNotas;
        double nota = 0;
        String nome, cpf;

        Sala sala = new Sala();

        do {
            System.out.println("\n-------------------");
            System.out.println("      MENU");
            System.out.println("Escolha a opção");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Listar alunos: ");
            System.out.println("3 - Situações: ");
            System.out.println("0 - Sair");

            opc = sc.nextInt();
            sc.nextLine(); // LIMPANDO BUFFER

            switch(opc) {
                case 1:
                    System.out.print("\nNome: ");
                    nome = sc.nextLine();
                    System.out.print("CPF: ");
                    cpf = sc.nextLine();

                    Aluno novoAluno = new Aluno(nome, cpf); // instanciação do aluno criado

                    System.out.print("Quantas notas? ");
                    qtdNotas = sc.nextInt();

                    for(int i =0; i < qtdNotas; i++) {
                        System.out.print("Nota " + (i+1) + ": ");
                        nota = sc.nextDouble();
                        novoAluno.inserirNotas(nota);
                    }
                    sala.inserirAluno(novoAluno);
                    break;

                case 2:
                    sala.listarAlunos();
                    break;

                case 3:
                    sala.listarSituacoes();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (opc != 0);


    }
}
