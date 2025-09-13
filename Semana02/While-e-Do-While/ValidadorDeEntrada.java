
import java.util.Scanner;

public class ValidadorDeEntrada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero entre 1 e 10: ");
        int numeroDigitado = input.nextInt();

        while (numeroDigitado < 1 || numeroDigitado > 10) {
            System.out.println("Numero Invalido. Tente novamente: " + numeroDigitado);
            numeroDigitado = input.nextInt();
        }

        System.out.println("Você digitou o " + numeroDigitado + ". Programa encerrado.");
        input.close();
    }
}
