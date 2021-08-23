package com.possible;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Revisando ArrayList", 11));
        javaColecoes.adiciona(new Aula("Detalhes da ArrayList", 21));

        List<Aula> aulasImutavel = javaColecoes.getAulas();
        System.out.println(aulasImutavel);

        List<Aula> aulas = new ArrayList<>(aulasImutavel);
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);
    }

    /**
     * Usamos a seguinte linha de código:
     * List<Aula> aulas = new ArrayList<>(aulasImutaveis);
     * Por decidimos que nosso array seria imutável (lembra que usamos
     * o Collections.unmodifiableList(aulas); ?). Por causa
     * disso, para que consigamos editar uma lista, usamos o construtor
     * que já existe em ArrayList, que é essa sintaxe aqui:
     * ... new ArrayList<>(aulasImutaveis);
     * Depois disso, conseguimos ordernar o array em ordem alfabética,
     * usando o Collections.sort(aulas) - o padrão é alfabético.
     */

}
