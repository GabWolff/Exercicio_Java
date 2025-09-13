
import java.util.Scanner;

public class SomaInterativa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.println("Deseja sair? Digite 0 para sair ou qualquer outro numero para continuar: ");
        do {
            System.out.println("Digite um numero para somar: ");
            numero = input.nextInt();

            soma += numero;
            System.out.println("A soma atual é: " + soma + " + " + numero);

        } while (numero != 0);
        System.out.println("A soma final é: " + soma);
        System.out.println("Programa encerrado.");
        input.close();
    }

}
