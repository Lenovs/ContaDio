package modelo;

import modelo.contaInterface.IConta;

public class Cliente {
    private String nome;
    private String cpf;
    private String senha;
    private IConta conta;

    public Cliente(String nome, String cpf, String senha, IConta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.conta = conta;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getSenha() { return senha; }
    public IConta getConta() { return conta; }

    public void setConta(IConta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", conta=" + conta +
                '}';
    }
}