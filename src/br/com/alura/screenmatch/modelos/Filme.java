package br.com.alura.screenmatch.modelos;

//Definição de uma Classe, tudo o que uma classe tem e tudo o que uma classe faz!

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;

    //Modificadores de acesso private
    private double somaDasAvaliacoes;
    private int totalDeAvaliacaos;
    private int duracaoEmMinutos;

    //metodo acessor Getters Setters
    //getters = buscar valor
    //setters = incluir valor no atributo

    public int getTotalDeAvaliacaos(){
        return totalDeAvaliacaos;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome =nome;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }


    public boolean isIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
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
