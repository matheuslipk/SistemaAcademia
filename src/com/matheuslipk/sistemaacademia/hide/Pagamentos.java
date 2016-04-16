package com.matheuslipk.sistemaacademia.hide;

/**
 *
 * @author h4ck3r
 */
public class Pagamentos {
    private int id;
    private int idClientes;
    private double valorPagamento;
    private Data dataPagamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }
    
    public void setIdClientes(Clientes idClientes) {
        this.idClientes = idClientes.getId();
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public Data getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Data dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
