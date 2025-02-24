package pessoa;

public class Funcionario extends Pessoa {

    private String matricula;
    private String cargo;
    private double salario;

    public Funcionario(String cargo, String matricula, double salario, String idade, String nome) {
        super(idade, nome);
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + ", cargo=" + cargo
                + ", salario=" + salario + ", toString()=" + super.toString() + ", getMatricula()=" + getMatricula()
                + ", getCargo()=" + getCargo() + ", getNome()=" + getNome() + ", getSalario()=" + getSalario()
                + ", getIdade()=" + getIdade() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
