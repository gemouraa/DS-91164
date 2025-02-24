package pessoa;

public class Cliente extends Pessoa {
    private String dataDaCompra;
    private String formaDePagamento;

    public Cliente(String dataDaCompra, String formaDePagamento, String idade, String nome) {
        super(idade, nome);
        this.dataDaCompra = dataDaCompra;
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(String dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", dataDaCompra=" + dataDaCompra + ", idade=" + idade + ", formaDePagamento="
                + formaDePagamento + ", toString()=" + super.toString() + ", getDataDaCompra()=" + getDataDaCompra()
                + ", getFormaDePagamento()=" + getFormaDePagamento() + ", getNome()=" + getNome() + ", getIdade()="
                + getIdade() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

}
