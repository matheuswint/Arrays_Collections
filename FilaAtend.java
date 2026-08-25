import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class FilaAtend {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Queue<String> filaClientes = new LinkedList<String>();

        int opcao = 0;

        try {

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Adicionar cliente");
                System.out.println("2 - Atender próximo");
                System.out.println("3 - Ver próximo cliente");
                System.out.println("4 - Mostrar fila");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.print("Digite o nome do cliente: ");
                        String nomeCliente = entrada.nextLine();

                        filaClientes.add(nomeCliente);

                        System.out.println("Cliente adicionado à fila.");
                        break;

                    case 2:
                        if (filaClientes.isEmpty()) {
                            System.out.println("Não há clientes na fila.");
                        } else {
                            String clienteAtendido = filaClientes.poll();

                            System.out.println(
                                "Cliente atendido: " + clienteAtendido
                            );
                        }

                        break;

                    case 3:
                        if (filaClientes.isEmpty()) {
                            System.out.println("Não há clientes na fila.");
                        } else {
                            System.out.println(
                                "Próximo cliente: " + filaClientes.peek()
                            );
                        }

                        break;

                    case 4:
                        if (filaClientes.isEmpty()) {
                            System.out.println("A fila está vazia.");
                        } else {
                            System.out.println("\n===== FILA =====");

                            for (String cliente : filaClientes) {
                                System.out.println(cliente);
                            }
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