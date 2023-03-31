package veiculo;

public class Caminhao extends Veiculo {
    @Override
    public void acelerar(int velocidadeAtual) {
        System.out.println("Caminhão acelerando para " + velocidadeAtual + " km/h");
    }
}