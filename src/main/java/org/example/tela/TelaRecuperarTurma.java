package org.example.tela;

import org.example.banco.BancoTurma;
import org.example.entidades.Turma;

import java.util.Optional;
import java.util.Scanner;

public class TelaRecuperarTurma {

    public static Turma recuperarTurma(Scanner scanner) {
        System.out.println("Informa o nome da turma:");
       // BancoTurma bancoTurma = new BancoTurma();

        return  BancoTurma.procurarPorNome(scanner.next()).orElseThrow(() -> new RuntimeException("Turma não encontrada"));
    }
}
