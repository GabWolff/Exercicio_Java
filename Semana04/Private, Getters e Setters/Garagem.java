
import java.util.ArrayList;
import java.util.Scanner;

public class Garagem {

    public static void main(String[] args) {
        ArrayList<Carro> minhaGaragem = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int opcao;

        do {

            for (int i = 0; i < 10; i++) {
                System.out.println();
            }

            System.out.println("--- Menu da Garagem ---");
            System.out.println("1. Adicionar um novo carro");
            System.out.println("2. Listar Carros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine(); // Consome a quebra de linha

            if (opcao == 1) {
                System.out.print("\nDigite a marca do seu carro: ");
                String marca = input.nextLine();

                System.out.print("Digite o modelo do seu carro: ");
                String modelo = input.nextLine();

                System.out.print("Digite o ano do seu carro: ");
                int ano = input.nextInt();
                input.nextLine(); // Consome a quebra de linha

                Carro carro = new Carro(marca, modelo, ano);
                minhaGaragem.add(carro);

                System.out.println("\nCarro adicionado com Sucesso!");
                System.out.print("Pressione Enter para continuar...");
                input.nextLine(); // Pausa para o usuário ler a mensagem

            } else if (opcao == 2) {
                // Verificar se a garagem está vazia antes de tentar listar.
                if (minhaGaragem.isEmpty()) {
                    System.out.println("\nA garagem está vazia. Adicione um carro primeiro.");
                } else {
                    System.out.println("\n--- Carros na Garagem ---");
                    for (Carro carroDaVez : minhaGaragem) {
                        carroDaVez.exibirInfo();
                        System.out.println("-----------------------");
                    }
                    int total = Carro.getTotalDeCarrosFabricados();
                    System.out.println("\nTotal de carros fabricados até agora: " + total);

                }
                System.out.print("\nPressione Enter para continuar...");
                input.nextLine(); // Pausa para o usuário ver a lista

            } else if (opcao == 0) {
                System.out.println("\nSaindo do programa...");
            } else {
                System.out.println("\nOpção inválida. Tente novamente.");
                System.out.print("Pressione Enter para continuar...");
                input.nextLine(); // Pausa para o usuário ler a mensagem
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        input.close();
    }
}
