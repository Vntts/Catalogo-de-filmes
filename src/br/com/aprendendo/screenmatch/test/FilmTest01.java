package br.com.aprendendo.screenmatch.test;

import br.com.aprendendo.screenmatch.calculos.MinutosParaMaratonarFilmeSerie;
import br.com.aprendendo.screenmatch.domain.Films;

public class FilmTest01 {
    public static void main(String[] args) {
        Films films01 = new Films();
        films01.setNome("Homem aranha 2");
        films01.setAnoDeLancamento(2004);
        films01.setIncluidoNoPlano(true);
        films01.setAvaliacoes(4.5);
        films01.setTotalDeAvaliacoes(789.589);
        films01.setDuracaoEmMinutos(140);
        films01.setDiretor("Sam Raimi");

        Films films02 = new Films();
        films02.setNome("Homem de ferro");
        films02.setAnoDeLancamento(2008);
        films02.setIncluidoNoPlano(true);
        films02.setAvaliacoes(4.8);
        films02.setTotalDeAvaliacoes(968.973);
        films02.setDuracaoEmMinutos(126);
        films02.setDiretor("Jon Favreau");

        Films films03 = new Films();
        films03.setNome("Capitão America");
        films03.setAnoDeLancamento(2011);
        films03.setIncluidoNoPlano(true);
        films03.setAvaliacoes(4.3);
        films03.setTotalDeAvaliacoes(743.087);
        films03.setDuracaoEmMinutos(124);
        films03.setDiretor("Joe Johnston");

        MinutosParaMaratonarFilmeSerie calculadora = new MinutosParaMaratonarFilmeSerie();
        calculadora.incluindo(films01);
        calculadora.incluindo(films02);
        calculadora.incluindo(films03);
        System.out.println("Cerca de " + calculadora.getTempoTotal() + " minutos para maratonar os filmes a seguir:");
        System.out.println("-----------------------------------");

        System.out.println("Diretor: " + films01.getDiretor());
        films01.imprimeFilme();
        System.out.println("Diretor: " + films02.getDiretor());
        films02.imprimeFilme();
        System.out.println("Diretor: " + films03.getDiretor());
        films03.imprimeFilme();

    }

}