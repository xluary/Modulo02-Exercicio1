package org.example.tela;

import org.example.entidades.Aluno;

import java.util.Scanner;

public class TelaCadastroAluno {

    public static Aluno cadastrarAluno (Scanner scanner){

        System.out.println("------------Novo cadastro ---------------");

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();

        System.out.println("Digite a idade do aluno: ");
        int idade = scanner.nextInt();
        return new Aluno (nome, idade);
    }
}
