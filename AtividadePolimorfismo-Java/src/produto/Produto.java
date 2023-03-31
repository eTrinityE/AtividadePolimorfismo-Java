package produto;

public class Produto {
    protected double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public double calcularDesconto() {
        return 0;
    }
}