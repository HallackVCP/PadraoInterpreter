package org.example;

public class Produto {

    private double preco;

    private double pcJuros;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPcJuros() {
        return pcJuros;
    }

    public void setPcJuros(double pcJuros) {
        this.pcJuros = pcJuros;
    }

    public double calcularPrecoTotalComJuros(){
        return Loja.calcularPrecoTotalComJuros(this.getPcJuros(), this.getPreco());
    }
}
