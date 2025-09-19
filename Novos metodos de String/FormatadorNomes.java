
import java.util.Scanner;

public class FormatadorNomes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCompleto = input.nextLine();

        String nomeLimpo = nomeCompleto.trim();
        String nomePadronizado = nomeLimpo.toUpperCase();

        System.out.println("--- Analise de nome ---");
        System.out.println("Nome \"limpo\": " + nomePadronizado);

        boolean contemSilva = nomePadronizado.contains("SILVA");

        System.out.println("Contem o sobrenome Silva?");
        if (contemSilva) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        int indiceDoPrimeiroEspaco = nomePadronizado.indexOf("");
        String primeiroNome;

        if (indiceDoPrimeiroEspaco == -1) {
            primeiroNome = nomePadronizado;
        } else {
            primeiroNome = nomePadronizado.substring(0, indiceDoPrimeiroEspaco);
        }

        System.out.println("O primeiro nome é: " + primeiroNome);

        input.close();

    }
}
