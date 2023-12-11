public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaPoupanca(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() + limite >= valor){
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Valor de saque não permitido.");
        }
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
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
        System.out.println("--- Conta Poupança ---");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "limite=" + limite +
                ", numeroConta=" + numeroConta +
                ", contaAtiva=" + contaAtiva +
                ", saldo=" + saldo +
                '}';
    }
}

