package atividade;

public class DispositivoArmazenamento extends Fornecedor{
    private String capacidade;
    private String conexao;

    public DispositivoArmazenamento(String capacidade, String conexao, String marca, String modelo) {
        super(marca, modelo);
        this.capacidade = capacidade;
        this.conexao = conexao;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getConexao() {
        return conexao;
    }

    public void setConexao(String conexao) {
        this.conexao = conexao;
    }

    @Override
    public String toString() {
        return "DispositivoArmazenamento [marca=" + marca + ", capacidade=" + capacidade + ", modelo=" + modelo
                + ", conexao=" + conexao + "]";
    }

}
