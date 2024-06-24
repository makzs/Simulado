package br.edu.up.Models;

public class Pessoa {
    private int codigo;
    private String nome;
    private String rua;
    private String cidade;

    

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // metodo to csv para converter o objeto em um texto csv
    public String toCSV(){
        return codigo + ";" + nome + ";";
    }


    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    

}
