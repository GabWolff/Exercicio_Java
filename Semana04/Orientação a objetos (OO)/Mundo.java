
public class Mundo {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Gabriel";
        pessoa1.idade = 25;
        pessoa1.altura = 1.87;

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Carol";
        pessoa2.idade = 29;
        pessoa2.altura = 1.60;

        System.out.println("--- Apresentação da Pessoa 1 ---");
        pessoa1.apresentar();

        System.out.println("--- Apresentação da pessoa 2 ---");
        pessoa2.apresentar();

    }
}
