package org.example.entidades;

import org.example.entidades.Aluno;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList();

    private final int LIMITEALUNOS=10;
    private int size;

    private int qAlunos;

    public Turma(String nome) {
        this.nome = nome;
    }

    public void imprimirNotasAlunos(){
        if (qAlunos == 0){
            System.out.println("Não existem alunos cadastrados!");
        } else {
            for(int i=0; i<qAlunos; i++){
                System.out.println("Nome do Aluno: " + alunos.get(i).getNome() + "      Nota 1: "+ alunos.get(i).getNota().getNota1() + "       Nota 2: "+ alunos.get(i).getNota().getNota2());
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno){
        if (size == LIMITEALUNOS){
            throw new RuntimeException("Limite de alunos atingido!");
        }
        alunos.add(aluno);
        size++;
    }
}
