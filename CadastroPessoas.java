import java.util.Scanner;
import java.util.HashSet;

public class CadastroPessoas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        HashSet<String> pessoas = new HashSet<String>();

        int opcao = 0;

        try {

            while (opcao != 5) {

                System.out.println("\n===== MENU =====");
                System.out.println("1 - Cadastrar pessoa");
                System.out.println("2 - Listar pessoas");
                System.out.println("3 - Consultar pessoa");
                System.out.println("4 - Ver quantidade");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.print("Digite o nome da pessoa: ");
                        String nome = entrada.nextLine();

                        if (pessoas.contains(nome)) {
                            System.out.println(
                                "Essa pessoa já foi cadastrada."
                            );
                        } else {
                            pessoas.add(nome);
                            System.out.println(
                                "Pessoa cadastrada com sucesso!"
                            );
                        }

                        break;

                    case 2:
                        System.out.println("\n--- PESSOAS CADASTRADAS ---");

                        for (String pessoa : pessoas) {
                            System.out.println(pessoa);
                        }

                        break;

                    case 3:
                        System.out.print("Digite o nome para consultar: ");
                        String nomeConsulta = entrada.nextLine();

                        if (pessoas.contains(nomeConsulta)) {
                            System.out.println("Pessoa encontrada.");
                        } else {
                            System.out.println("Pessoa não cadastrada.");
                        }

                        break;

                    case 4:
                        System.out.println(
                            "Total de pessoas cadastradas: " + pessoas.size()
                        );
                        break;

                    case 5:
                        System.out.println("Programa encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }

        } catch (Exception erro) {
            System.out.println("Erro na entrada de dados.");
        }

        entrada.close();
    }
}