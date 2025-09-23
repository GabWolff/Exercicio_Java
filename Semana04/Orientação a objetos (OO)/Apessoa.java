
public class Apessoa {

    String nome;
    int idade;
    double altura;

    public Apessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    void apresentacao() {
        System.out.println("Olá, meu nome é " + nome + ".");
        System.out.println("Eu tenho " + idade + " anos e " + altura + "m de altura");
    }
}
