public abstract class ContaBancaria {
    int numeroConta;
    double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);
    public abstract void transferir(double valor, ContaBancaria conta);

    public int getNumeroConta() {
        return this.numeroConta;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
