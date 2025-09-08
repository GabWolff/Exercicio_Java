import java.util.Scanner;

public class DesenhadorDeFormas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro para o tamanho das formas: ");
        int numero = input.nextInt();

        // --- QUADRADO ---
        System.out.println("\n--- Quadrado ---");
        // Laço das linhas
        for (int i = 1; i <= numero; i++) {
            // Laço das colunas (imprime uma linha)
            for (int j = 1; j <= numero; j++) {
                System.out.print("* "); // USA 'PRINT'
            }
            // Pula para a próxima linha DEPOIS que a linha foi impressa
            System.out.println();
        }

        // --- TRIÂNGULO CORRIGIDO E OTIMIZADO ---
        System.out.println("\n--- Triângulo Retângulo ---");
        // Laço das linhas
        for (int i = 1; i <= numero; i++) {
            // Laço das colunas (imprime 'i' asteriscos)
            // O laço interno agora só vai até 'i'
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // USA 'PRINT'
            }
            // Pula para a próxima linha
            System.out.println();
        }
    }
}
