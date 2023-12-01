import java.util.ArrayList;

public class Banco implements Imprimivel {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public void inserir(ContaBancaria conta) {
        contas.add(conta);
    }

    public void remover(ContaBancaria conta) {
        contas.remove(conta);
    }

    public ContaBancaria procurarConta(int numeroDaConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroDaConta) {
                return conta;
            }
        }
        return null;
    }
   @Override
    public void mostrarDados() {

    }
}
