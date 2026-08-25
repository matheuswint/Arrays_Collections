import java.util.Scanner;
import java.util.ArrayList;

public class CalcHist {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> historico = new ArrayList<Double>();

        int opcao = 0;

        try {

            while (opcao != 4) {

                System.out.println("\n===== MENU =====");
                System.out.println("1 - Nova operação");
                System.out.println("2 - Mostrar histórico");
                System.out.println("3 - Apagar histórico");
                System.out.println("4 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = entrada.nextInt();

                switch (opcao) {

                    case 1:
                        System.out.print("Digite o primeiro número: ");
                        double numero1 = entrada.nextDouble();

                        System.out.print("Digite o segundo número: ");
                        double numero2 = entrada.nextDouble();

                        System.out.println("\nEscolha a operação:");
                        System.out.println("1 - Adição");
                        System.out.println("2 - Subtração");
                        System.out.println("3 - Multiplicação");
                        System.out.println("4 - Divisão");
                        System.out.print("Operação: ");

                        int operacao = entrada.nextInt();
                        double resultado = 0;

                        switch (operacao) {

                            case 1:
                                resultado = numero1 + numero2;
                                break;

                            case 2:
                                resultado = numero1 - numero2;
                                break;

                            case 3:
                                resultado = numero1 * numero2;
                                break;

                            case 4:
                                if (numero2 == 0) {
                                    System.out.println(
                                        "Não é possível dividir por zero."
                                    );
                                } else {
                                    resultado = numero1 / numero2;
                                }
                                break;

                            default:
                                System.out.println("Operação inválida.");
                                break;
                        }

                        if (operacao >= 1 && operacao <= 3) {
                            historico.add(resultado);
                            System.out.println("Resultado: " + resultado);
                        }

                        if (operacao == 4 && numero2 != 0) {
                            historico.add(resultado);
                            System.out.println("Resultado: " + resultado);
                        }

                        break;

                    case 2:
                        System.out.println("\n===== HISTÓRICO =====");

                        if (historico.isEmpty()) {
                            System.out.println("Nenhuma operação registrada.");
                        } else {
                            for (Double valor : historico) {
                                System.out.println(valor);
                            }
                        }

                        break;

                    case 3:
                        historico.clear();
                        System.out.println("Histórico apagado.");
                        break;

                    case 4:
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