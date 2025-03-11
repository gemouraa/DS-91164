package atividade;

public class MainFornecedor {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD", "Ryzen 7 5700g","4.6ghz");
        Memoria memoria1 = new Memoria("2x 8gb", "3200mhz", "Mancer", "RGB");
        Placa placa1 = new Placa("AM4", "Gigabyte", "B450M");
        DispositivoArmazenamento dispositivoArmazenamento1 = new DispositivoArmazenamento(
            "1tb", "Sata", "Mancer", "Linux");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
        System.out.println(placa1.toString());
        System.out.println(dispositivoArmazenamento1.toString());
    }

}
