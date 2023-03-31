package contaC;

public class ContaEspecial extends ContaC {
    private double limiteCredito;

    public ContaEspecial(double saldo, double limiteCredito) {
        super(saldo);
        this.limiteCredito = limiteCredito;
    }

    public void sacar(double valor) {
        if (valor <= getSaldo() + limiteCredito) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
