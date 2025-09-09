import java.util.Scanner;

public class RemoverdorDeVogais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = input.nextLine();
        String fraseSemVogal = "";

        for(int i = 0; i < frase.length(); i++){
            char caractere = frase.charAt(i);
            if(caractere != 'a' && caractere != 'e' && caractere != 'i' && caractere != 'o' && caractere != 'u' &&
               caractere != 'A' && caractere != 'E' && caractere != 'I' && caractere != 'O' && caractere != 'U'){
                fraseSemVogal += caractere;
            }
        }
        System.out.println("Frase sem vogais: " + fraseSemVogal);
    }
}