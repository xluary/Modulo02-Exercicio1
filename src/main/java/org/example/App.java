package org.example;


import org.example.entidades.Aluno;
import org.example.entidades.Turma;
import org.example.tela.*;

import java.util.Scanner;

public class App
{

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de matrícula");

        int opcao = 0;
        do {
            System.out.println("(1) -  Cadastrar Turma \n(2) -  Cadastrar Aluno \n(3) -  Imprimir alunos da turma \n(0) -  Sair");
            opcao = scanner.nextInt();
            Turma turma = null;
            switch (opcao) {
                case 1:
                    turma = TelaCadastroTurma.cadastrarTurma(scanner);
                    break;
                case 2:
                    turma = TelaRecuperarTurma.recuperarTurma(scanner);
                    boolean proximo = false;
                    do {
                        Aluno aluno = TelaCadastroAluno.cadastrarAluno(scanner);
                        aluno.setNota(TelaCadastrarNovaNota.cadastrarNovaNota(scanner));
                        turma.adicionarAluno(aluno);
                        System.out.println("Deseja cadastrar outro aluno (S) Sim; (N) Não");

                        proximo = scanner.next().equalsIgnoreCase("s");
                    } while (proximo);
                    break;
                case 3:
                    turma = TelaRecuperarTurma.recuperarTurma(scanner);
                    TelaImpressãoTurma.imprimirTurma(turma);
                    break;
                case 0:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                   System.out.println("Valor informado de forma incorreta");
            }

        } while (opcao != 0);

    }
}
