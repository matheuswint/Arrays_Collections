import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[15];

        try {

            for (int posicao = 0; posicao < 15; posicao++) {
                System.out.print(
                    "Digite o " + (posicao + 1) + "º número: "
                );

                numeros[posicao] = entrada.nextInt();
            }

            int totalPares = 0;
            int totalImpares = 0;

            System.out.println("\n===== NÚMEROS PARES =====");

            for (int posicao = 0; posicao < 15; posicao++) {

                if (numeros[posicao] % 2 == 0) {
                    System.out.println(numeros[posicao]);
                    totalPares++;
                }
            }

            System.out.println("\n===== NÚMEROS ÍMPARES =====");

            for (int posicao = 0; posicao < 15; posicao++) {

                if (numeros[posicao] % 2 != 0) {
                    System.out.println(numeros[posicao]);
                    totalImpares++;
                }
            }

            System.out.println("\nQuantidade de pares: " + totalPares);
            System.out.println(
                "Quantidade de ímpares: " + totalImpares
            );

        } catch (Exception erro) {
            System.out.println("Erro na entrada de dados.");
        }

        entrada.close();
    }
}