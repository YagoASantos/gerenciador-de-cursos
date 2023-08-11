package br.com.alura.testes;

import br.com.alura.classes.Aula;
import br.com.alura.classes.Curso;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Java Coleções", "Yago Aguiar");
        System.out.println(javaColecoes.getAulas());
        javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 30));
        System.out.println(javaColecoes.getAulas());
    }
}
