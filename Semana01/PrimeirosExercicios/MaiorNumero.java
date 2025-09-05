
public class MaiorNumero {

    public static void main(String[] args) {
        int[] numeros = {5, 10, 3, 8, 2};
        int maior = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número do array é: " + maior);
    }
}
