package produto;

public class Alimento extends Produto {
    public Alimento(double preco) {
        super(preco);
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.05;
    }
}