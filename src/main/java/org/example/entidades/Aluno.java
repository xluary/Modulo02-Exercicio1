package org.example.entidades;

import java.util.UUID;

public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private Nota nota;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.matricula = UUID.randomUUID().toString();
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }
}
