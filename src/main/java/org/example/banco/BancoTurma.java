package org.example.banco;

import org.example.entidades.Turma;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class BancoTurma {
    private static ArrayList<Turma> turmas;

    private BancoTurma(){
        turmas= new ArrayList<>();
    }

    public static Optional<Turma> procurarPorNome(String nome){
        for(Turma turma: turmas){
            if(turma.getNome().equals(nome)){
                return Optional.of(turma);
            }
        }
        return Optional.empty();
    }

    public static void addTurma(Turma turma){
        if(Objects.isNull(turmas)){
            turmas= new ArrayList<>();
        }
        turmas.add(turma);
    }
}
