package matematica;

public class MainMatematica {
    public static void main(String[] args) {
        OperacaoMatematica[] operacoes = new OperacaoMatematica[3];
        operacoes[0] = new Soma();
        operacoes[1] = new Subtracao();
        operacoes[2] = new Divisao();
        
        double a = 10;
        double b = 2;
        
        System.out.println("=== Operações Matemáticas ===");
        System.out.println("Valores: a = " + a + ", b = " + b);
        System.out.println("-------------------------");
        
        for (OperacaoMatematica operacao : operacoes) {
            String nomeOperacao = operacao.getClass().getSimpleName();
            double resultado = operacao.calcular(a, b);
            System.out.println(nomeOperacao + ": " + resultado);
        }
    }
}
