package modelo;

import modelo.contaInterface.IConta;

public class Conta implements IConta {
    private static long sequencial = 1;
    private String nomeUser;
    private long numeroConta;
    private int senha;
    private double saldo;

    public Conta(String nomeUser, int senha) {
        this.nomeUser = nomeUser;
        this.numeroConta = sequencial++;
        this.senha = senha;
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeUser='" + nomeUser + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}