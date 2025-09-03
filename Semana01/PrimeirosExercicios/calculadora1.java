import java.util.Scanner;

public class calculadora1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = input.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma dos dois números é: " + soma);
    }
}
