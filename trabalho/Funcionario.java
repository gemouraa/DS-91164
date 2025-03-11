package trabalho;

public abstract class Funcionario {
    private String nome;
    private String dataNascimento;
    private Sexo sexo;
    private Setor setor;
    private double salario;

    // Construtor
    public Funcionario(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
    }

    // Método abstrato
    public abstract double getSalarioFinal();

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
               "nome='" + nome + '\'' +
               ", dataNascimento='" + dataNascimento + '\'' +
               ", sexo=" + sexo.getDescricao() +
               ", setor=" + setor.getDescricao() +
               ", salario=" + salario +
               ", salarioFinal=" + getSalarioFinal() +
               '}';
    }
}
