package contaC;

public class ContaPoupancaC extends ContaC {
    private double taxaJuros;

    public ContaPoupancaC(double saldo, double taxaJuros) {
        super(saldo);
        this.taxaJuros = taxaJuros;
    }

    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void calcularJuros() {
        double juros = getSaldo() * taxaJuros;
        saldo += juros;
    }
}
