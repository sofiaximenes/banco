public abstract class Seguro {

    boolean ativado;

    public Seguro(boolean ativado) {
        this.ativado = ativado;
    }

    public boolean isAtivado() {
        return ativado;
    }

    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    }
}