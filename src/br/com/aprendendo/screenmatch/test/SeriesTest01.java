package br.com.aprendendo.screenmatch.test;

import br.com.aprendendo.screenmatch.calculos.MinutosParaMaratonarFilmeSerie;
import br.com.aprendendo.screenmatch.domain.Series;

public class SeriesTest01 {
    public static void main(String[] args) {
        Series series01 = new Series();
        series01.setNome("Supernatural");
        series01.setAnoDeLancamento(2003);
        series01.setIncluidoNoPlano(true);
        series01.setAvaliacoes(4.3);
        series01.setTemporadas(12);
        series01.setEpisodiosPorTemporada(10);
        series01.setMinutosPorEpisodio(50);
        series01.setAtiva(false);

        Series series02 = new Series();
        series02.setNome("Breaking bad");
        series02.setAnoDeLancamento(2008);
        series02.setIncluidoNoPlano(true);
        series02.setAvaliacoes(4.5);
        series02.setTemporadas(5);
        series02.setTotalDeAvaliacoes(299.239);
        series02.setEpisodiosPorTemporada(10);
        series02.setMinutosPorEpisodio(50);
        series02.setAtiva(false);

        Series series03 = new Series();
        series03.setNome("The boys");
        series03.setAnoDeLancamento(2019);
        series03.setIncluidoNoPlano(true);
        series03.setAvaliacoes(4.5);
        series03.setTemporadas(4);
        series03.setTotalDeAvaliacoes(520.768);
        series03.setEpisodiosPorTemporada(10);
        series03.setMinutosPorEpisodio(48);
        series03.setAtiva(true);

        MinutosParaMaratonarFilmeSerie calculadora = new MinutosParaMaratonarFilmeSerie();
        calculadora.incluindo(series01);
        calculadora.incluindo(series02);
        calculadora.incluindo(series03);
        System.out.println("Cerca de " + calculadora.getTempoTotal() + " minutos para maratonar as series a seguir:");
        System.out.println("-----------------------------------");

        System.out.println("Episodios por temporada: " + series01.getEpisodiosPorTemporada());
        System.out.println("Minuto por episodio: " + series01.getMinutosPorEpisodio());
        System.out.println("Em lançamento: " + series01.isAtiva());
        series01.imprimeSerie();
        System.out.println("Episodios por temporada: " + series02.getEpisodiosPorTemporada());
        System.out.println("Minuto por episodio: " + series02.getMinutosPorEpisodio());
        System.out.println("Em lançamento: " + series02.isAtiva());
        series02.imprimeSerie();
        System.out.println("Episodios por temporada: " + series03.getEpisodiosPorTemporada());
        System.out.println("Minuto por episodio: " + series03.getMinutosPorEpisodio());
        System.out.println("Em lançamento: " + series03.isAtiva());
        series03.imprimeSerie();

    }
}
