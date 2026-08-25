import java.util.Scanner;

public class BuscarNumArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        try {

            for (int posicao = 0; posicao < 10; posicao++) {
                System.out.print(
                    "Digite o número da posição " + posicao + ": "
                );

                numeros[posicao] = entrada.nextInt();
            }

            System.out.print("\nDigite um número para procurar: ");
            int numeroBusca = entrada.nextInt();

            boolean achou = false;

            for (int posicao = 0; posicao < 10; posicao++) {

                if (numeros[posicao] == numeroBusca) {
                    System.out.println(
                        "Número encontrado na posição: " + posicao
                    );

                    achou = true;
                }
            }

            if (!achou) {
                System.out.println("Número não foi localizado.");
            }

        } catch (Exception erro) {
            System.out.println("Erro na entrada de dados.");
        }

        entrada.close();
    }
}