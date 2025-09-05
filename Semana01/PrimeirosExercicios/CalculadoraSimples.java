
import java.util.Scanner;
//Calculadora Simples: Crie um programa que solicite dois números ao usuário e exiba a soma, subtração, multiplicação e divisão desses números.

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = input.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

    }
}
