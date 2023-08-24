package br.edu.ufcg.computacao.lp2.CronicasDoEstudanteSistema.br.edu.ufcg.computacao.lp2.CronicasDoEstudanteSistema;

import java.util.Objects;

public class Cronica {
    private String titulo;
    private String texto;
    private String autor;
    private String dataDeCriacao;

    public Cronica(String titulo, String texto, String dataDeCriacao) {
        this.titulo = titulo;
        this.texto = texto;
        this.dataDeCriacao = dataDeCriacao;
        this.autor = "Anônimo";
    }

    public Cronica(String titulo, String texto, String dataDeCriacao, String autor) {
        this.titulo = titulo;
        this.texto = texto;
        this.dataDeCriacao = dataDeCriacao;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {

        return this.titulo + "\nData: " + this.dataDeCriacao + "\nAutor: " +
                this.autor + "\n" + this.texto + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cronica cronica = (Cronica) o;
        return Objects.equals(titulo, cronica.titulo) && Objects.equals(texto, cronica.texto) && Objects.equals(autor, cronica.autor) && Objects.equals(dataDeCriacao, cronica.dataDeCriacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, texto, autor, dataDeCriacao);
    }
}
