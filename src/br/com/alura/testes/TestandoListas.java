package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Trabalhando com ArrayList";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        List<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add("Aumentando nosso conhecimento");

        System.out.println(aulas);
        aulas.remove(aula1);
        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo: " + aula);
        });
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
