package atividade01;

// @author vitoria

public class Computador {
    
    private String marca;
    private String modelo;
    private String processador;
    private String memoriaRam;
    private String armazenamento;

    public Computador(String marca, String modelo, String processador, String memoriaRam, String armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    
    public void exibirInformacoes(){
        System.out.println("Informações do computador:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador: " + processador);
        System.out.println("Memoria RAM: " + memoriaRam);
        System.out.println("Armazenamento: " + armazenamento);
    }
}
