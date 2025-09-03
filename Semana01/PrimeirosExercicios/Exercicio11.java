
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite o seu nome: ");
            String nome = input.nextLine();

            System.out.println("Digite a sua idade: ");
            int idade = input.nextInt();

            System.out.println("Digite a sua altura: ");
            double altura = input.nextDouble();

            System.out.println(" Olá " + nome + ", você tem " + idade + " anos e sua altura é " + altura + " metros.");

            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade. ");
            }
        }
    }
}
