package Produto;

public abstract class Modelo {
    protected String marca;
    protected String cor;
    protected String dor;
    protected String preco;
    public Modelo(String marca, String cor, String dor, String preco) {
        this.marca = marca;
        this.cor = cor;
        this.dor = dor;
        this.preco = preco;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getDor() {
        return dor;
    }
    public void setDor(String dor) {
        this.dor = dor;
    }
    public String getPreco() {
        return preco;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
    
    

}
