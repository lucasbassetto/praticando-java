package com.lucas.cadastroaluno;

import java.util.ArrayList;
import java.util.List;

public class Sala {

    private List<Aluno> listaAlunos = new ArrayList<>();

    public Sala() {

    }

    public Sala(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public void inserirAluno(Aluno aluno) {
        aluno.calcularNota();
        listaAlunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("--------- Lista de alunos ---------");

        for(Aluno a : listaAlunos) {
            a.listar();
        }
    }

    public void listarSituacoes() {
        System.out.println("--------- Situações ---------");

        for(Aluno a : listaAlunos) {
            a.mostraSituacoes();
        }
    }
}
