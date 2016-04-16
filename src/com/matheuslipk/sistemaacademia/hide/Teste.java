package com.matheuslipk.sistemaacademia.hide;

import java.util.Date;

public class Teste {
    public static void main(String[] arg){
        Clientes objCliente = new Clientes();
        Pagamentos objPagamento = new Pagamentos();
        objCliente.setId(001);
        objCliente.setNome("Matheus");
        objCliente.setSobreNome("Araujo");
        objCliente.setDataEntrada(new Data(new Date().getTime()));
        objCliente.setDataNascimento(1994, 12, 10);
        
        System.out.println("ID " + objCliente.getId());
        System.out.println(""+objCliente.getNome()+" "+objCliente.getSobreNome());
        System.out.println("Entrada: "+objCliente.getDataEntrada().toString());
        System.out.println("Nascimento: "+objCliente.getDataNascimento().toString());
        
    }
}
