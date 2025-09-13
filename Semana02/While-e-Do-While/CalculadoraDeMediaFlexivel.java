
import java.util.Scanner;

public class CalculadoraDeMediaFlexivel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- 1. PREPARAÇÃO ---
        // Variáveis inicializadas antes do laço.
        double somaDasNotas = 0.0;
        int contadorDeNotas = 0;
        double notaDigitada; // Declarada fora para ser acessível na condição do 'while'.

        System.out.println("--- Calculadora de Média da Turma ---");
        System.out.println("Digite as notas (0 a 10). Para finalizar e calcular, digite -1.");

        // --- 2. O LAÇO ---
        // 'do-while' é ótimo aqui, pois sempre queremos pedir a primeira nota.
        do {
            System.out.print("Digite a nota: ");
            notaDigitada = input.nextDouble();

            // --- 3. A LÓGICA DE DECISÃO ---
            // Primeiro, checamos se é uma nota válida para ser somada.
            if (notaDigitada >= 0 && notaDigitada <= 10) {
                somaDasNotas += notaDigitada; // Soma o VALOR da nota.
                contadorDeNotas++;            // Incrementa o contador em 1.

                // Se não for uma nota válida, checamos se é o sinal para sair.
            } else if (notaDigitada == -1) {
                System.out.println("Finalizando a inserção de notas...");

                // Se não for nem válida nem o sinal de saída, é um erro.
            } else {
                System.out.println("Nota inválida! Por favor, insira um valor entre 0 e 10, ou -1 para sair.");
            }

            // A condição do laço: continue enquanto o usuário não digitar -1.
        } while (notaDigitada != -1);

        // --- 4. OS RESULTADOS ---
        System.out.println("\n--- Resultados Finais ---");

        // Verificação para evitar divisão por zero.
        // Se o usuário digitar -1 logo de cara, o contador será 0.
        if (contadorDeNotas > 0) {
            double media = somaDasNotas / contadorDeNotas;
            System.out.println("Foram digitadas " + contadorDeNotas + " notas válidas.");
            // Usando printf para formatar a média com 2 casas decimais.
            System.out.printf("A média da turma é: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        input.close(); // Boa prática: fechar o Scanner no final.
    }
}
