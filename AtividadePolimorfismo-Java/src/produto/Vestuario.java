package produto;

public class Vestuario extends Produto {
    public Vestuario(double preco) {
        super(preco);
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.2;
    }
}
