import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ContaCorrente extends ContaBancaria implements Imprimivel {
    private double taxaDeOperacao;

    public ContaCorrente(int numeroConta, double saldo) {
        super(numeroConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void sacar(int conta, double valor) throws SaldoInsuficiente {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor - taxaDeOperacao);
            System.out.println("Valor sacado com sucesso!");
            File arquivo = new File("./historico-de-saques.txt");
            try {
                if (!arquivo.exists()) {
                    arquivo.createNewFile();
                }
                FileWriter fw = new FileWriter(arquivo, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("conta: " + conta + " sacou R$ " + valor);
                bw.newLine();
                bw.close();
                fw.close();
            } catch (IOException e) {
                System.out.println("Erro de Entrada/Saída");

            }

        } else {
            throw new SaldoInsuficiente("Saldo insuficiente");
        }

    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor - taxaDeOperacao);
    }

    @Override
    public void transferir(double valor, ContaBancaria conta) {
        if (this.getSaldo() >= valor) {
            try {
                this.sacar(conta.getNumeroConta(), valor);
            }
            catch (SaldoInsuficiente e) {
                System.out.println(e);
            }
            conta.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência de R$ " + valor + ".");
        }
    }

    public void mostrarDados() {
        System.out.println("--- Conta Corrente ---");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "taxaDeOperacao=" + taxaDeOperacao +
                ", numeroConta=" + numeroConta +
                ", contaAtiva=" + contaAtiva +
                ", saldo=" + saldo +
                '}';
    }
}