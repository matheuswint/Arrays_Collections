import java.util.Scanner;
import java.util.HashMap;

public class SistNotas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        HashMap<String, double[]> cadastro =
                new HashMap<String, double[]>();

        int opcao = 0;

        try {

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Cadastrar aluno");
                System.out.println("2 - Consultar notas");
                System.out.println("3 - Calcular média");
                System.out.println("4 - Listar alunos");
                System.out.println("5 - Remover aluno");
                System.out.println("6 - Encerrar");
                System.out.print("Escolha uma opção: ");

                opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.print("Nome do aluno: ");
                        String nomeAluno = entrada.nextLine();

                        if (cadastro.containsKey(nomeAluno)) {
                            System.out.println(
                                "Esse aluno já está cadastrado."
                            );
                        } else {

                            double[] notasAluno = new double[3];

                            for (int posicao = 0; posicao < 3; posicao++) {
                                System.out.print(
                                    "Digite a nota " + (posicao + 1) + ": "
                                );

                                notasAluno[posicao] = entrada.nextDouble();
                            }

                            cadastro.put(nomeAluno, notasAluno);

                            System.out.println(
                                "Aluno cadastrado com sucesso."
                            );
                        }

                        break;

                    case 2:
                        System.out.print("Nome do aluno: ");
                        String alunoConsulta = entrada.nextLine();

                        if (cadastro.containsKey(alunoConsulta)) {

                            double[] notas = cadastro.get(alunoConsulta);

                            for (int posicao = 0; posicao < 3; posicao++) {
                                System.out.println(
                                    "Nota " + (posicao + 1) + ": "
                                    + notas[posicao]
                                );
                            }

                        } else {
                            System.out.println("Aluno não encontrado.");
                        }

                        break;

                    case 3:
                        System.out.print("Nome do aluno: ");
                        String alunoBuscaMedia = entrada.nextLine();

                        if (cadastro.containsKey(alunoBuscaMedia)) {

                            double[] notas = cadastro.get(alunoBuscaMedia);
                            double soma = 0;

                            for (int posicao = 0; posicao < 3; posicao++) {
                                soma += notas[posicao];
                            }

                            double media = soma / 3;

                            System.out.println("Média: " + media);

                            if (media >= 7) {
                                System.out.println("Aprovado.");
                            } else if (media >= 5) {
                                System.out.println("Recuperação.");
                            } else {
                                System.out.println("Reprovado.");
                            }

                        } else {
                            System.out.println("Aluno não encontrado.");
                        }

                        break;

                    case 4:
                        System.out.println("\n===== ALUNOS CADASTRADOS =====");

                        for (String aluno : cadastro.keySet()) {
                            System.out.println(aluno);
                        }

                        break;

                    case 5:
                        System.out.print("Nome do aluno para remover: ");
                        String alunoRemover = entrada.nextLine();

                        if (cadastro.containsKey(alunoRemover)) {
                            cadastro.remove(alunoRemover);
                            System.out.println("Aluno removido.");
                        } else {
                            System.out.println("Aluno não encontrado.");
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