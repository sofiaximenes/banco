public class ContaCorrente extends ContaBancaria implements Imprimivel {
    private double taxaDeOperacao;

    public ContaCorrente(int numeroConta, double saldo) {
        super(numeroConta);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficiente {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor - taxaDeOperacao);
            System.out.println("Valor sacado com sucesso!");
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
                this.sacar(valor);
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