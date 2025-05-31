package br.com.alura.screenmatch.modelos;

//Definição de uma Classe, tudo o que uma classe tem e tudo o que uma classe faz!

//extends = Palavra reservada do Java que aplica herança a uma classe)
public class Filme extends Titulo{
    private String diretor;

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
}
