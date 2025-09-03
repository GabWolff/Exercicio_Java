
public class Exercicio4 {

    public static void main(String[] args) {
        int nota = 5;
        boolean passou;

        if (nota >= 7) {
            passou = true;
        } else {
            passou = false;
        }

        System.out.println("Nota: " + nota);
        System.out.println("Aprovado? " + passou);
    }
}
