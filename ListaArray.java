import java.util.Scanner;
import java.util.ArrayList;

public class ListaArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];
        ArrayList<Integer> lista = new ArrayList<Integer>();

        int opcao;

        try {

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Inserir valores");
                System.out.println("2 - Listar estruturas");
                System.out.println("3 - Calcular estatísticas");
                System.out.println("4 - Encerrar");
                System.out.print("Digite uma opção: ");

                opcao = entrada.nextInt();

                switch (opcao) {

                    case 1:
                        lista.clear();

                        for (int posicao = 0; posicao < 5; posicao++) {

                            System.out.print(
                                "Digite o " + (posicao + 1) + "º número: "
                            );

                            numeros[posicao] = entrada.nextInt();
                            lista.add(numeros[posicao]);
                        }

                        System.out.println("Valores adicionados com sucesso.");
                        break;

                    case 2:
                        System.out.println("\n--- ARRAY ---");

                        for (int posicao = 0; posicao < 5; posicao++) {
                            System.out.println(numeros[posicao]);
                        }

                        System.out.println("\n--- ARRAYLIST ---");

                        for (Integer numero : lista) {
                            System.out.println(numero);
                        }

                        break;

                    case 3:
                        int soma = 0;
                        int maiorValor = numeros[0];

                        for (int posicao = 0; posicao < 5; posicao++) {

                            soma += numeros[posicao];

                            if (numeros[posicao] > maiorValor) {
                                maiorValor = numeros[posicao];
                            }
                        }

                        System.out.println("Soma dos valores: " + soma);
                        System.out.println("Maior valor: " + maiorValor);

                        break;

                    case 4:
                        System.out.println("Programa encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

            } while (opcao != 4);

        } catch (Exception erro) {
            System.out.println("Ocorreu um erro na entrada de dados.");
        }

        entrada.close();
    }
}