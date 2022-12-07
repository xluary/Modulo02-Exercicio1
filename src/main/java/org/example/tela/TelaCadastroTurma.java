package org.example.tela;

import org.example.banco.BancoTurma;
import org.example.entidades.Turma;

import java.util.Scanner;

public class TelaCadastroTurma {

    public static Turma cadastrarTurma(Scanner scanner){
        System.out.println("Qual é o nome da turma?");
        String nome = scanner.next();
        final Turma turma= new Turma(nome);
        BancoTurma.addTurma(turma);
        System.out.println("Turma cadastrada!");
        return turma;
    }
}
