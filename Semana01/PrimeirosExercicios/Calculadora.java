import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Entrada de numeros
            System.out.println("Digite o primeiro número:");
            double num1 = input.nextDouble();

            System.out.println("Digite o segundo número:");
            double num2 = input.nextDouble();

            // Menu das operações
            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");        
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Porcentagem");
            System.out.println("Opção: ");

            int opcao = input.nextInt();

            double resultado = 0;

            while (opcao < 1 || opcao > 5) {
                System.out.println("Opção inválida. Tente novamente.");
                System.out.println("Opção: ");
                opcao = input.nextInt();
            }
            //Verifica qual operação foi escolhida e realiza o calculo
            if (opcao == 1) {
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
            } else if (opcao ==2) {
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
            } else if (opcao == 3) {
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
            } else if (opcao == 4) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else if (opcao == 5) {
                resultado = (num1 * num2) /100;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Opção inválida");
            }
            System.out.println();
        
            System.out.println("Obrigado por usar a calculadora!");
        }
    }
}
