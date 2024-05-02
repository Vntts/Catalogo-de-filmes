package br.com.aprendendo.screenmatch.domain;

public class Main {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacoes;
    private double totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public double getAvaliacoes() {
        return avaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public void setAvaliacoes(double avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public double getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(double totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public void imprimeSerie() {
        System.out.println("Nome : " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Avaliação: " + avaliacoes);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes + " avaliações");
        System.out.println("Duração da serie: " + getDuracaoEmMinutos() + " minutos");
        System.out.println("-----------------------------------");
    }

    public void imprimeFilme() {
        System.out.println("Nome : " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Avaliações: " + avaliacoes);
        System.out.println("Duração do filme: " + duracaoEmMinutos + " minutos");
        System.out.println("-----------------------------------");
    }
}
