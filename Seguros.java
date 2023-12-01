public abstract class Seguros {
    float premio;
    String tipo;
    String numeroApolice;

    public Seguros (String tipo) {
        this.tipo = tipo;
    }
    public abstract void contratar(double saldo);

    public abstract void cancelar(String numeroApolice);

    public float getPremio() {
        return premio;
    }

    public void setPremio(float premio) {
        this.premio = premio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }
}
