package atividade;

public class Memoria extends Fornecedor {
    private String armazenamento;
    private String frequencia;

    public Memoria(String armazenamento, String frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
        this.frequencia = frequencia;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", armazenamento=" + armazenamento + ", modelo=" + modelo + ", frequencia="
                + frequencia + "]";
    }

    

    
    
    }

  



