import java.util.Scanner;

public class VerificadorDePrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro para verificar se é primo: ");
        int numero = input.nextInt();

        boolean ehPrimo = true; // Assume que o número é primo

        // Números menores que 2 não são primos
        if(numero < 2){
            ehPrimo = false;
        } else {
            // Verifica se o número é divisível por algum número entre 2 e a raiz quadrada de 'numero'
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false; // Encontrou um divisor, não é primo
                    break; // Sai do laço, não precisa verificar mais
                }
            }
        }

        if (ehPrimo){
            System.out.println(numero + " é um numero primo.");
        } else {
            System.out.println(numero + " não é um numero primo.");
        }
    }
}
