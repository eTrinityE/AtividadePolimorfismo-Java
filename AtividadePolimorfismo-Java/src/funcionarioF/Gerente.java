package funcionarioF;

public class Gerente extends FuncionarioF {
    private double bonus;

    public Gerente() {
        salarioBase = 5000.0;
        bonus = 1000.0;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
