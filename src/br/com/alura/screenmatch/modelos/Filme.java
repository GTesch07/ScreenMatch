package br.com.alura.screenmatch.modelos;

//Definição de uma Classe, tudo o que uma classe tem e tudo o que uma classe faz!

import br.com.alura.screenmatch.calculos.Classificavel;

//extends = Palavra reservada do Java que aplica herança a uma classe)
//Implements = Palavra reservada do Java que aplica ainda tem a herança da classe do extends mas implementa a classe classificavel.
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao(){
        return 0;
    }
}
