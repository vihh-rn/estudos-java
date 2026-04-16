package atividade01;

// @author vitoria

public class ProdutoDigital {
    
    private String nome;
    private double preco;
    private double tamanhoEmMb;
    private String formatoArquivo;
    private String categoria;

    public ProdutoDigital(String nome, double preco, double tamanhoEmMb, String formatoArquivo, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.tamanhoEmMb = tamanhoEmMb;
        this.formatoArquivo = formatoArquivo;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTamanhoEmMb() {
        return tamanhoEmMb;
    }

    public void setTamanhoEmMb(double tamanhoEmMb) {
        this.tamanhoEmMb = tamanhoEmMb;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }
    
    public void baixarProduto(){
        System.out.println("Baixando...");
        System.out.println("Produto baixado!");
    }
    
    public void exibirDetalhes(){
        System.out.println("Detalhes do produto: ");
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Tamanho em MB: " + tamanhoEmMb);
        System.out.println("Formato do Arquivo: " + formatoArquivo);
        System.out.println("Categoria: " + categoria);
    }
    
    public double aplicarDesconto(double desconto){
        double total;
        
        if (desconto > 0 && desconto <= 100){
            total = preco - (desconto/100 * preco);
        }else if (desconto > 100){
            total = preco;
            System.out.println("Valor inválido, o desconto não pode ser mais que 100%.");
        }else{
            total = preco;
            System.out.println("Valor inválido, o desconto não pode ser negativo.");
        }
        
        return total;
    }
}
