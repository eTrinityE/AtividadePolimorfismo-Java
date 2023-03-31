package veiculo;

public class Carro extends Veiculo {
    @Override
    public void acelerar(int velocidadeAtual) {
        System.out.println("veiculo.Carro acelerando para " + velocidadeAtual + " km/h");
    }
}