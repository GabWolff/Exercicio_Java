
import java.util.Scanner;
//Inversor de Frases: Crie um programa que solicite uma frase ao usuário e exiba a frase invertida.

public class InversorDeFrases {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String fraseOriginal = input.nextLine();

        String[] palavras = fraseOriginal.split(" ");

        System.out.println("A frase invertida é: ");

        for (int i = palavras.length - 1; i >= 0; i--) {
            System.out.println(palavras[i] + " ");
        }

        System.out.println();
    }
}
