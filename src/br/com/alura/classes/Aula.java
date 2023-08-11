package br.com.alura.classes;

public class Aula implements Comparable<Aula> {

    private String titulo;
    private Integer tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Integer getTempo() {
        return this.tempo;
    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.tempo + " minutos";
    }

    @Override
    public int compareTo(Aula aula) {
        return this.tempo.compareTo(aula.tempo);
    }
}
