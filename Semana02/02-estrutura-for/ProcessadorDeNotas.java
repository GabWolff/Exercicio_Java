
import java.util.Scanner;

// Crie um programa que processe as notas de uma turma. Primeiro, peça ao usuário para informar quantos alunos há na turma. Em seguida, usando um laço for, peça a nota de cada um dos alunos.
// Após ler todas as notas, o programa deve calcular e exibir:
// A média da turma.
// A maior nota digitada.
// A menor nota digitada.
public class ProcessadorDeNotas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos há na turma?");
        int NumeroDeAlunos = input.nextInt();

        double somaDasNotas = 0;
        double maiorNota = Double.NEGATIVE_INFINITY; // Inicializa com o menor valor possível
        double menorNota = Double.POSITIVE_INFINITY; // Inicializa com o maior valor possível
        for (int i = 0; i <= NumeroDeAlunos - 1; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            double nota = input.nextDouble();
            somaDasNotas += nota;

            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        double media = somaDasNotas / NumeroDeAlunos;
        System.out.println("A média da turma é: " + media);
        System.out.println("A maior nota digitada é: " + maiorNota);
        System.out.println("A menor nota digitada é: " + menorNota);

    }
}
