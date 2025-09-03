
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite a sua primeira nota: ");
            double nota1 = input.nextDouble();

            System.out.println("Digite a sua segunda nota: ");
            Double nota2 = input.nextDouble();

            double media = (nota1 + nota2) / 2;
            boolean aprovado = media >= 6.5;

            System.out.println("A média das notas é: " + media);
            System.out.println("O aluno está aprovado? " + aprovado);
        }
    }
}
