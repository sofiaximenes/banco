public class LCI extends Investimentos{
    @Override
    public void investir(double valor) {
        if (get() >= valor) {
            setSaldo(getSaldo() - valor - taxaDeOperacao);
        } else {
            System.out.println("Saldo insuficiente para efetuar o saque solicitado.");
        }
    }
}
