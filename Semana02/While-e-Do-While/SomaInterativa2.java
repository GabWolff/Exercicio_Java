
import java.util.Scanner;

public class SomaInterativa2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite numeros para somar. Caso queria sair, Digite 0. ");
        System.out.println("Digite um numero para somar: ");
        int NumeroDigitado = input.nextInt();

        while (NumeroDigitado != 0) {
            soma += NumeroDigitado;
            System.out.println("Digite outro Numero");
            NumeroDigitado = input.nextInt();
        }
        System.out.println("A soma final é: " + soma);
        input.close();
        System.out.println("Programa encerrado.");
    }
}
