package modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String Banco = "Inter";
    private String numeroagencia = "077";
    private String nomeBanco;
    private String agencia;
    private List<Cliente> clientes;
    public Banco( List<Cliente> clientes) {
        this.nomeBanco = Banco;
        this.agencia = numeroagencia;
        this.clientes = clientes;
    }

    public String getBanco() { return nomeBanco; }
    public String getAgencia() { return agencia; }
    public List<Cliente> getClientes() { return clientes; }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarPorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}