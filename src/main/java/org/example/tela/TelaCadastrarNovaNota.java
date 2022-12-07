package org.example.tela;

import org.example.entidades.Nota;

import java.util.Scanner;

public class TelaCadastrarNovaNota {
    public static Nota cadastrarNovaNota(Scanner scanner){
        System.out.println("Informe a nota 1 do aluno");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe a nota 2 do aluno");
        double nota2 = scanner.nextDouble();
        return new Nota(nota1, nota2);
    }
}
