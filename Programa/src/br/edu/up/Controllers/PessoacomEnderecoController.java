package br.edu.up.Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import br.edu.up.Models.Endereco;
import br.edu.up.Models.Pessoa;

public class PessoacomEnderecoController {

    File arquivoEnderecos = new File("C:\\Users\\autologon\\Desktop\\teste\\Simulado\\Programa\\src\\Enderecos.csv");
    File arquivoPessoas = new File("C:\\Users\\autologon\\Desktop\\teste\\Simulado\\Programa\\src\\Pessoas.csv");
    File arquivoPessoasEnderecos = new File("C:\\Users\\autologon\\Desktop\\teste\\Simulado\\Programa\\src\\PessoaComEndereco.csv");
    public List<Endereco> listaEnderecos = new ArrayList<>();
    public List<Pessoa> listaPessoas = new ArrayList<>();

    public void carregarPessoas(){
        try {
            Scanner leitor = new Scanner(arquivoPessoas);
            leitor.nextLine();
    
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                String dados[] = linha.split(";");
    
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
    
                Pessoa novaPessoa = new Pessoa(id, nome);
                listaPessoas.add(novaPessoa);
            }
            leitor.close();
        }
        catch (FileNotFoundException x) {
            System.out.println("Erro: " + x.getCause());
        }
    }

    public void carregarEndereco(){
        try {
            Scanner leitor = new Scanner(arquivoEnderecos);
            leitor.nextLine();
    
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                String dados[] = linha.split(";");
    
                String rua = dados[0];
                String cidade = dados[1];
                int idPessoa = Integer.parseInt(dados[2]);
    
                Endereco novoEndereco = new Endereco(rua, cidade, idPessoa);
                listaEnderecos.add(novoEndereco);
            }
            leitor.close();
        }
        catch (FileNotFoundException x) {
            System.out.println("Erro: " + x.getCause());
        }
    }

    public void listarPessoaComEndereco(){
        try {
            Scanner leitor = new Scanner(arquivoPessoasEnderecos);
            leitor.nextLine();

            while (leitor.hasNextLine()){
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
            leitor.close();
        } catch (IOException e){
            System.out.println("Erro: " + e.getCause());
        }
    }

    public void salvarPessoaEndereco(){
        try {
            FileWriter arquivogravar = new FileWriter("C:\\Users\\autologon\\Desktop\\teste\\Simulado\\Programa\\src\\PessoaComEndereco.csv", false);
            PrintWriter gravador = new PrintWriter(arquivogravar);

            gravador.println("Id | nome | rua | cidade");

            for (Pessoa p : listaPessoas){
                String linhaCSV = p.toCSV();
                for (Endereco e : listaEnderecos){
                    if (e.getIdPessoa() == p.getCodigo()){
                        String enderecoCSV = e.toCSV();
                        gravador.println(linhaCSV + enderecoCSV);
                    }
                }
                
            }

            
            gravador.close();
        }
        catch (IOException e){
            System.out.println("Erro: " + e.getCause());
        }
    }

    

}
