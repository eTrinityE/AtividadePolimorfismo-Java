package pessoa;

public class Professor extends Pessoa {
    private String areaFormacao;

    public Professor(String nome, String areaFormacao) {
        super(nome);
        this.areaFormacao = areaFormacao;
    }

    @Override
    public void apresentar() {
        System.out.println("Meu nome é " + this.nome + " e sou formado em " + this.areaFormacao);
    }
}