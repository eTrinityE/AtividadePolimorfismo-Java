package conta;

public class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double verificarSaldo() {
        return saldo;
    }

    public void verificarConta() {
        System.out.println("Conta genérica");
    }
}
