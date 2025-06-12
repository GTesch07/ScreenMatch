package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;

    //Modificadores de acesso private
    private double somaDasAvaliacoes;
    private int totalDeAvaliacaos;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }
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

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
