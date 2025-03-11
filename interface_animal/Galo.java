package interface_animal;

public class Galo implements Animal {
    @Override
    public String emitirsom() {
        return "Cocoricó";
    }

    @Override
    public String comer() {
        return "Milho";
    }

}
