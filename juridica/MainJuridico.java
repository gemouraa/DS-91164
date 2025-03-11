package juridica;

public class MainJuridico {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("João", "123456789", "Rua 1", "123456789", "123456", "01/01/2000");
        Juridica juridica = new Juridica("Empresa", "987654321", "Rua 2", "987654321", "987654");

        System.out.println(fisica);
        System.out.println("\n");
        System.out.println(juridica);
    }
}