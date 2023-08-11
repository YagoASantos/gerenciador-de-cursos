package br.com.alura.classes;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }
    public String getNome() {
        return this.nome;
    }
    public String getInstrutor() {
        return this.instrutor;
    }
    public List<Aula> getAulas() {
        return aulas;
    }
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
}
