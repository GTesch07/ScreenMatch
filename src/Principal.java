//instanciar objetos
public class Principal {
    public static void main(String args[]){
        Filme meuFilme = new Filme();
        //Criando uma variavel para referenciar o objeto       //Cria uma parte na memória

        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 175;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println((meuFilme.totalDeAvaliacaos));
        System.out.printf("%.2f\n",meuFilme.mediaDasAvaliacoes());
        meuFilme.somaDasAvaliacoes = 10;
        meuFilme.totalDeAvaliacaos =1;
        System.out.println(meuFilme.mediaDasAvaliacoes());
    }
}
