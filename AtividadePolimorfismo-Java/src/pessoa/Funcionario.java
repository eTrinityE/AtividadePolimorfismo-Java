package pessoa;

public class Funcionario extends Pessoa {
    private String funcao;

    public Funcionario(String nome, String funcao) {
        super(nome);
        this.funcao = funcao;
    }

    @Override
    public void apresentar() {
        System.out.println("Meu nome é " + this.nome + " e sou " + this.funcao);
    }
}