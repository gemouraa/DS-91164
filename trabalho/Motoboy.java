package trabalho;

public class Motoboy extends Funcionario {
    private String carteiraDeMotorista;

    // Construtor
    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, 
                   double salario, String carteiraDeMotorista) {
        super(nome, dataNascimento, sexo, setor, salario);
        this.carteiraDeMotorista = carteiraDeMotorista;
    }

    // Implementação do método abstrato
    @Override
    public double getSalarioFinal() {
        return getSalario() + 300.0; // Adiciona bonus fixo de R$ 300,00
    }

    // Getter
    public String getCarteiraDeMotorista() {
        return carteiraDeMotorista;
    }

    // Setter
    public void setCarteiraDeMotorista(String carteiraDeMotorista) {
        this.carteiraDeMotorista = carteiraDeMotorista;
    }

    // ToString
    @Override
    public String toString() {
        return "Motoboy{" +
               "nome='" + getNome() + '\'' +
               ", dataNascimento='" + getDataNascimento() + '\'' +
               ", sexo=" + getSexo().getDescricao() +
               ", setor=" + getSetor().getDescricao() +
               ", salario=" + getSalario() +
               ", salarioFinal=" + getSalarioFinal() +
               ", carteiraDeMotorista='" + carteiraDeMotorista + '\'' +
               '}';
    }
}
