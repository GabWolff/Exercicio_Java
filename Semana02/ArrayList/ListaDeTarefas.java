import java.util.Scanner;
import java.util.ArrayList;


public class ListaDeTarefas { 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao;

        // O laço 'do-while' começa aqui
        do {
            // 1. Mostra o menu
            System.out.println("\n--- MENU DE TAREFAS ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine(); // Consome a nova linha pendente!

            // 2. Executa a ação DENTRO do laço
            if (opcao == 1) {
                System.out.print("Digite a nova tarefa: ");
                String tarefa = input.nextLine();
                tarefas.add(tarefa);
                System.out.println(">> Tarefa adicionada com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\n--- SUAS TAREFAS ---");
                if (tarefas.isEmpty()) {
                    System.out.println("A lista de tarefas está vazia.");
                } else {
                    for (int i = 0; i < tarefas.size(); i++) {
                        // Lógica perfeita para mostrar o número correto ao usuário
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite o número da tarefa a ser removida: ");
                int numeroTarefa = input.nextInt();
                // Lógica perfeita para converter o número do usuário para o índice do array
                if (numeroTarefa > 0 && numeroTarefa <= tarefas.size()) {
                    tarefas.remove(numeroTarefa - 1);
                    System.out.println(">> Tarefa removida com sucesso!");
                } else {
                    System.out.println("!! Número de tarefa inválido.");
                }

            } else if (opcao == 4) {
                System.out.println("Saindo do programa. Até mais!");

            } else {
                System.out.println("!! Opção inválida. Tente novamente.");
            }

        // A chave do 'do' fecha aqui, englobando toda a lógica
        } while (opcao != 4);

        input.close(); // fecha o Scanner para liberar recursos.
    }
}
