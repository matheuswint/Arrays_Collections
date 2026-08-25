import java.util.Scanner;
import java.util.ArrayList;

public class BuyList {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> listaProdutos = new ArrayList<String>();

        int opcao = 0;

        try {

            do {
                System.out.println("\n===== LISTA DE COMPRAS =====");
                System.out.println("1 - Adicionar produto");
                System.out.println("2 - Remover produto");
                System.out.println("3 - Listar produtos");
                System.out.println("4 - Consultar produto");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.print("Digite o nome do produto: ");
                        String novoProduto = entrada.nextLine();

                        listaProdutos.add(novoProduto);

                        System.out.println("Produto adicionado.");
                        break;

                    case 2:
                        System.out.print("Digite o produto que deseja remover: ");
                        String produtoRemover = entrada.nextLine();

                        if (listaProdutos.remove(produtoRemover)) {
                            System.out.println("Produto removido.");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }

                        break;

                    case 3:
                        System.out.println("\n===== PRODUTOS =====");

                        for (String produto : listaProdutos) {
                            System.out.println(produto);
                        }

                        break;

                    case 4:
                        System.out.print("Digite o produto para consultar: ");
                        String produtoConsulta = entrada.nextLine();

                        if (listaProdutos.contains(produtoConsulta)) {
                            System.out.println(
                                "O produto está presente na lista."
                            );
                        } else {
                            System.out.println(
                                "O produto não está presente na lista."
                            );
                        }

                        break;

                    case 5:
                        System.out.println("Programa encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

            } while (opcao != 5);

        } catch (Exception erro) {
            System.out.println("Erro na entrada de dados.");
        }

        entrada.close();
    }
}