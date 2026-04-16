package atividade01;

// @author vitoria

public class Filme {
    
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private String genero;
    private double duracao;
    private boolean reproduzindo;

    public Filme(String titulo, String diretor, int anoLancamento, String genero, double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento > 0){
            this.anoLancamento = anoLancamento;
        }else{
            System.out.println("Valor inválido, o ano de lançamento não pode ser negativo.");
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        if (duracao > 0){
            this.duracao = duracao;
        }else{
            System.out.println("Valor inválido, a duração não pode ser negativa.");
        } 
    }
    
    public void reproduzir(){
        if(!reproduzindo){
            reproduzindo = true;
            System.out.println("Reproduzindo o filme");
        }else{
            System.out.println("O filme já está sendo reproduzido");
        }
    }
    
    public void pausar(){
        if(reproduzindo){
            reproduzindo = false;
            System.out.println("Filme pausado");
        }else{
            System.out.println("O filme já está pausado");
        }
    }
    
    public void exibirInformacoes(){
        System.out.println("Informações do filme:");
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracao);
    }
}
