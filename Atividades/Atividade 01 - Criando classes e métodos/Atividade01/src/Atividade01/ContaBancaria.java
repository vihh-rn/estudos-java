package atividade01;

// @author vitoria
 
public class ContaBancaria {
    
    private int numeroConta;
    private String titular;
    private double saldo;
    private String tipoConta;
    private double limite;

    public ContaBancaria(int numeroConta, String titular, double saldo, String tipoConta, double limite) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.limite = limite;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite > 0){
            this.limite = limite;
        }else{
            System.out.println("Valor inválido, o limite não pode ser negativo.");
        }
    }
    
    public void depositar(double deposito){
        if (deposito > 0 && deposito <= limite){
            saldo += deposito;
            System.out.println("R$ " + deposito + " depositado!");
        }else if (deposito > limite){
            System.out.println("Valor inválido, o depósito não pode ser maior que o limite.");
        }else{
            System.out.println("Valor inválido, o depósito não pode ser negativo.");
        } 
    }
    
    public void sacar(double saque){
        if (saque > 0 && saque <= saldo){
            saldo -= saque;
            System.out.println("R$ " + saque + " sacado!");
        }else if (saque > saldo){
            System.out.println("Valor inválido, o saque não pode ser maior que o saldo.");
        }else{
            System.out.println("Valor inválido, o saque não pode ser negativo.");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Seu saldo é: R$ " + saldo);
    } 
}
