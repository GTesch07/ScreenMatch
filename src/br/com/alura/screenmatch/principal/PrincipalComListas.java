package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[]args){
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(6);
        var filmeDoGuilherme = new Filme("O Lobo de Wall Street", 2013);
        meuFilme.avalia(10);
        Serie serie = new Serie("Supernatural",2010);



        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoGuilherme);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);
        for (Titulo item: lista){
           System.out.println("Nome: "+item.getNome());
           if (item instanceof Filme filme && filme.getClassificacao() > 2){
               System.out.println("Classificação: " + filme.getClassificacao());
           }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jonhy Depp");
        buscaPorArtista.add("Leonardo DiCaprio");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);
    }
}
