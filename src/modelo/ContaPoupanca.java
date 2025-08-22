package modelo;

import modelo.contaInterface.IConta;

public class ContaPoupanca implements IConta {
    private static long sequencial = 2000;
    private long numeroConta;
    private String titular;
    private double saldo;
    private double taxaRendimento = 0.03; // 3% ao mês

    public ContaPoupanca(String titular) {
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

    public void renderJuros() {
        saldo += saldo * taxaRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "titular='" + titular + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}