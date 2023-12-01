public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();

        // instancia objeto conta corrente
        ContaCorrente cc1 = new ContaCorrente(1001, 100.0);
        // deposita conta
        cc1.depositar(10.00);
        //relatorio.gerarRelatorio(cc1);
        cc1.sacar(30.00);
        //relatorio.gerarRelatorio(cc1);

        ContaCorrente cc2 = new ContaCorrente(1002, 70.0);
        cc2.depositar(05.00);
        //relatorio.gerarRelatorio(cc2);

        ContaPoupanca cp1 = new ContaPoupanca(3001, 200.0, 300);
        cp1.sacar(490.0);
        relatorio.gerarRelatorio(cp1);
        cp1.sacar(20.0);
    }
}
