package atividade;

public class MainFornecedor {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD", "Ryzen 7 5700g","4.6ghz");
        Memoria memoria1 = new Memoria("500gb", "Mancer", "Sata");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
    }

}
