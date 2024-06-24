package br.edu.up.Views;

import java.util.Scanner;

import br.edu.up.Controllers.PessoacomEnderecoController;

public class Menu {

    public void Mostrar(){

        PessoacomEnderecoController controller = new PessoacomEnderecoController();
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("Simulado de orientação a objetos");
        System.out.println("------------------------");
        System.out.println("Informe a opção que deseja: ");
        System.out.println("1. Listar PessoasComEndereco");
        System.out.println("2. Carregar PessoasComEndereco");
        System.out.println("------------------------");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                controller.carregarEndereco();
                controller.carregarPessoas();
                controller.listarPessoaComEndereco();
                Mostrar();
                break;
            case 2:
                controller.carregarEndereco();
                controller.carregarPessoas();
                controller.salvarPessoaEndereco();
                Mostrar();
                break;
        
            default:
                break;
        }
        leitor.close();

    }
}
