public abstract class Investimentos {
    String tipo;
    float taxaDeJuros;

    float rendimento;

    public Investimentos(String tipo, float taxaDeJuros) {
        this.tipo = tipo;
        this.taxaDeJuros = taxaDeJuros;

    }

    public abstract void investir(float valor);

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(float taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }
}
