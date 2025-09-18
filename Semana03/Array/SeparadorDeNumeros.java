
import java.util.Arrays;
import java.util.Scanner;

public interface SeparadorDeNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] todosOsNumeros = {10, -8, 25, -17, 0, 3, -1, 42, -99, 16};

        int contagemPostivios = 0;
        int contagemNegativos = 0;

        for (int numero : todosOsNumeros) {
            if (numero >= 0) {
                contagemPostivios++;
            } else {
                contagemNegativos++;
            }
        }

        System.out.println("numero positivos encontrados: " + contagemPostivios);
        System.out.println("Numeros negativos encntrado: " + contagemNegativos);

        int[] positivos = new int[contagemPostivios];
        int[] negativos = new int[contagemNegativos];

        int indicePositivos = 0;
        int indiceNegativos = 0;

        for (int numero : todosOsNumeros) {
            if (numero >= 0) {
                positivos[indicePositivos] = numero;
                indicePositivos++;
            } else {
                negativos[indiceNegativos] = numero;
                indiceNegativos++;
            }
        }

        System.out.println(Arrays.toString(positivos));
        System.out.println(Arrays.toString(negativos));
    }
}
