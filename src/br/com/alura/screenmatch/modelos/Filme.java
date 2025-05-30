package br.com.alura.screenmatch.modelos;

//Definição de uma Classe, tudo o que uma classe tem e tudo o que uma classe faz!

public class Filme {
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;

    //Modificadores de acesso private
    private double somaDasAvaliacoes;
    private  int totalDeAvaliacaos;
    int duracaoEmMinutos;

    //metodo acessor Getters Setters
   public int getTotalDeAvaliacaos(){
        return totalDeAvaliacaos;
    }

    //Criando métodos = Maneira "de" fazer algo
  public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        //Acessar o atributo do objeto
    }

   public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacaos++;
    }

   public double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacaos;
    }
}
