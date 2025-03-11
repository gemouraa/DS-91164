package interface_animal;

public class MainAnimal {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Galo galo = new Galo();
        Pato pato = new Pato();
        
        System.out.println("Gato: " + gato.emitirsom() + " - " + gato.comer());
        System.out.println("Cachorro: " + cachorro.emitirsom() + " - " + cachorro.comer());
        System.out.println("Galo: " + galo.emitirsom() + " - " + galo.comer());
        System.out.println("Pato: " + pato.emitirsom() + " - " + pato.comer());
    }
}