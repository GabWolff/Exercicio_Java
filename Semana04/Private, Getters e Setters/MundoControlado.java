
public class MundoControlado {

    public static void main(String[] args) {
        Pessoa2 pessoa4 = new Pessoa2("Gabriel", 25, 1.87);

        System.out.println("A idade inicial do Gabriel é: " + pessoa4.getIdade());

        // A forma correta de modificar a idade: usando o setter
        System.out.println("\nTentando mudar a idade para -30...");
        pessoa4.setIdade(-30); // O setter vai rejeitar este valor

        System.out.println("Tentando mudar a idade para 26...");
        pessoa4.setIdade(26); // O setter vai aceitar este valor

        // Verificando a idade final
        System.out.println("\nA idade final do Gabriel é: " + pessoa4.getIdade());

        System.out.println("\nApresentação final:");
        pessoa4.apresentar1();
    }
}
