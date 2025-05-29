//Definição de uma Classe, tudo o que uma classe tem e tudo o que uma classe faz!

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacaos;
    int duracaoEmMinutos;

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
