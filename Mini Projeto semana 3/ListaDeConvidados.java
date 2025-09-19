import java.util.Scanner;

public class ListaDeConvidados {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos convidados você deseja adicionar à lista?");
        int numeroDeConvidados = input.nextInt();

        String[] convidados = new String[numeroDeConvidados];
        input.nextLine(); // Consumir a quebra de linha pendente

        for(int i = 0; i < convidados.length; i++){
            System.out.print("Digite o nome do convidado " + (i + 1) + ":");
            convidados[i] = input.nextLine();
        }

        System.out.println("Lista de Convidados:");
        for(String convidado : convidados){
            System.out.println(convidado);
        }
    }
}

