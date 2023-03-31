package pessoa;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Meu nome é " + this.nome + " e estou matriculado no curso de " + this.curso);
    }
}
