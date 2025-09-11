
import java.util.Scanner;

public class DesenhadorDeMolduras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a largura da moldura:");
        int largura = input.nextInt();

        System.out.println("Digite a altura da moldura:");
        int altura = input.nextInt();

        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j <= largura; j++) {
                if (i == 0 || i == altura || j == 0 || j == largura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
