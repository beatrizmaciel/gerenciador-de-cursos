package com.possible;

public class Aula implements Comparable<Aula> {

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }

}

/**
 * Implementamos a comparable porque só a String
 * consegue comparar (alfabeticamente) duas variáveis.
 * O método comparable já vem na String, enquanto que,
 * em outros elementos, precisamos criar o método e atribuir
 * as formas que desejamos comparar. Nesse caso, reutilizamos
 * o método compare, então a saída foi a ordem alfabética
 * dos títulos (olhar no documento TestaListaDeAula).
 */
