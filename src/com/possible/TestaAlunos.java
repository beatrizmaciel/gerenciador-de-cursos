package com.possible;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
            alunos.add("Anakin");
            alunos.add("Yoda");
            alunos.add("Han Solo");
            alunos.add("Lea");
            alunos.add("R2D2");
            alunos.add("C3PO");

        System.out.println(alunos);

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        // em cima e embaixo produzem a mesma saída
        // embaixo usando lambda
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

    }

}

/**
 * A diferença do Set e do List é que listas são ordenadas,
 * enquanto sets são desordenadas. Guardam os elementos, mas
 * embaralham a ordem. Servem mais como uma sacola do que como
 * elementos concatenados.
 * O set também não imprime elementos repetidos.
 */