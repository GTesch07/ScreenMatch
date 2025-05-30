import br.com.alura.screenmatch.modelos.Filme;

//instanciar objetos
public class Principal {
    public static void main(String args[]){
        Filme meuFilme = new Filme();
        //Criando uma variavel para referenciar o objeto       //Cria uma parte na memória

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacaos());
        System.out.printf("%.2f\n",meuFilme.mediaDasAvaliacoes());
        //  meuFilme.somaDasAvaliacoes = 10;
        //  meuFilme.totalDeAvaliacaos =1;
        // System.out.println(meuFilme.mediaDasAvaliacoes());

    }
}
