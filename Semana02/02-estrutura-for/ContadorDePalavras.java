import java.util.Scanner;
public class ContadorDePalavras {
    //Contador de palavras e de palavras com mais de 5 caracteres.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = input.nextLine();

        String[] palavras = frase.split(" ");
        int contadorPalavras = 0;
        int contadorPalavrasComMaisDeCincoCaracteres = 0;
        for (int i = 0; i < palavras.length; i++){
            contadorPalavras++;
            if (palavras[i].length() > 5){
                contadorPalavrasComMaisDeCincoCaracteres++;
                System.out.println(palavras[i]);
            }
        }
        System.out.println("A frase possui " + contadorPalavras + " palavras.");
        System.out.println("A frase possui " + contadorPalavrasComMaisDeCincoCaracteres + " palavras com mais de 5 caracteres.");
    }
    
}
