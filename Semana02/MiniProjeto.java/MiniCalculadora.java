
import java.util.Scanner;

public class MiniCalculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao; // Usaremos esta variável para controlar o menu e o laço

        do {
            // 1. MOSTRAR O MENU E LER A OPÇÃO
            System.out.println("\n--- Mini Calculadora ---");
            System.out.println("[1] Somar");
            System.out.println("[2] Subtrair");
            System.out.println("[3] Multiplicar");
            System.out.println("[4] Dividir");
            System.out.println("[0] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            // 2. DECIDIR O QUE FAZER COM BASE NA OPÇÃO
            // Se a opção for uma operação de cálculo (1 a 4)
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = input.nextDouble(); // Usar double para permitir divisão com casas decimais

                System.out.print("Digite o segundo número: ");
                double num2 = input.nextDouble();

                if (opcao == 1) {
                    double soma = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + soma);
                } else if (opcao == 2) {
                    double subtracao = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + subtracao);
                } else if (opcao == 3) {
                    double multiplicacao = num1 * num2;
                    System.out.println("Resultado: " + num1 + " x " + num2 + " = " + multiplicacao);
                } else if (opcao == 4) {
                    // VERIFICA ANTES de calcular
                    if (num2 == 0) {
                        System.out.println("Erro: Não é possível dividir por zero.");
                    } else {
                        double divisao = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + divisao);
                    }
                }
                // Se a opção for Sair (0)
            } else if (opcao == 0) {
                System.out.println("Obrigado por usar a calculadora!");
                // Se for qualquer outra coisa
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            // 3. CONDIÇÃO DE REPETIÇÃO
        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        input.close();
    }
}
