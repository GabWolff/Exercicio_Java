import java.util.Scanner;

public class DoisNumeros {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número:");
            int num1 = leitor.nextInt();

            System.out.println("Digite o segundo número:");
            int num2 = leitor.nextInt();

            int soma = num1 + num2;
            System.out.println("A soma dos dois números é: " + soma);
        }
    }
}
