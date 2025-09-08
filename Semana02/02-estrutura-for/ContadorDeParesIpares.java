import java.util.Scanner;

public class ContadorDeParesIpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 10 numeros para que possamos separar quais são pares e quais são impares.");

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++ ){
            System.out.println("Digite o " + i + "º numero: ");
            int num = input.nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de numeros pares: " + pares);
        System.out.println("Quantidade de numeros impares: " + impares);
    }

}
