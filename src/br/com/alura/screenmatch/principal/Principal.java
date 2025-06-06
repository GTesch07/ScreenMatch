package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

//instanciar objetos
public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme("O poderoso chefão",1972);
        meuFilme.setDuracaoEmMinutos(175);
        System.out.println("Duração do filme: "+ meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacaos());
        System.out.printf("%.2f\n",meuFilme.mediaDasAvaliacoes());
        //  meuFilme.somaDasAvaliacoes = 10;
        //  meuFilme.totalDeAvaliacaos =1;
        // System.out.println(meuFilme.mediaDasAvaliacoes());

        Serie serie = new Serie("Supernatural",2010);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Supernatural em minutos: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        //A variável var realiza uma inferência do tipo declarado
        var filmeDoGuilherme = new Filme("O Lobo de Wall Street", 2013);
        filmeDoGuilherme.setDuracaoEmMinutos(180);
        filmeDoGuilherme.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDoGuilherme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: "+ listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());


    }
}
