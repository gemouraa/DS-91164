package atividade;

public class Placa extends Fornecedor{
    private String soquete;

    public Placa(String soquete, String marca, String modelo) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "Placa [marca=" + marca + ", soquete=" + soquete + ", modelo=" + modelo + "]";
    }

   
}
