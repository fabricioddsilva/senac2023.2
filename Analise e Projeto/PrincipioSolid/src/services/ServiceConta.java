package services;

import configuration.Conexao;
import entities.Conta;

import java.sql.Connection;
import java.sql.SQLOutput;
import java.sql.Statement;

public class ServiceConta {

    public void salvar(Conta conta){
        try{
            Connection conn = Conexao.abrir();
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO CONTA (codigo, nome, saldo) VALUES ("+ conta.getCodigo() +
                    ","+ conta.getNome() +","+conta.getSaldo()+")";
            stmt.executeQuery(query);
            stmt.close();
            System.out.println("Conta Cadastrada");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public double SaldoJurosCompostos(int meses, double taxa, Conta conta){
        double montante = conta.getSaldo() * Math.pow((1 + taxa), meses);
        return montante;
    }

    public double SaldoJurosSimples (int meses, double taxa, Conta conta){
        double montante = conta.getSaldo() * (1 + (taxa * meses));
        return montante;
    }
}
