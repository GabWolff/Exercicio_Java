
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite um numnero: ");
            double num1 = input.nextDouble();

            System.out.println("Digite o segundo numero: ");
            double num2 = input.nextDouble();

            System.out.println("Soma é: " + (num1 + num2));
            System.out.println("Subtração é: " + (num1 - num2));
            System.out.println("Multiplicação é: " + (num1 * num2));
            System.out.println("Divisão é: " + (num1 / num2));
        }
    }
}
