
import java.util.Scanner;
//Conversor de Temperatura: Crie um programa que converta uma temperatura de Celsius para Fahrenheit. A fórmula é: F = C * 1.8 + 32.

public class Temeratura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        double Fahrenheit = celsius * 1.8 + 32;

        System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);

    }
}
