import java.util.Scanner;

public class VerificadorDeSenha{
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite a senha:");
            String senhaDigitada = leitor.nextLine();
            
            if(senhaDigitada.equals("Java123")){
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Acesso negado");
            }
        }
    }
}