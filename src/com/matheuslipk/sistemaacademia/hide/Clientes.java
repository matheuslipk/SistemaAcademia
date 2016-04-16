package com.matheuslipk.sistemaacademia.hide;

/**
 *
 * @author h4ck3r
 */

public class Clientes {
    private int id;
    private String nome;
    private String sobreNome;
    private String cpf;
    private String rg;
    private Data dataNascimento;
    private Data dataEntrada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public void setDataNascimento(long dataEntrada) {
        this.dataNascimento = new Data(dataEntrada);
    }
    
    public void setDataNascimento(int ano, int mes, int dia) {
        this.dataNascimento = new Data(ano, mes, dia);
    }
    
    public Data getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    
    public void setDataEntrada(long dataEntrada) {
        this.dataEntrada = new Data(dataEntrada);
    }
    
    public void setDataEntrada(int ano, int mes, int dia) {
        this.dataEntrada = new Data(ano, mes, dia);
    }
}
