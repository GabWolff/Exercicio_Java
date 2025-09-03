
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero: ");
            int num1 = input.nextInt();

            System.out.println("Digite o segundo numero: ");
            int num2 = input.nextInt();

            int soma = num1 + num2;

            System.out.println("A soma dos dois numeros é: " + soma);
        }
    }
}
