package atividade01;

// @author vitoria

public class Professor {
    
    private String nome;
    private String especialidade;
    private double salario;
    private String turno;
    private String depertamento;

    public Professor(String nome, String especialidade, double salario, String turno, String depertamento) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.salario = salario;
        this.turno = turno;
        this.depertamento = depertamento;
    }

    public String getDepertamento() {
        return depertamento;
    }

    public void setDepertamento(String depertamento) {
        this.depertamento = depertamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0){
            this.salario = salario;
        }else{
            System.out.println("Valor inválido, o salário não pode ser negativo.");
        }
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void ministrarAula(){
        System.out.println("Ministrando aula");
    }
    
    public void corrigirProvas(){
        System.out.println("Corrigindo provas");
    }
    
    public void atualizarSalario(double novoSalario){
        if (novoSalario > 0){
            this.salario = novoSalario;
            System.out.println("Salário atualizado para: R$ " + salario);
        }else{
            System.out.println("Valor inválido, o salário não pode ser negativo.");
        }
    }
}
