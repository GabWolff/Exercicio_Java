
import java.util.Scanner;

public class DiarioDeNotas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notas = new double[4];

        System.out.println("Digite a primeira nota do bimestre: ");
        notas[0] = input.nextDouble();

        System.out.println("Digite a segunda nota do bimestre: ");
        notas[1] = input.nextDouble();

        System.out.println("Digite a terceira nota do bimestre: ");
        notas[2] = input.nextDouble();

        System.out.println("Digite a quarta nota do bimestre: ");
        notas[3] = input.nextDouble();

        double soma = notas[0] + notas[1] + notas[2] + notas[3];

        double media = soma / notas.length;

        System.out.println("A média do aluno é de: " + media);
    }
}
