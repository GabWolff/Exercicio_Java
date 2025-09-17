
import java.util.Scanner;

public class DiarioDeNotasAutomatizadas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = input.nextDouble();
        }

        double soma = 0.0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println();
        System.out.println("---Resultados---");
        System.out.println("A soma das notas é: " + soma);
        System.out.println("A media das notas é: " + media);

        input.close();
    }
}
