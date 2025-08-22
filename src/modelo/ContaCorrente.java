package modelo;

import modelo.contaInterface.IConta;

public class ContaCorrente implements IConta {
    private static long sequencial = 1000;
    private long numeroConta;
    private String titular;
    private double saldo;
    private double limiteChequeEspecial = 500.0;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.numeroConta = sequencial++;
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor > 0 && saldo + limiteChequeEspecial >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "titular='" + titular + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}