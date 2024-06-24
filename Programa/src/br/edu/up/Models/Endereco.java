package br.edu.up.Models;

public class Endereco {
    private String rua;
    private String cidade;
    private int idPessoa;
    

    public Endereco(String rua, String cidade, int idPessoa) {
        this.rua = rua;
        this.cidade = cidade;
        this.idPessoa = idPessoa;
    }

    // metodo para converter um objeto em um texto csv
    public String toCSV(){
        return rua + ";" + cidade + ";";
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
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }




}
