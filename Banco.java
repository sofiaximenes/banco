import java.util.ArrayList;

public class Banco implements Imprimivel {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public void inserir(ContaBancaria conta) {
        contas.add(conta);
    }

    public void remover(ContaBancaria conta) {
        contas.remove(conta);
    }

    public int gerarNumeroConta(String tipo) {
        if (tipo == "corrente") {
            return 1000 + contas.size();
        } else if (tipo == "poupanca") {
            return 2000 + contas.size();
        }
        return 0;
    }

    public ContaBancaria procurarConta(int numeroDaConta) throws ContaInexistente {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroDaConta) {
                return conta;
            }
        }
//        System.out.println("Conta inexistente. Favor digitar nº de conta ativa.");
        throw new ContaInexistente("A conta digitada não existe.");
    }



    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    @Override
    public void mostrarDados() {

    }
}
