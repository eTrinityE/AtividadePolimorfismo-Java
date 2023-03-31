package funcionarioF;

public class Diretor extends FuncionarioF {
    private double gratificacao;

    public Diretor() {
        salarioBase = 10000.0;
        gratificacao = 5000.0;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + gratificacao;
    }
}
