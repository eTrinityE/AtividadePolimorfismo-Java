package veiculoV;

public class MotoM extends VeiculoV {
    public MotoM(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void ligar() {
        System.out.println("Moto ligada.");
    }

    public void desligar() {
        System.out.println("Moto desligada.");
    }
}