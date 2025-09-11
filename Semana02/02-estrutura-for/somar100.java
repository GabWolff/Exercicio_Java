
public class somar100 {

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        double media = (double) soma / 100;
        System.out.println("A soma de 1 até 100 é: " + media);
    }
}
