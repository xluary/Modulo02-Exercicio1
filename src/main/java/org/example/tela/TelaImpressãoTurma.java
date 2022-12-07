package org.example.tela;

import org.example.entidades.Aluno;
import org.example.entidades.Turma;

public class TelaImpressãoTurma {
     public static void imprimirTurma(Turma turma){
         for (Aluno aluno: turma.getAlunos()) {
             System.out.printf("Nome: %s, Matrícula:  %s \t Nota 1: %.2f, Nota 2: %.2f, Média: %.2f %n", aluno.getNome(),
                     aluno.getMatricula(), aluno.getNota().getNota1(), aluno.getNota().getNota2(), aluno.getNota().getMedia());
         }
     };
}
