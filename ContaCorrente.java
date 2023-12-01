public class ContaCorrente extends ContaBancaria implements Imprimivel {
    private double taxaDeOperacao;

    public ContaCorrente(int numeroConta, double saldo) {
        super(numeroConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor - taxaDeOperacao);
        } else {
            System.out.println("Saldo insuficiente para efetuar o saque solicitado.");
        }
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor - taxaDeOperacao);
    }

    @Override
    public void transferir(double valor, ContaBancaria conta) {
        if (this.getSaldo() >= valor) {
            this.sacar(valor);
            conta.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência de R$ " + valor + ".");
        }
    }

    public void mostrarDados() {
        System.out.println("--- Conta Corrente ---");
        System.out.println("Número da Conta: " + getNumeroConta());
        System.out.println("Saldo: R$" + getSaldo());
    }
}