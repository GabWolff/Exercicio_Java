
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();

        System.out.println(" Olá " + nome + ", você tem " + idade + " anos.");
        input.close();
    }
}
