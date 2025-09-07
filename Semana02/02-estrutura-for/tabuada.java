import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aqui iremos fazer a tabuada :)");
        System.out.println("Digite um numero que queria ver a tabuada: ");
        int numero = input.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println( numero + " x " + i + " = " + resultado);
        }
    }
}
