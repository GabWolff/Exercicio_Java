
import java.util.Scanner;

public class BuscadorDeAluno {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = {"Ana", "João", "Maria", "Pedro", "Sofia"};
        boolean AlunoEncontrado = false;

        System.out.print("Digite o nome do Aluno que deseja buscar: ");
        String nomeBuscado = input.nextLine();

        for (String NomeAluno : nomes) {
            if (NomeAluno.equals(nomeBuscado)) {
                AlunoEncontrado = true;
            }
            break;
        }

        if (AlunoEncontrado) {
            System.out.println("Sim, o aluno(a) " + nomeBuscado + " está na lista!");
        } else {
            System.out.println("Não, o aluno(a) " + nomeBuscado + "Não esta na lista.");
        }
    }
}
