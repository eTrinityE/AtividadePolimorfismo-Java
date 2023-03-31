package contaC;

public class ContaCorrenteC extends ContaC {
    public ContaCorrenteC(double saldo) {
        super(saldo);
    }

    public void sacar(double valor) {
        double taxa = valor * 0.1;
        if (valor + taxa <= getSaldo()) {
            super.sacar(valor + taxa);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
