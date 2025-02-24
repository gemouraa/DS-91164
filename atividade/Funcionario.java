public class Funcionario {
    private String id;
    private String nome;
    private String idade;
    private String salario;
    private Sexo sexo;
    private Setor setor;

    public Funcionario() {
    }

    public Funcionario(String id, String idade, String nome, String salario, Setor setor, Sexo sexo) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", salario=").append(salario);
        sb.append(", sexo=").append(sexo);
        sb.append(", setor=").append(setor);
        sb.append('}');
        return sb.toString();
    }
    
    


}
