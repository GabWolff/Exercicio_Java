import java.util.Scanner;
public class InversorDePalavra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = input.nextLine();

        String palavraInvertida = "";

        for(int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }
        System.out.println("A palavra invertida é: " + palavraInvertida);
    }
}
