
public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    private static int totalDeCarrosFabricados = 0;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

        totalDeCarrosFabricados++;
    }

    public static int getTotalDeCarrosFabricados() {
        return totalDeCarrosFabricados;
    }

    void exibirInfo() {
        System.out.println(this.marca + ", " + this.modelo + ", " + this.ano);
    }
}
