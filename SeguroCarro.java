public class SeguroCarro extends Seguro implements SimulacaoDeSeguro {
    public SeguroCarro(boolean ativado) {
        super(ativado);
    }

    public void simularSeguro () {
        System.out.println("Iniciando a simulação do seguro...");
    }

    @Override
    public String toString() {
        return "SeguroCarro{" +
                "ativado=" + ativado +
                '}';
    }
}
