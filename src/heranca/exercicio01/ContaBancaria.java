package heranca.exercicio01;

import heranca.aula07.Aluno;

import java.util.Arrays;
import java.util.Objects;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor){
        if((saldo-valor) >=0){
            saldo -= valor;
            System.out.println("Saque concluido com sucesso!");
            System.out.println("Saldo Atual = " + saldo);
            return true;
        }
        System.out.println("Saldo insuficiente para saquel de "+ valor + " reais");
        System.out.println("Saldo = " + saldo);
        return  false;
    }
}
