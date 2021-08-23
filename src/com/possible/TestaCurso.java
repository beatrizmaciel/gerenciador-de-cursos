package com.possible;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções",
                "Paulo Silveira");

//        javaColecoes.getAulas().add(new Aula("Trabalhao com Arrays", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Revisando ArrayList", 11));
        javaColecoes.adiciona(new Aula("Detalhes da ArrayList", 21));
        System.out.println(javaColecoes.getAulas());

    }

}
