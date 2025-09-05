
public class CalculoArray {

    public static void main(String[] args) {
        int[] numeros = {5, 10, 3, 8, 2};
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("A soma dos elementos do array é: " + soma);
    }
}
