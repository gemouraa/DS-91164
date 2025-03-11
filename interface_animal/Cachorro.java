package interface_animal;

public class Cachorro implements Animal {
    @Override
    public String emitirsom() {
        return "Au Au";
    }

    @Override
    public String comer() {
        return "Ração";
    }
    

}
