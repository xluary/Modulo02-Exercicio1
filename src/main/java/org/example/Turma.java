package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList();

    private int qAlunos;

    public Turma(String nome) {
        this.nome = nome;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quanto alunos existem na turma?");
        this.qAlunos = entrada.nextInt();

        for(int i=0; i<qAlunos; i++){
            cadastrarAluno();
        }

    }

    public void imprimirNotasAlunos(){
        if (qAlunos == 0){
            System.out.println("Não existem alunos cadastrados!");
        } else {
            for(int i=0; i<qAlunos; i++){
                System.out.println(" Nome do Aluno: "+ alunos.get(i).getNome() + " Nota 1: "+ alunos.get(i).getNota().getNota1() + " Nota 2: "+ alunos.get(i).getNota().getNota2());
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

    public void cadastrarAluno() {
        System.out.println("------------Novo cadastro ---------------");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = entrada.next();

        System.out.println("Digite a matrícula do aluno: ");
        String matricula = entrada.next();

        System.out.println("Digite a idade do aluno: ");
        int idade = entrada.nextInt();

        System.out.println("Qual a primeira nota? ");
        double nota1 = entrada.nextDouble();

        System.out.println("Qual a segunda nota? ");
        double nota2 = entrada.nextDouble();

        Nota nota = new Nota(nota1, nota2);
        Aluno aluno = new Aluno(nome, matricula, idade);
        aluno.setNota(nota);
        alunos.add(aluno);

    }
}
