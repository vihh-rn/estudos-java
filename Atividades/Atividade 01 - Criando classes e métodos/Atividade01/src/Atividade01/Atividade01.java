package atividade01;

// @author vitoria
import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {

        Scanner inputMenu = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n==================================");
            System.out.println("Menu de testes");
            System.out.println("1 - ContaBancaria");
            System.out.println("2 - Restaurante");
            System.out.println("3 - Filme");
            System.out.println("4 - Professor");
            System.out.println("5 - ProdutoDigital");
            System.out.println("6 - Computador");
            System.out.println("0 - sair");
            System.out.print("Digite a classe que deseja testar: ");
            opcao = inputMenu.nextInt();

            switch (opcao) {
                case 1:
                    testar1();
                    break;
                case 2:
                    testar2();
                    break;
                case 3:
                    testar3();
                    break;
                case 4:
                    testar4();
                    break;
                case 5:
                    testar5();
                    break;
                case 6:
                    testar6();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            if (opcao != 0) {
                System.out.println("\n1 - Voltar ao menu");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");
                opcao = inputMenu.nextInt();
            }

        } while (opcao != 0);

        inputMenu.close();
    }

    public static void testar1() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n==================================");
        System.out.println("\nTestando classe: ContaBancaria");

        ContaBancaria conta = new ContaBancaria(2581, "Maria", 0, "Corrente", 10000);

        System.out.println("\n--- Método - Depositar ---");
        System.out.print("Quanto você deseja depositar?: ");
        double deposito = input.nextDouble();
        conta.depositar(deposito);

        System.out.println("\n--- Método - Sacar ---");
        System.out.print("Quanto você deseja sacar?: ");
        double saque = input.nextDouble();
        conta.sacar(saque);

        System.out.println("\n--- Método - Consultar saldo ---");
        conta.consultarSaldo();
    }

    public static void testar2() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n==================================");
        System.out.println("\nTestando classe: Restaurante");

        Restaurante restaurante = new Restaurante("Restaurante", "Rua 6", "a", 6, "05h ás 22h");

        System.out.println("\n--- Método - Reservar mesa ---");
        System.out.print("Qual mesa você deseja reservar?: ");
        int mesa = input.nextInt();
        restaurante.reservarMesa(mesa);

        System.out.println("\n--- Método - Cancelar reserva ---");
        System.out.print("Qual reservada você deseja cancelar?: ");
        int mesaR = input.nextInt();
        restaurante.cancelarReserva(mesaR);

        System.out.println("\n--- Método - Exibir cardápio ---");
        restaurante.exibirCardapio();
    }

    public static void testar3() {
        System.out.println("\n==================================");
        System.out.println("\nTestando classe: Filme");
        
        Filme filme = new Filme("Madagascar", "Tom McGrath e Eric Darnel", 2005, "Infantil/Comédia", 1.26);
        
        System.out.println("\n--- Método - Reproduzir ---");
        filme.reproduzir();

        System.out.println("\n--- Método - Pausar ---");
        filme.pausar();
        
        System.out.println("\n--- Método - Exibir informações ---");
        filme.exibirInformacoes();
    }

    public static void testar4() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n==================================");
        System.out.println("\nTestando classe: Professor");
        
        Professor professor = new Professor("André", "Física", 3000, "Manhã", "Departamento de física");
        
        System.out.println("\n--- Método - Ministrar aula ---");
        professor.ministrarAula();

        System.out.println("\n--- Método - Corrigir provas ---");
        professor.corrigirProvas();
        
        System.out.println("\n--- Método - Atualizar salário ---");
        System.out.print("Atualizar salário para: ");
        double salario = input.nextDouble();
        professor.atualizarSalario(salario);   
    }

    public static void testar5() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n==================================");
        System.out.println("\nTestando classe: ProdutoDigital");

        ProdutoDigital produto = new ProdutoDigital("Ebook - A Metamorfose", 9.9, 4.3, "pdf", "Livro digital");

        System.out.println("\n--- Método - Exibir detalhes ---");
        produto.exibirDetalhes();

        System.out.println("\n--- Método - Aplicar desconto ---");
        System.out.print("Quanto de desconto o produto terá? ");
        double desconto = input.nextDouble();
        double produtoComDesconto = produto.aplicarDesconto(desconto);
        System.out.println("Total com o desconto: R$ " + produtoComDesconto);
        
        System.out.println("\n--- Método - Baixar produto ---");
        produto.baixarProduto();
    }

    public static void testar6() {
        System.out.println("\n==================================");
        System.out.println("\nTestando classe: Computador");
        
        Computador computador = new Computador("Dell", "Inspiron 15", "Intel Core i5", "8GB", "512GB SSD");

        System.out.println("\n--- Método - Exibir informações ---");
        computador.exibirInformacoes();
    }
}
