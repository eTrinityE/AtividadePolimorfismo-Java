package produto;

public class Eletronico extends Produto {
    public Eletronico(double preco) {
        super(preco);
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.1;
    }
}
