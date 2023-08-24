package br.edu.ufcg.computacao.lp2.CronicasDoEstudanteSistema.br.edu.ufcg.computacao.lp2.CronicasDoEstudanteSistema;

import br.edu.ufcg.computacao.lp2.CronicasDoEstudanteSistema.br.edu.ufcg.computacao.lp2.CronicasDoEstudanteSistema.Cronica;

public class CronicasDoEstudanteSistema {
    private Cronica[] cronicas;
    private int id;

    public CronicasDoEstudanteSistema() {
        this.cronicas = new Cronica[1000];
        this.id = 0;
    }

    public void cadastrarCronica(String titulo, String texto, String dataDeCriacao, String autor) {
        Cronica novaCronica = new Cronica(titulo, texto, dataDeCriacao);
        this.cronicas[this.id] = novaCronica;
        this.id++;
    }

    public void cadastrarCronica(String titulo, String texto, String dataDeCriacao) {
        Cronica novaCronica = new Cronica(titulo, texto, dataDeCriacao);
        cronicas[this.id] = novaCronica;
    }

    public String listarCronicas() {
        StringBuilder resp = new StringBuilder();
        for (int i = 0; i < cronicas.length; i++) {
            if (this.cronicas[i] != null) {
                resp.append("Cronica # ").append(i).append("\n");
                resp.append(this.cronicas[i].toString());
            }
        }
        return resp.toString();
    }
}
