package br.com.aprendendo.screenmatch.calculos;

import br.com.aprendendo.screenmatch.domain.Series;
import br.com.aprendendo.screenmatch.domain.Main;

public class MinutosParaMaratonarFilmeSerie {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluindo(Series s) {
        this.tempoTotal += s.getMinutosPorEpisodio() * s.getEpisodiosPorTemporada() * s.getTemporadas();
    }

    public void incluindo(Main main) {
        this.tempoTotal += main.getDuracaoEmMinutos();
    }
}
