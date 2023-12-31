public class EmprestimoEstudantil extends Emprestimo implements SimulacaoDeEmprestimo {

    @Override
    public double solicitar(double saldo, double valorRequisitado) {
        if (saldo == 0) {
            System.out.println("Empréstimo não autorizado.");
            return 0;
        } else if (saldo > 0 && saldo <= 500) {
            return valorRequisitado * 1;
        } else if (saldo > 500 && saldo <= 1000) {
            return valorRequisitado * 0.5;
        } else if (saldo > 1000) {
            return valorRequisitado * 0.2;
        }
        return 0;
    }

    public void simularEmprestimo () {
        System.out.println("Iniciando a simulação do empréstimo...");
    }
}
