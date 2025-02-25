package atividade;

public abstract class Fornecedor {
    protected String marca;
    protected String modelo;

    public Fornecedor(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "fornecedor [marca=" + marca + ", modelo=" + modelo + ", getMarca()=" + getMarca() + ", getModelo()="
                + getModelo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

}
