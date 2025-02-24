package pessoa;

public abstract class Pessoa {
    protected String nome;
    protected String idade;

    public Pessoa() {
    }

    public Pessoa(String idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", getNome()=" + getNome() + ", getIdade()=" + getIdade()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
   
}