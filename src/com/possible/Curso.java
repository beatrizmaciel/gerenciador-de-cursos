package com.possible;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas(){
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        int tempoTotal = 0;
        for (Aula aula: aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    @Override
    public String toString() {
        return "Curso {" +
                " Nome do curso ='" + nome + '\'' +
                ", tempo ='" + this.getTempoTotal() + '\'' +
                " minutos"  + '\'' + "aulas = " + '\'' + this.aulas +
                '}';
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        // relação da matricula com o próprio Aluno
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatricula(int numero) {
        //                      \/ pq no map usamos uma key
        if(!matriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException();
        return matriculaParaAluno.get(numero);
    }
}

/**
 *
 * Usamos o Collections.unmodifiable para entregar um lista
 * e é retornada uma versão de leitura da lista que entregamos.
 * Dessa forma, não conseguimos usar métodos (como add e remove)
 * depois de usarmos o Collections.unmodifiable.
 *
 * Usamos o Map<K, V> para relacionar dois elementos. No caso acima,
 * usamos para Aluno e para o Número de Matrícula, de forma que
 * podemos pesquisar um aluno apenas pela sua matrícula. Por isso, se
 * trata de um Integer e um objeto, ficando:
 * Map<Integer, Aluno>
 *
 * Antes, a busca do aluno estava:
 *     public Aluno buscaMatricula(int numero) {
 *         for (Aluno aluno: alunos) {
 *             if(aluno.getNumeroMatricula() == numero)
 *                 return aluno;
 *         }
 *         // ao invés de retornar null, é melhor retornar uma exception
 *         throw new NoSuchElementException("Matrícula " + numero + " não encontrada");
 *     }
 *
 * Depois de aplicarmos o MAP, fica apenas:
 *      public Aluno buscaMatricula(int numero) {
 *          return matriculaParaAluno.get(numero);
 *      }
 *
 */