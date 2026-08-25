import java.util.Scanner;
import java.util.HashMap;

public class Estoque {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        HashMap<String, Integer> produtos =
                new HashMap<String, Integer>();

        int opcao = 0;

        try {

            do {
                System.out.println("\n===== ESTOQUE =====");
                System.out.println("1 - Cadastrar produto");
                System.out.println("2 - Consultar estoque");
                System.out.println("3 - Alterar quantidade");
                System.out.println("4 - Excluir produto");
                System.out.println("5 - Mostrar produtos");
                System.out.println("6 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.print("Nome do produto: ");
                        String nomeProduto = entrada.nextLine();

                        System.out.print("Quantidade: ");
                        int quantidade = entrada.nextInt();

                        produtos.put(nomeProduto, quantidade);

                        System.out.println("Produto cadastrado com sucesso.");
                        break;

                    case 2:
                        System.out.print("Digite o nome do produto: ");
                        String produtoConsulta = entrada.nextLine();

                        if (produtos.containsKey(produtoConsulta)) {
                            System.out.println(
                                "Quantidade disponível: "
                                + produtos.get(produtoConsulta)
                            );
                        } else {
                            System.out.println("Produto não encontrado.");
                        }

                        break;

                    case 3:
                        System.out.print("Digite o produto: ");
                        String produtoAlterar = entrada.nextLine();

                        if (produtos.containsKey(produtoAlterar)) {

                            System.out.print("Digite a nova quantidade: ");
                            int quantidadeNova = entrada.nextInt();

                            produtos.put(produtoAlterar, quantidadeNova);

                            System.out.println("Quantidade alterada.");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }

                        break;

                    case 4:
                        System.out.print("Digite o produto que deseja remover: ");
                        String produtoRemover = entrada.nextLine();

                        if (produtos.containsKey(produtoRemover)) {

                            produtos.remove(produtoRemover);

                            System.out.println("Produto removido.");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }

                        break;

                    case 5:
                        System.out.println("\n===== PRODUTOS =====");

                        for (String nome : produtos.keySet()) {
                            System.out.println(
                                nome + " - " + produtos.get(nome)
                            );
                        }

                        break;

                    case 6:
                        System.out.println("Programa encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

            } while (opcao != 6);

        } catch (Exception erro) {
            System.out.println("Erro na entrada de dados.");
        }

        entrada.close();
    }
}