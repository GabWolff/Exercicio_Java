
import java.util.Scanner;
//Cálculo de Média: Crie um programa que solicite três notas ao usuário e

public class Media {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("Aprovado com média: " + media);
        } else if (media >= 5.0) {
            System.out.println("Recuperação com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }
    }
}
