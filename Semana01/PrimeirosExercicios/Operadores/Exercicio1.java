package Operadores;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:  ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo numero inteiro:  ");
        int num2 = input.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = (double) num1 / num2; // conversão para evitar divisão inteira
        int resto = num1 % num2;

        System.out.println("A soma dos dois numeros é: " + soma);
        System.out.println("A subtração dos dois numeros é: " + subtracao);
        System.out.println("A multiplicação dos dois numeros é: " + multiplicacao);
        System.out.println("A divisão dos dois numeros é: " + divisao);
        System.out.println("O resto da divisão dos dois numeros é: " + resto);

        input.close();
    }
}
