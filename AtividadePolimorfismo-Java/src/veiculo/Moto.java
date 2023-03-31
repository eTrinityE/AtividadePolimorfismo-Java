package veiculo;

public class Moto extends Veiculo {
    @Override
    public void acelerar(int velocidadeAtual) {
        System.out.println("veiculo.Moto acelerando para " + velocidadeAtual + " km/h");
    }
}