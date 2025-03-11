package trabalho;

public class Diretor extends Funcionario implements Contratacao {
    private final double premio = 0.20;

    // Construtor
    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario) {
        super(nome, dataNascimento, sexo, setor, salario);
    }

    // Implementação do método da interface Contratacao
    @Override
    public boolean contratar(Funcionario funcionario) {
        return true;
    }

    // Implementação do método abstrato da classe Funcionario
    @Override
    public double getSalarioFinal() {
        return getSalario() + (getSalario() * premio);
    }

    // Getter para premio (apenas getter pois é final)
    public double getPremio() {
        return premio;
    }

    @Override
    public String toString() {
        return "Diretor{" +
               "nome='" + getNome() + '\'' +
               ", dataNascimento='" + getDataNascimento() + '\'' +
               ", sexo=" + getSexo().getDescricao() +
               ", setor=" + getSetor().getDescricao() +
               ", salario=" + getSalario() +
               ", premio=" + (premio * 100) + "%" +
               ", salarioFinal=" + getSalarioFinal() +
               '}';
    }
}
