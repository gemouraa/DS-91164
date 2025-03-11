package interface_animal;

public class Pato implements Animal {
    @Override
    public String emitirsom() {
        return "Quack";
    }

    @Override
    public String comer() {
        return "Ração";
    }

}
