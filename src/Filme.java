//Definição de uma Classe, tudo o que uma classe tem e tudo o que uma classe faz!

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    //Modificadores de acesso private
    private double somaDasAvaliacoes;
    private  int totalDeAvaliacaos;
    int duracaoEmMinutos;

    //metodo acessor Getters Setters
    int getTotalDeAvaliacaos(){
        return totalDeAvaliacaos;
    }

    //Criando métodos = Maneira "de" fazer algo
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        //Acessar o atributo do objeto
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacaos++;
    }

    double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacaos;
    }
}
