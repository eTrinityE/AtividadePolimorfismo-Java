package forma;

public class TrianguloT extends Forma {
    private double base;
    private double altura;

    public TrianguloT(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
