package atividade;

public class Memoria extends Fornecedor {
    private String armazenamento;

    public Memoria(String armazenamento, String marca, String modelo) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", armazenamento=" + armazenamento + ", modelo=" + modelo + "]";
    }



}
