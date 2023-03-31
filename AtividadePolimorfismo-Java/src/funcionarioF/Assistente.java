package funcionarioF;

public class Assistente extends FuncionarioF {
    public Assistente() {
        salarioBase = 2000.0;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
