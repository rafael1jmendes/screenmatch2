package br.com.alura.screenmatch.models;

public class Filme {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvalicaoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica () {

        System.out.println("Nome do Filmes: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);

    }

   public void avalicao(double nota){
        somaDasAvalicaoes += nota;
        totalDeAvaliacao ++;
    }

   public double mediaAvaliacao(){
        return somaDasAvalicaoes/totalDeAvaliacao;
    }

}
