import modelo.*;
import modelo.contaInterface.IConta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando contas
        IConta conta1 = new Conta("Ana Souza", 12345);
        IConta conta2 = new Conta("Carlos Lima", 1232);

        // Criando clientes
        Cliente cliente1 = new Cliente("Ana Souza", "123.456.789-00", "12345", conta1);
        Cliente cliente2 = new Cliente("Carlos Lima", "987.654.321-00", "1232", conta2);

        // Adicionando à lista
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);

        // Criando o banco
        Banco banco = new Banco( listaClientes);

        // Exibindo informações
        System.out.println("Banco: " + banco.getBanco());
        System.out.println("Agência: " + banco.getAgencia());
        System.out.println("Clientes:");
        for (Cliente c : banco.getClientes()) {
            System.out.println(" - " + c);
        }
    }
}