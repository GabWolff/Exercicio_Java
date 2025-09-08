import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos termos da série de Fibonacci você quer ver?");
        int quantidadeDeTermos = input.nextInt(); // Mudei o nome da variável para ficar mais claro

        int a = 0;
        int b = 1;

        System.out.println("--- Os " + quantidadeDeTermos + " primeiros termos da série de Fibonacci ---");

        // O laço agora controla a QUANTIDADE de termos a serem impressos
        for (int i = 1; i <= quantidadeDeTermos; i++) {
            System.out.print(a + " "); // Imprime o termo atual da sequência

            // A lógica de atualização continua a mesma
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println(); // Pula uma linha no final
    }
}
