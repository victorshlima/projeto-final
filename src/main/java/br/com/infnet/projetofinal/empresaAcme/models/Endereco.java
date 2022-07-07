package br.com.infnet.projetofinal.empresaAcme.models;

public class Endereco {

    public String logradouro;
    public String cidade;
    public String numero;
    public String cep;
    public String bairro;


    public Endereco(String logradouro, String cidade, String numero, String cep, String bairro) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
