public class Endereco{

    private String logradouro;
    private String cidade;
    private String numero;

    public Endereco() {
    }

    public Endereco(String cidade, String logradouro, String numero) {
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Endereco{");
        sb.append("logradouro=").append(logradouro);
        sb.append(", cidade=").append(cidade);
        sb.append(", numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }


}