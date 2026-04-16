package atividade01;

// @author vitoria

public class Restaurante {
    
    private String nome;
    private String endereco;
    private String tipoDeCozinha;
    private int capacidade;
    private String horarioDeFuncionamento;
    private int mesas[];

    public Restaurante(String nome, String endereco, String tipoDeCozinha, int capacidade, String horarioDeFuncionamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.tipoDeCozinha = tipoDeCozinha;
        this.capacidade = capacidade;
        this.horarioDeFuncionamento = horarioDeFuncionamento;
        this.mesas = new int[capacidade];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoDeCozinha() {
        return tipoDeCozinha;
    }

    public void setTipoDeCozinha(String tipoDeCozinha) {
        this.tipoDeCozinha = tipoDeCozinha;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade > 0){
            this.capacidade = capacidade;
        }else{
            System.out.println("Valor inválido, a capacidade não pode ser negativa.");
        }
    }

    public String getHorarioDeFuncionamento() {
        return horarioDeFuncionamento;
    }

    public void setHorarioDeFuncionamento(String horarioDeFuncionamento) {
        this.horarioDeFuncionamento = horarioDeFuncionamento;
    }
    
    public void reservarMesa(int mesa){
        if (mesa > 0 && mesa <= capacidade){
            if(mesas[mesa-1] == 0){
                mesas[mesa-1] = 1;
                System.out.println("Mesa " + mesa + " reservada!");
            }
            else{
                System.out.println("A mesa " + mesa + " já está reservada.");
            }
        }else if (mesa > capacidade){
            System.out.println("Valor inválido, a capacidade é de "+ capacidade + " mesas.");
        }else{
            System.out.println("Valor inválido, o n° da mesa não pode ser negativo.");
        }
    }
    
    public void cancelarReserva(int mesa){
        if (mesa > 0 && mesa <= capacidade){
            if(mesas[mesa-1] == 1){
                mesas[mesa-1] = 0;
                System.out.println("Reserva da mesa " + mesa + " cancelada.");
            }
            else{
                System.out.println("A mesa " + mesa + " não estava reservada.");
            }
            
        }else if (mesa > capacidade){
            System.out.println("Valor inválido, a capacidade é de "+ capacidade + " mesas.");
        }else{
            System.out.println("Valor inválido, o n° da mesa não pode ser negativo.");
        }
    }
    
    public void exibirCardapio(){
        System.out.println("Cardápio:");
        System.out.println("Arroz.....R$ 5,00");
        System.out.println("Feijão....R$ 5,00");
        System.out.println("Frango....R$ 7,00");
        System.out.println("Carne.....R$ 7,00");
        System.out.println("Sopa......R$ 10,00");
    }
}
