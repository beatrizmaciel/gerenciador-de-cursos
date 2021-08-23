package com.possible;

import java.security.KeyStore;
import java.util.*;

public class TesteMap {

    public static void main(String[] args) {
        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 32);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 34);

        Set<String> chaves = nomesParaIdade.keySet();
        for (String nome: chaves) {
            System.out.println(nome);
        }

        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer idade: valores) {
            System.out.println(idade);
        }

        Set<Map.Entry<String, Integer>> associacoes =
                nomesParaIdade.entrySet();
        for (Map.Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " +
                    associacao.getValue());
        }

    }

}
