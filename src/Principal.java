import br.com.alura.screenmatch.models.Filme;

public class Principal {
    public static void main(String[] args) {
       Filme meuFilme = new Filme();
       meuFilme.setNome("O poderoso chefao");
       meuFilme.setAnoDeLancamento(1983);
       meuFilme.setDuracaoEmMinutos(173);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalicao( 8);
        meuFilme.avalicao(5);
        meuFilme.avalicao(10);
        System.out.println("Total de avaliacao:" +meuFilme.getTotalDeAvaliacao());
        //System.out.println(meuFilme.mediaAvaliacao());

    }
}
