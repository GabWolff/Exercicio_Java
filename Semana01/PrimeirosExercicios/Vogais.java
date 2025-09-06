
import java.util.Scanner;
//Crie um programa que peça ao usuário para digitar uma palavra. Em seguida, o programa deve contar e exibir quantas vogais (a, e, i, o, u) essa palavra possui.

public class Vogais {

    public static void main(String[] args) {
        Scanner Palavra = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = Palavra.nextLine().toLowerCase();

        int contadorVogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char Letra = palavra.charAt(i);
            if (Letra == 'a' || Letra == 'e' || Letra == 'i' || Letra == 'o' || Letra == 'u') {
                contadorVogais++;
            }
        }
        System.out.println("A palavra '" + palavra + "' possui " + contadorVogais + " vogais.");
    }
}
