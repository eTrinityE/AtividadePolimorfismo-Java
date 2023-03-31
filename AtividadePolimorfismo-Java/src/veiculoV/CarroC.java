package veiculoV;

public class CarroC extends VeiculoV {
    public CarroC(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void ligar() {
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        System.out.println("Carro desligado.");
    }
}
