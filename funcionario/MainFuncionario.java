package funcionario;

public class MainFuncionario {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("João","joao@gmail", 5000,new Endereco("Rua 1", "123","Atras","444444", "mossoro"), "123456");
        Medico medico = new Medico("Maria","maria@gmail", 10000,new Endereco("Rua 2", "456","atras da rua","404040404","Salvador"), "654321");

        System.out.println(engenheiro);
        System.out.println("\n");
        System.out.println(medico);
    }
}