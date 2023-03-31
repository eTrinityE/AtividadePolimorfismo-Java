package forma;

public class CirculoC extends Forma {
    private double raio;

    public CirculoC(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
