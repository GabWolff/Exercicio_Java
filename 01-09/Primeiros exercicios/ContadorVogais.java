import java.util.Scanner;

public class ContadorVogais {   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma frase:") ;
        String frase = leitor.nextLine().toLowerCase();

        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            char caractere = frase.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u'){
                contador++;
            }
            System.err.println("Número de vogais: " + contador);
            leitor.close();
        }
    }
}   


