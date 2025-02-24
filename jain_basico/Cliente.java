public class Cliente {
    private String nome;
    private String idade;
    private double cpf;
    private Endereco endereco;
    private int telefone;

    public Cliente() {
    }

    public Cliente(double cpf, Endereco endereco, String idade, String nome, int telefone) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade = idade;
        this.nome = nome;
        this.telefone = telefone;
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

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", cpf=").append(cpf);
        sb.append(", endereco=").append(endereco);
        sb.append(", telefone=").append(telefone);
        sb.append('}');
        return sb.toString();
    }

}