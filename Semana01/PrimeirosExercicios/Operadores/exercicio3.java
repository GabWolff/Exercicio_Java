
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:  ");
        int num1 = pergunta.nextInt();

        System.out.println("Digite o segundo numero inteiro:  ");
        int num2 = pergunta.nextInt();

        System.out.println("Digite o terceiro numero inteiro:  ");
        int num3 = pergunta.nextInt();

        int calulo = (num1 + num2 + num3) / 3;

        System.out.println("A média dos três numeros é: " + calulo);
    }

}
