package com.lucas.cadastroaluno;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private String cpf;
    String situacao = "reprovado";
    private Double total = 0.0;

    private ArrayList<Double> listaNotas = new ArrayList<>();

    public Aluno() {

    }

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }


    public void inserirNotas(Double nota) {
        listaNotas.add(nota);
    }

    public void listar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);

        for(int i = 0; i < listaNotas.size(); i++) {
            System.out.println("Nota " + (i+1) + ": " + this.listaNotas.get(i));
        }
    }

    public void calcularNota() {
        for(Double nota: listaNotas) {
            this.total += nota;
        }

        if(total >= 70) {
            this.situacao = "aprovado";
        } else
           this.situacao = "reprovado";
    }

    public void mostraSituacoes() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Total: " + this.total);
        System.out.println("Situação: " + this.situacao);
    }
}
