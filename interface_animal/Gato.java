package interface_animal;

public class Gato implements Animal {
    @Override
    public String emitirsom() {
        return "Miau";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
