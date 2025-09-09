import java.util.Scanner;
//Crie um jogo de "adivinhe o número" onde o jogador tem um número limitado de tentativas.
public class AdivinheNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroSecreto = 7;
        int tentativas = 3;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de Adivinhe o Número!");
        System.out.println("Você tem " + tentativas + " tentativas para adivinhar o número entre 1 e 10.");
        for (int i = 1; i <= tentativas; i++){
            System.out.println("Tentativa " + i + ": Digite seu palpite:");
            int palpite = input.nextInt();
            if(palpite == numeroSecreto){
                System.out.println("Parabéns! Você acertou o número!");
                acertou = true;
                break;
            } else {
                System.out.println("Número incorreto. Tente novamente.");
            }
        }
        if(!acertou){
            System.out.println("Suas tentativas acabaram. O número secreto era: " + numeroSecreto);
        }
    }
}
