import java.util.Scanner;

public class CadastrarNotas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Digite a quantidade de alunos: ");
            int quantidadeAlunos = entrada.nextInt();

            double[] notas = new double[quantidadeAlunos];

            double somaNotas = 0;
            double maiorNota = 0;
            double menorNota = 10;
            int totalAprovados = 0;

            for (int aluno = 0; aluno < quantidadeAlunos; aluno++) {

                System.out.print(
                    "Digite a nota do aluno " + (aluno + 1) + ": "
                );

                notas[aluno] = entrada.nextDouble();

                somaNotas += notas[aluno];

                if (notas[aluno] > maiorNota) {
                    maiorNota = notas[aluno];
                }

                if (notas[aluno] < menorNota) {
                    menorNota = notas[aluno];
                }

                if (notas[aluno] >= 6) {
                    totalAprovados++;
                }
            }

            double mediaTurma = somaNotas / quantidadeAlunos;

            System.out.println("\n===== RESULTADO =====");
            System.out.println("Média da turma: " + mediaTurma);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Aprovados: " + totalAprovados);

            System.out.println("\n===== SITUAÇÃO DOS ALUNOS =====");

            for (int aluno = 0; aluno < quantidadeAlunos; aluno++) {

                if (notas[aluno] >= 6) {
                    System.out.println(
                        "Aluno " + (aluno + 1) + ": Aprovado"
                    );
                } else {
                    System.out.println(
                        "Aluno " + (aluno + 1) + ": Reprovado"
                    );
                }
            }

        } catch (Exception erro) {
            System.out.println("Erro na entrada de dados.");
        }

        entrada.close();
    }
}