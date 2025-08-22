package modelo.contaInterface;

public interface IConta {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, IConta contaDestino);
    double consultarSaldo();
}