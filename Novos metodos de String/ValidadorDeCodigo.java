
import java.util.Scanner;

public class ValidadorDeCodigo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o codigo do produto: ");
        String codigo = input.nextLine();

        String codigoLimpo = codigo.trim();

        if (codigoLimpo.length() != 8) {
            System.out.println("O comprimento deve ter 8 caracters");
        } else {
            String codigoPadrao = codigoLimpo.toUpperCase();

            if (!codigoPadrao.startsWith("PROD")) {
                System.out.println("Codigo invalido: Não começa com PRDO");
            } else {
                String parteNumerica = codigoPadrao.substring(4);

                boolean parteFinalNumerica = true;

                for (int i = 0; i < parteNumerica.length(); i++) {
                    char caractereAtual = parteNumerica.charAt(i);

                    if (!Character.isDigit(caractereAtual)) {
                        parteFinalNumerica = false;
                        break;
                    }
                }
                if (parteFinalNumerica) {
                    System.out.println("Código valido!");
                } else {
                    System.out.println("Código invalido: A parte final não é numerica");
                }
            }

        }

    }
}
