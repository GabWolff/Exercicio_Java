
public class Pessoa2 {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa2(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    void apresentar1() {
        System.out.println("Olá, meu nome é " + this.nome + "."); // Usar 'this' aqui é opcional, mas bom estilo
        System.out.println("Eu tenho " + this.idade + " anos e " + this.altura + "m de altura");
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade > 0 && novaIdade < 130) {
            this.idade = novaIdade;
        } else {
            System.out.println("Erro, idade invalida.");
        }
    }

    public void setAltura(double novaAltura) {
        if (novaAltura > 0.62 && novaAltura < 2.50) {
            this.altura = novaAltura;
        } else {
            System.out.println("Erro, altura invalida.");
        }
    }
}
